public class TaskManagerTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask("Testar adicionar tarefa");
        assert manager.getTasks().size() == 1 : "Falha ao adicionar tarefa";

        Task task = manager.getTasks().get(0);
        assert !task.isCompleted() : "Tarefa não deveria estar concluída";

        boolean completed = manager.completeTask(task.getId());
        assert completed : "Falha ao completar tarefa";
        assert task.isCompleted() : "Tarefa deveria estar concluída";

        boolean removed = manager.removeTask(task.getId());
        assert removed : "Falha ao remover tarefa";
        assert manager.getTasks().isEmpty() : "Lista de tarefas deveria estar vazia";

        System.out.println("Todos os testes passaram!");
    }
}