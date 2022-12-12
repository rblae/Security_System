package actors;

import states.State;
import states.alarmSystemStates.AlarmSystemStateDailyRoutine;

public class AlarmSystem {
    private int residentsAtHome;
    private static final int RESIDENTS_AT_START = 4;
    private static final int MAX_RESIDENTS = 4;
    private static final int MIN_RESIDENTS = 0;
    private State<AlarmSystem> state = new AlarmSystemStateDailyRoutine(this);
    private static final AlarmSystem alarmSystem = new AlarmSystem(RESIDENTS_AT_START);

    private AlarmSystem(int residentsAtHome) {
        this.residentsAtHome = residentsAtHome;
    }

    public void logIn() {
        residentsAtHome++;
    }

    public void logOut() {
        residentsAtHome--;
    }

    public void onTimeInterval() {
        state.onTimeInterval();
    }

    public static AlarmSystem getAlarmSystem() {
        return alarmSystem;
    }

    public int getResidentsAtHome() {
        return residentsAtHome;
    }

    public void setResidentsAtHome(int residentsAtHome) {
        this.residentsAtHome = residentsAtHome;
    }

    public void setState(State<AlarmSystem> state) {
        this.state = state;
    }

    public int getMaxResidents() {
        return MAX_RESIDENTS;
    }

    public int getMinResidents() {
        return MIN_RESIDENTS;
    }
}
