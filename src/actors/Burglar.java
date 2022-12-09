package actors;

import states.residentStates.NotAtHome;
import states.residentStates.TrappedInBasement;

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
            System.out.println("Einbrecher: Geschafft!");
        } else {
            System.out.println("Einbrecher: Ich muss fliehen!");
        }
    }

    private boolean isSuccessful(Resident[] residents) {
        for (Resident resident : residents) {
            if (resident.getState().equals(NotAtHome.class.getSimpleName())) {
                return false;
            }
        }
        return true;
    }

    private void imprisonResidents(Resident[] residents) {
        for (Resident resident : residents) {
            resident.changeState(new TrappedInBasement(resident));
        }
    }
}
