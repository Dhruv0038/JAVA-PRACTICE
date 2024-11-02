import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addItem("Buy groceries");
        todoList.addItem("Do laundry");
        todoList.addItem("Clean the house");

        todoList.displayList();

        todoList.markCompleted(1);
        todoList.removeItem(2);

        System.out.println("\nAfter marking item 1 as completed and removing item 2:");
        todoList.displayList();
    }
}

class TodoItem {
    private String task;
    private boolean completed;

    public TodoItem(String task) {
        this.task = task;
        this.completed = false;
    }

    // Getters and setters
    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

class TodoList {
    private List<TodoItem> items;

    public TodoList() {
        items = new ArrayList<>();
    }

    public void addItem(String task) {
        items.add(new TodoItem(task));
    }

    public void markCompleted(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).setCompleted(true);
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }

    public void displayList() {
        for (int i = 0; i < items.size(); i++) {
            TodoItem item = items.get(i);
            System.out.println(i + ": " + item.getTask() +
                    (item.isCompleted() ? " (Completed)" : ""));
        }
    }
}

