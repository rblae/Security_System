package states.residentStates;

import actors.Resident;
import states.State;

public class ResidentStateEmergency extends State<Resident> {

    public ResidentStateEmergency(Resident resident) {
        super(resident);
    }

    public void onTimeInterval() {
        if (stateObject.getLocation() == Resident.locations.BASEMENT) {
            System.out.printf("%s: Ich bin gefangen!", stateObject.getName());
        }
    }
}
