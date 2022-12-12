package states.alarmSystemStates;

import actors.AlarmSystem;

public class AlarmSystemStateEmergency extends AlarmSystemState {

    public AlarmSystemStateEmergency(AlarmSystem that) {
        super(that);
    }

    @Override
    public void onTimeInterval() {
        if (stateObject.getResidentsAtHome() == stateObject.getMinResidents()) {
            System.out.println("Alarmsystem: Alarm! Alarm!\nHilfe! Polizei!");
        } else if (stateObject.getResidentsAtHome() != stateObject.getMaxResidents()) {
            System.out.println("Alarmsystem: Hilfe! Polizei!");
        } else {
            System.out.println("Alarmsystem: Ich mache nichts!");
        }
    }
}
