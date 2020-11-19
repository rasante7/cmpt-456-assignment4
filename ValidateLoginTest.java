import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateLoginTest {
    @Test
    public void validUsernamePassword(){
        String myUsername = "rachelasante01";
        String myPassword = "Password";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Success!",checkTest);
    }

    @Test
    public void invalidUsernameInvalidChar(){
        String myUsername = "rachel@asante";
        String myPassword = "Password";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Invalid character used.",checkTest);
    }

    @Test
    public void invalidUsernameTooShort(){
        String myUsername = "ray";
        String myPassword = "Password";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Username too short.",checkTest);
    }

    @Test
    public void invalidUsernameTooLong(){
        String myUsername = "Rachel.Asante.Username.Long";
        String myPassword = "Password";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Username too long.",checkTest);
    }

    @Test
    public void invalidPasswordNoUpperCase(){
        String myUsername = "rachelasante01";
        String myPassword = "password";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Password must contain at least 1 uppercase character.",checkTest);
    }

    @Test
    public void invalidPasswordTooLong(){
        String myUsername = "rachelasante01";
        String myPassword = "TooLongOfAPassWordTooLongOfAPassWord";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Password too long.",checkTest);
    }

    @Test
    public void invalidPasswordTooShort(){
        String myUsername = "rachelasante01";
        String myPassword = "Short";

        ValidateLogin test = new ValidateLogin(myUsername, myPassword);
        String checkTest = test.createNewUser();

        assertEquals("Password too short.",checkTest);
    }
}
