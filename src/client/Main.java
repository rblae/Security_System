package client;

import actors.AlarmSystem;
import actors.Burglar;
import actors.Resident;
import canvas.Canvas;
import states.alarmSystemStates.AlarmSystemStateEmergency;
import states.residentStates.ResidentStateEmergency;

public class Main {

    private static void printCurrentStatus(Resident[] residents) {
        System.out.println("Es ist gerade zu Hause:");
        for (Resident resident : residents) {
            if (resident.getLocation() == Resident.locations.AT_HOME) {
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
                alarmSystem.setState(new AlarmSystemStateEmergency(AlarmSystem.getAlarmSystem()));
                alarmSystem.onTimeInterval();
                burglar.breakInHouse(residents);
                for (Resident resident : residents) {
                    resident.setState(new ResidentStateEmergency(resident));
                    resident.onTimeInterval();
                }
                break;
            }

            for (Resident resident : residents) {
                resident.onTimeInterval();
            }
            Canvas.drawHouse(alarmSystem.getResidentsAtHome());
            alarmSystem.onTimeInterval();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
