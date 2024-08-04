class UserAlreadyExistsException extends Exception{

    UserAlreadyExistsException(String str){
        super(str);
    }
}
class UserNotFoundException extends Exception{
    UserNotFoundException(String str){
        super(str);
    }
}
class ThrowAndThrows{
    void registerUser(String username) throws UserAlreadyExistsException {
        if(username.equals("username"))
            throw new  UserAlreadyExistsException("User Already Exists");
    }
    void checkUserExistence(String username) throws UserNotFoundException {
        if(username.equals("username"))
            throw new UserNotFoundException("User not found");
    }
}
public class UserService {

    public static void main(String[] args) throws UserAlreadyExistsException {
       ThrowAndThrows funct=new ThrowAndThrows();
        try {
            funct.registerUser("username");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {

            funct.checkUserExistence("username");
        }catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
