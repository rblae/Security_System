package client;

import actors.AlarmSystem;
import actors.Burglar;
import actors.Resident;
import canvas.Canvas;
import states.residentStates.AtHome;

public class Main {

    private static void printCurrentStatus(Resident[] residents) {
        System.out.println("Es ist gerade zu Hause:");
        for (Resident resident : residents) {
            if (resident.getState().equals(AtHome.class.getSimpleName())) {
                System.out.println(resident.getName());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Resident[] residents = {
                new Resident("Anna"),
                new Resident("Bernd"),
                new Resident("Clara"),
                new Resident("Doria")
        };
        Burglar burglar = new Burglar();
        AlarmSystem alarmSystem = AlarmSystem.getAlarmSystem();

        for (int i = 0; i < 24; i++) {
            System.out.printf("%d Uhr:\n", i + 1);
            if (burglar.wantsToBreakIn(i)) {
                printCurrentStatus(residents);
                alarmSystem.emergency();
                burglar.breakInHouse(residents);
                break;
            }
            for (Resident resident : residents) {
                resident.onTimeInterval();
            }
            Canvas.drawHouse(alarmSystem.getResidentsAtHome());
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
