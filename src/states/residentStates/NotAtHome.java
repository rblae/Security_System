package states.residentStates;

import actors.Resident;

public class NotAtHome extends ResidentState {
    public NotAtHome(Resident resident) {
        super(resident);
    }

    public void onTimeInterval() {
        if (random.nextInt(4) == 0) {
            resident.changeState(new AtHome(resident));
            resident.getAlarmSystem().logIn();
            System.out.printf("%s: Ich komme nach Hause!\n", resident.getName());
        }
    }

}
