package actors;

import states.actionStates.ActionState;
import states.actionStates.EmptyHouseActionState;
import states.actionStates.FullHouseActionState;
import states.actionStates.StandardActionState;

public class AlarmSystem {
    private int residentsAtHome;
    private static final int RESIDENTS_AT_START = 4;
    private static final int MAX_RESIDENTS = 4;
    private static final int MIN_RESIDENTS = 0;
    private ActionState state;
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

    public void emergency() {
        if (residentsAtHome == MIN_RESIDENTS) {
            state = new EmptyHouseActionState();
        } else if (residentsAtHome != MAX_RESIDENTS) {
            state = new StandardActionState();
        } else {
            state = new FullHouseActionState();
        }
        state.takeAction();
    }

    public static AlarmSystem getAlarmSystem() {
        return alarmSystem;
    }

    public void setResidentsAtHome(int residentsAtHome) {
        this.residentsAtHome = residentsAtHome;
    }

    public ActionState getState() {
        return state;
    }

    public int getResidentsAtHome(){
        return residentsAtHome;
    }
}
