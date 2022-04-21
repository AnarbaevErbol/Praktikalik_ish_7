package peaksoft;

import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
//       userService.createUsersTable();
//       userService.saveUser("Erbol", "Anarbaev",(byte) 20);
//       userService.saveUser("Edil", "Munarbekov",(byte) 18);
//       userService.saveUser("Aziz", "Kerimov",(byte) 23);
//       userService.saveUser("Asan", "Taalaybekov",(byte) 19);
        userService.getAllUsers().forEach(System.out::println);
        //userService.cleanUsersTable();
        //userService.dropUsersTable();
       System.out.println(userService.existsByFirstName("Edil" +
               ""));
    }
}
