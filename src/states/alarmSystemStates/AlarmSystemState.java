package states.alarmSystemStates;

import actors.AlarmSystem;
import states.State;

public abstract class AlarmSystemState extends State<AlarmSystem> {
    public AlarmSystemState(AlarmSystem alarmSystem) {
        super(alarmSystem);
    }
}
