package actors;

import canvas.Canvas;

import java.util.Random;

public class Burglar {

    public boolean wantsToBreakIn(int i) {
        Random random = new Random();
        if (random.nextInt(24 - i) == 0) {
            System.out.println("Einbrecher: Ich breche ein!");
            return true;
        } else return false;
    }

    public void breakInHouse(Resident[] residents) {
        if (isSuccessful(residents)) {
            imprisonResidents(residents);
            Canvas.drawBurglar();
            System.out.println("Einbrecher: Geschafft!");
        } else {
            Canvas.drawPolice();
            System.out.println("Einbrecher: Ich muss fliehen!");
        }
    }

    private boolean isSuccessful(Resident[] residents) {
        for (Resident resident : residents) {
            if (resident.getLocation() == Resident.locations.NOT_AT_HOME) {
                return false;
            }
        }
        return true;
    }

    private void imprisonResidents(Resident[] residents) {
        for (Resident resident : residents) {
            resident.setLocation(Resident.locations.BASEMENT);
        }
    }
}
