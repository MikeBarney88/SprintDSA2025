public class User {
    private String name;
    private TaskList todoList;

    public User(String name) {
        this.name = name;
        this.todoList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        Task task = new Task(description);
        todoList.addTask(task);
    }

    public void markTaskAsCompleted(String description) {
        todoList.markTaskAsCompleted(description);
    }

    public void printAllTasks() {
        System.out.println("\n" + name + "'s Tasks:");
        todoList.printAllTasks();
    }
}

