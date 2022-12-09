package states;

public abstract class State {

    public boolean equals(String that) {
        return this.getClass().getSimpleName().equals(that);
    }
}
