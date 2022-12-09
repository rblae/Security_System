package states.residentStates;

import actors.Resident;
import states.State;

import java.util.Random;

public abstract class ResidentState extends State {
    protected Resident resident;
    protected Random random;

    public ResidentState(Resident resident) {
        this.resident = resident;
        random = new Random();
    }

    public abstract void onTimeInterval();
}
