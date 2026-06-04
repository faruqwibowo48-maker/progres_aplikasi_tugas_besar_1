package pyscare;

import java.util.ArrayList;

public class AuthService {

    private ArrayList<User> users = new ArrayList<>();

    public AuthService() {
        // dummy user (nanti bisa diganti dari database)
        users.add(new User("admin", "1234"));
        users.add(new User("dokter", "1111"));
    }

    public boolean login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) &&
                u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}