package student;

import java.util.ArrayList;
import java.util.List;

public class ErpSystem {

    private List<User> memory = new ArrayList<>();

    public ErpSystem() {
    }

    public void addUser(User user) {
        memory.add(user);
    }

    public void printAllUsers() {
        for (User user: memory) {
            System.out.println(user.getUserData());
        }
    }

    public void printUser(int index) {
        System.out.println(memory.get(index).getUserData());
    }
}
