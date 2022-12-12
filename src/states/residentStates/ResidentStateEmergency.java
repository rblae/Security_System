package states.residentStates;

import actors.Resident;

public class ResidentStateEmergency extends ResidentState {

    public ResidentStateEmergency(Resident resident) {
        super(resident);
    }

    public void onTimeInterval() {
        if (stateObject.getLocation() == Resident.locations.BASEMENT) {
            System.out.printf("%s: Ich bin gefangen!", stateObject.getName());
        }
    }
}
