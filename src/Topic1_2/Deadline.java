package Topic1_2;

public class Deadline extends Todo {
    // Declaration of subclass that inherits from superclass
    private String by;

    // Usage of superclass constructor
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    // Getter and Setter methods
    public String getBy() {
        return this.by;
    }

    public void setBy(String by) {
        this.by = by;
    }

}
