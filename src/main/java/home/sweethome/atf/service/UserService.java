package home.sweethome.atf.service;

import home.sweethome.atf.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final List<User> users = new ArrayList<>();

    {
        users.add(new User("Lom", "Pavel", "Lomov"));
        users.add(new User("Kenny", "Ken", "Komma"));
        users.add(new User("Omm", "Lorry", "Physics"));
    }

    public String saveNewUser(User user) {
        users.add(user);
        return "User " + user.getUsername() + " successfully added!";
    }

    public List<User> getUsers() {
        return users;
    }

}
