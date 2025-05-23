package com.agnes;

import java.util.Objects;

public class TodoItemTask {
    //creates fields
    private static int sequencer = 0;
    private final int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //constructor

    public TodoItemTask(TodoItem todoItem, Person assignee) {
        this.id = ++sequencer;
        this.assigned = (assignee != null);
        setTodoItem(todoItem);
        setAssignee(assignee);
    }
    // getter for id

    public int getId() {
        return id;
    }
    // getter for assigned

    public boolean isAssigned() {
        return assigned;
    }
    //setter for assigned

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
    // getter for todoItem

    public TodoItem getTodoItem() {
        return todoItem;
    }
    //setter for todoItem

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null)
            throw new IllegalArgumentException("TodoItem cannot be null");
        this.todoItem = todoItem;
    }
    //getter for assignee

    public Person getAssignee() {
        return assignee;
    }
    // setter for assignee

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = (assignee != null);
    }
    // toString() without Person object (assignee)
    @Override
    public String toString() {
        return String.format("TodoItemTask{id=%d, assigned=%b, todoItemTitle='%s'}",
                id, assigned, todoItem != null ? todoItem.getTitle() : "None");
    }

    // equals() without Person object (assignee)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoItemTask)) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id &&
                assigned == that.assigned &&
                Objects.equals(todoItem, that.todoItem);
    }

    // hashCode() without Person object (assignee)
    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem);
    }
}

