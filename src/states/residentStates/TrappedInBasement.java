package states.residentStates;

import actors.Resident;

public class TrappedInBasement extends ResidentState {

    public TrappedInBasement(Resident resident) {
        super(resident);
        System.out.printf("%s: Ich bin gefangen!\n", resident.getName());
    }

    public void onTimeInterval() {

    }
}
