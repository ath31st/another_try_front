package home.sweethome.atf.ecxeption;

public class UserServiceException extends RuntimeException{
  public UserServiceException(String message) {
    super(message);
  }
}
