package home.sweethome.atf.service;

import home.sweethome.atf.ecxeption.UserServiceException;
import home.sweethome.atf.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class UserService {
  private final List<User> users = new ArrayList<>();

  public void saveNewUser(User user) {
    users.add(user);
  }

  public void addUsers(List<User> userList) {
    users.addAll(userList);
  }

  public User getUser(String username) {
    return users.stream()
        .filter(u -> u.getUsername().equals(username))
        .findFirst()
        .orElse(new User());
  }

  public void register(User userData) {
    isUserExist(userData.getUsername());

    users.add(userData);
  }

  private void isUserExist(String username) {
    Optional<User> user = users.stream()
        .filter(u -> u.getUsername().equals(username.trim()))
        .findFirst();

    if (user.isPresent()) {
      throw new UserServiceException("User with credentials: " + username
          + " already exists");
    }
  }
}
