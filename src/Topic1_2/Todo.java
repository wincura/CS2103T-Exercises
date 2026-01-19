package Topic1_2;

public class Todo extends Task {
    // Declaration of subclass that inherits from superclass
    private boolean isDone;

    // Usage of superclass constructor
    public Todo(String description) {
        super(description);
        this.isDone = false;
    }

    // Getter and Setter methods
    public boolean isDone() {
        return this.isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}
