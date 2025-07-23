import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao TaskManager!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int op = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (op) {
                case 1 -> {
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    System.out.println("Tarefa adicionada!");
                }
                case 2 -> {
                    System.out.println("Tarefas:");
                    for (Task task : manager.getTasks()) {
                        System.out.println(task);
                    }
                }
                case 3 -> {
                    System.out.print("ID da tarefa para marcar como concluída: ");
                    int id = scanner.nextInt();
                    if (manager.completeTask(id)) {
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Tarefa não encontrada ou já concluída.");
                    }
                }
                case 4 -> {
                    System.out.print("ID da tarefa para remover: ");
                    int id = scanner.nextInt();
                    if (manager.removeTask(id)) {
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                }
                case 5 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}