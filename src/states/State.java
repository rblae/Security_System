package states;

public abstract class State<E> {
    protected final E stateObject;

    public State(E that) {
        stateObject = that;
    }

    public abstract void onTimeInterval();
}
