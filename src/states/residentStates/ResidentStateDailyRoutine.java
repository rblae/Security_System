package states.residentStates;

import actors.Resident;
import states.State;

import java.util.Random;

public class ResidentStateDailyRoutine extends State<Resident> {

    public ResidentStateDailyRoutine(Resident resident) {
        super(resident);
    }

    @Override
    public void onTimeInterval() {
        Random random = new Random();

        if (random.nextInt(4) == 0) {
            if (stateObject.getLocation() == Resident.locations.AT_HOME) {
                stateObject.setLocation(Resident.locations.NOT_AT_HOME);
                stateObject.getAlarmSystem().logOut();
                System.out.printf("%s: Ich verlasse das Haus!\n", stateObject.getName());
            } else {
                stateObject.setLocation(Resident.locations.AT_HOME);
                stateObject.getAlarmSystem().logIn();
                System.out.printf("%s: Ich komme nach Hause!\n", stateObject.getName());
            }
        }
    }
}
