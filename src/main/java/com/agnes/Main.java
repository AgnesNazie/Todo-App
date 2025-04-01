package com.agnes;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        // Creating a Person object
        Person creator = new Person("Agnes", "Nazie", "agnes@example.com");
        Person assignee = new Person("Mehrdad", "Javan", "mehrdad@example.com");

        // Creating a TodoItem object
        TodoItem task = new TodoItem("Assignments", "Todo IT 1", LocalDate.now(), creator);

        // Creating a TodoItemTask object
        TodoItemTask todoTask = new TodoItemTask(task, assignee);

        // Printing the summary
        System.out.println(todoTask.getSummary());

        // Changing assignee to null
        todoTask.setAssignee(null);
        System.out.println("After removing assignee: " + todoTask.getSummary());

        // Testing validation
        try {
            todoTask.setTodoItem(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}