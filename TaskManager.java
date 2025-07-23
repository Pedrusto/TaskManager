import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public boolean completeTask(int id) {
        Optional<Task> task = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (task.isPresent() && !task.get().isCompleted()) {
            task.get().complete();
            return true;
        }
        return false;
    }

    public boolean removeTask(int id) {
        return tasks.removeIf(t -> t.getId() == id);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}