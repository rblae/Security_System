package states.actionStates;

public class EmptyHouseActionState extends ActionState {

    public void takeAction() {
        System.out.println("Alarmsystem: Alarm! Alarm!\nHilfe! Polizei!");
    }
}
