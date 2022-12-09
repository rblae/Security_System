package states.residentStates;

import actors.Resident;

public class AtHome extends ResidentState {

    public AtHome(Resident resident) {
        super(resident);
    }

    public void onTimeInterval() {
        if (random.nextInt(4) == 0) {
            resident.changeState(new NotAtHome(resident));
            resident.getAlarmSystem().logOut();
            System.out.printf("%s: Ich verlasse das Haus!\n", resident.getName());
        }
    }
}
