package actors;

import states.residentStates.AtHome;
import states.residentStates.ResidentState;

public class Resident {
    private final String name;
    private ResidentState state;
    private final AlarmSystem alarmSystem;

    public Resident(String name) {
        this.name = name;
        state = new AtHome(this);
        alarmSystem = AlarmSystem.getAlarmSystem();
    }

    public void onTimeInterval() {
        this.getState().onTimeInterval();
    }

    public void changeState(ResidentState state) {
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
}
