package states.alarmSystemStates;

import actors.AlarmSystem;
import states.State;

public class AlarmSystemStateDailyRoutine extends State<AlarmSystem> {

    public AlarmSystemStateDailyRoutine(AlarmSystem that) {
        super(that);
    }

    public void onTimeInterval() {
        System.out.println("Alarmsystem: Alles in Ordnung!\n");
    }
}
