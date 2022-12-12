package actors;

import states.residentStates.ResidentState;
import states.residentStates.ResidentStateDailyRoutine;

public class Resident {
    private final String name;
    private ResidentState state;
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

    public void setState(ResidentState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public ResidentState getState() {
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
