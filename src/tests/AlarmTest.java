package tests;

import actors.AlarmSystem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import states.alarmSystemStates.AlarmSystemStateEmergency;

public class AlarmTest {

    private static final AlarmSystem alarmSystem = AlarmSystem.getAlarmSystem();

    @BeforeAll
    public static void beforeAllTests() {
        alarmSystem.setState(new AlarmSystemStateEmergency(AlarmSystem.getAlarmSystem()));
    }

    @Test
    void burglaryFullHouse() {
        alarmSystem.setResidentsAtHome(4);
        System.out.println("\nSollte nichts tun");
        AlarmSystem.getAlarmSystem().onTimeInterval();
    }

    @Test
    void burglaryEmptyHouse() {
        alarmSystem.setResidentsAtHome(0);
        System.out.println("\nSollte Alarm auslösen und Polizei rufen");
        AlarmSystem.getAlarmSystem().onTimeInterval();
    }

    @Test
    void burglaryOneResident() {
        alarmSystem.setResidentsAtHome(1);
        System.out.println("\nSollte Polizei rufen");
        AlarmSystem.getAlarmSystem().onTimeInterval();
    }

    @Test
    void burglaryTwoResidents() {
        alarmSystem.setResidentsAtHome(2);
        System.out.println("\nSollte Polizei rufen");
        AlarmSystem.getAlarmSystem().onTimeInterval();
    }

    @Test
    void burglaryThreeResidents() {
        alarmSystem.setResidentsAtHome(3);
        System.out.println("\nSollte Polizei rufen");
        AlarmSystem.getAlarmSystem().onTimeInterval();
    }
}
