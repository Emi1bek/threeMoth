package PractikOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<User,BankAccount> user = new HashMap<>();
        user.put(new User("Name1","Surname1"),new BankAccount(10000));
        user.put(new User("Name2","Surname2"),new BankAccount(10000));
        user.put(new User("Name3","Surname3"),new BankAccount(10000));
        user.put(new User("Name4","Surname4"),new BankAccount(10000));
        user.put(new User("Name5","Surname5"),new BankAccount(10000));
        user.put(new User("Name6","Surname6"),new BankAccount(10000));
        user.put(new User("Name7","Surname7"),new BankAccount(10000));
        user.put(new User("Name8","Surname8"),new BankAccount(10000));
        user.put(new User("Name9","Surname9"),new BankAccount(10000));
        user.put(new User("Name10","Surname10"),new BankAccount(10000));


        for (Map.Entry<User,BankAccount> m : user.entrySet()) {
            System.out.println(m.getKey()+" Ж "+ m.getValue());

        }

        System.out.println(user.keySet());

   transaction(user.get("Name1"), ,1000);

    }

    public static void  transaction(Map<User, BankAccount> userBankAccountMap, User user, double var){

        userBankAccountMap.put(user,new BankAccount(var));

    }
}
