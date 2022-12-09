package tests;

import actors.AlarmSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import states.actionStates.EmptyHouseActionState;
import states.actionStates.FullHouseActionState;
import states.actionStates.StandardActionState;

public class AlarmTest {

    AlarmSystem alarmSystem = AlarmSystem.getAlarmSystem();

    @Test
    void burglaryFullHouse() {
        alarmSystem.setResidentsAtHome(4);
        AlarmSystem.getAlarmSystem().emergency();
        Assertions.assertEquals(FullHouseActionState.class.getSimpleName(), AlarmSystem.getAlarmSystem().getState().getClass().getSimpleName());
    }

    @Test
    void burglaryEmptyHouse() {
        alarmSystem.setResidentsAtHome(0);
        AlarmSystem.getAlarmSystem().emergency();
        Assertions.assertEquals(EmptyHouseActionState.class.getSimpleName(), AlarmSystem.getAlarmSystem().getState().getClass().getSimpleName());
    }

    @Test
    void burglaryOneResident() {
        alarmSystem.setResidentsAtHome(1);
        AlarmSystem.getAlarmSystem().emergency();
        Assertions.assertEquals(StandardActionState.class.getSimpleName(), AlarmSystem.getAlarmSystem().getState().getClass().getSimpleName());
    }

    @Test
    void burglaryTwoResidents() {
        alarmSystem.setResidentsAtHome(2);
        AlarmSystem.getAlarmSystem().emergency();
        Assertions.assertEquals(StandardActionState.class.getSimpleName(), AlarmSystem.getAlarmSystem().getState().getClass().getSimpleName());
    }

    @Test
    void burglaryThreeResidents() {
        alarmSystem.setResidentsAtHome(3);
        AlarmSystem.getAlarmSystem().emergency();
        Assertions.assertEquals(StandardActionState.class.getSimpleName(), AlarmSystem.getAlarmSystem().getState().getClass().getSimpleName());
    }
}
