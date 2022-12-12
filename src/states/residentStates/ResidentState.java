package states.residentStates;

import actors.Resident;
import states.State;

import java.util.Random;

public abstract class ResidentState extends State<Resident> {
    protected Random random;

    public ResidentState(Resident resident) {
        super(resident);
        random = new Random();
    }
}
