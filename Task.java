public class Task {
    private static int count = 0;
    private final int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.id = ++count;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return String.format("Task #%d: %s [%s]", id, description, completed ? "Concluída" : "Pendente");
    }
}