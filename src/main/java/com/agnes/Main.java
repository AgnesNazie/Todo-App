package com.agnes;

import java.time.LocalDate;

import static com.agnes.AppRole.ROLE_APP_ADMIN;
import static com.agnes.AppRole.ROLE_APP_USER;

public class Main{
    public static void main(String[] args) {
        // Create AppUser credentials
        AppUser creatorCredentials = new AppUser("agnes_user", "password123", ROLE_APP_USER);
        AppUser assigneeCredentials = new AppUser("mehrdad_user", "securePass",ROLE_APP_ADMIN);

        // Creating a Person object
        Person creator = new Person("Agnes", "Nazie", "agnes@example.com",creatorCredentials);
        Person assignee = new Person("Mehrdad", "Javan", "mehrdad@example.com",assigneeCredentials );
        // Creating a TodoItem object
        TodoItem task = new TodoItem("Assignments", "Todo IT 1", LocalDate.now().plusDays(1), creator);

        // Creating a TodoItemTask object
        TodoItemTask todoTask = new TodoItemTask(task, assignee);

        // Printing the summary
        System.out.println(todoTask);

        // Changing assignee to null
        todoTask.setAssignee(null);
        System.out.println("After removing assignee: " + todoTask);

        // Testing validation
        try {
            todoTask.setTodoItem(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}