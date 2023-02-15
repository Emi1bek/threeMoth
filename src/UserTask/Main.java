package UserTask;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User(1,"Name",18);
        User user2 = new User(2,"Name1",18);
        User user3 = new User(3,"Name3",18);

        UserDao userDao = new UserDao();

        userDao.saveUser(user);
        userDao.saveUser(user2);
        userDao.saveUser(user3);

        System.out.println(userDao);

        System.out.println(userDao.searchByAge(1));
    }
}
