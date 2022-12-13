package actors;

import states.State;
import states.residentStates.ResidentStateDailyRoutine;

public class Resident {
    private final String name;
    private State<Resident> state;
    private final AlarmSystem alarmSystem;

    public enum locations {AT_HOME, NOT_AT_HOME, BASEMENT}

    private locations location = locations.AT_HOME;

    public Resident(String name) {
        this.name = name;
        state = new ResidentStateDailyRoutine(this);
        alarmSystem = AlarmSystem.getAlarmSystem();
    }

    public void onTimeInterval() {
        this.getState().onTimeInterval();
    }

    public void setState(State<Resident> state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public State<Resident> getState() {
        return state;
    }

    public AlarmSystem getAlarmSystem() {
        return alarmSystem;
    }

    public locations getLocation() {
        return location;
    }

    public void setLocation(locations location) {
        this.location = location;
    }
}
