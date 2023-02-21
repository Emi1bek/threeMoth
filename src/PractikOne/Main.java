package PractikOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<User,BankAccount> user = new HashMap<>();


        for (Map.Entry<User,BankAccount> m : user.entrySet()) {
            System.out.println(m.getKey()+" Ж "+ m.getValue());

        }

        System.out.println(user.keySet());

   //transaction((user.get("Name1"),BankAccount), new User("Name22","surname122") ,1000);

    }

    public static void  transaction(Map<User, BankAccount> userBankAccountMap, User user, double var){

        userBankAccountMap.put(user,new BankAccount(var));

    }
}
