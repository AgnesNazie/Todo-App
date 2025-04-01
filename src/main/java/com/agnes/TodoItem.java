package com.agnes;

import java.time.LocalDate;
import java.util.UUID;

public class TodoItem {
    //creates fields
    private static int sequencer = 0;
    private int id;
    String title;
    String taskDescription;
    LocalDate deadLine;
    boolean done;
    Person creator;

    //constructor

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if (title == null || title.trim().isEmpty() ||
                deadLine == null ||
                creator == null) {
            throw new IllegalArgumentException("Fields are required");
        }
        this.id = ++sequencer;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = false;
        this.creator = creator;
    }
    // getters for id

    public int getId() {
        return id;
    }
    // getters for title

    public String getTitle() {
        return title;
    }
    // setters for title

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty())
            this.title = title;
    }
    //getters for taskDescription

    public String getTaskDescription() {
        return taskDescription;
    }
    // setters for taskDescription

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    //getters for deadline

    public LocalDate getDeadLine() {
        return deadLine;
    }
    //setters for deadline

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine != null)
            this.deadLine = deadLine;
    }
    // set for done

    public void setDone(boolean done) {
        this.done = done;
    }
    // getters for is done

    public boolean isDone() {
        return done;
    }
    // getters for creator

    public Person getCreator() {
        return creator;
    }
    // setters for creator

    public void setCreator(Person creator) {
        if (creator != null)
            this.creator = creator;
    }

    //check if task is overdue
    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadLine);
    }

    // Summary using StringBuilder
    public String getSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("ID: ").append(id)
                .append(", Title: ").append(title)
                .append(", Description: ").append(taskDescription)
                .append(", Deadline: ").append(deadLine)
                .append(", Done: ").append(done)
                .append(", Creator: ").append(creator.getFirstName()).append(" ").append(creator.getLastName());
        return summary.toString();
    }

    @Override
    public String toString() {
        return getSummary();
    }
}
