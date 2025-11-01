public class TaskList {

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(String description) {
        Node current = head;

        while (current != null) {
            if (current.task.getDescription().equals(description)) {
                current.task.markAsCompleted();
                return;
            }
            current = current.next;
        }
    }

    public void printAllTasks() {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }

        Node current = head;
        int position = 1;

        while (current != null) {
            String status = current.task.isCompleted() ? "[Done]" : "[Todo]";
            System.out.println(position + ". " + status + " " + current.task.getDescription());
            current = current.next;
            position++;
        }
    }
}
