package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 25);
        userService.saveUser("Петр", "Петров", (byte) 30);
        userService.saveUser("Куртка", "Бейна", (byte) 28);
        userService.saveUser("Елена", "Летучая", (byte) 35);

//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();
    }
}
