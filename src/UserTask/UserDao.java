package UserTask;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> arrayList = new ArrayList<>();



    public void saveUser(User user){
        arrayList.add(new User(user.getId(), user.getName(), user.getAge()));
        System.out.println("User dobavleno!");
    }

    public User searchByAge(int id){
        for (User user: arrayList) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "UserDao{" +
                "arrayList=" + arrayList +
                '}';
    }
}
