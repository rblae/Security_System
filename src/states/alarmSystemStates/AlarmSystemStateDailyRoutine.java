package states.alarmSystemStates;

import actors.AlarmSystem;

public class AlarmSystemStateDailyRoutine extends AlarmSystemState {

    public AlarmSystemStateDailyRoutine(AlarmSystem that) {
        super(that);
    }

    public void onTimeInterval() {
        System.out.println("Alarmsystem: Alles in Ordnung!\n");
    }
}
