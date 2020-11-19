public class ValidateLogin {
    private String username;
    private String password;
    private String email;
    private int UID;

   public ValidateLogin(String u, String p){
        username = u;
        password = p;
        email = "";
        UID = 0;
    }

    public String createNewUser(){
        String checkUsername;
        String checkPassword;

        checkUsername = checkUsername();
        checkPassword = checkPassword();

        // return to user whether successful or error
        if(checkPassword == "Success!" && checkUsername == "Success!")
            return "Success!";
        else if(checkPassword != "Success!")
            return checkPassword;
        else
            return checkUsername;
    }

    private String checkUsername(){
        if(username.length() < 8){ // check length of username
            return "Username too short.";
        }
        else if(username.length() > 25){
            return "Username too long.";
        }
        // check for invalid characters
        else if(username.indexOf('!') != -1 || username.indexOf('?') != -1 || username.indexOf('@') != -1 || username.indexOf('&') != -1){
            return "Invalid character used.";
        }
        return "Success!";
    }

    private String checkPassword(){
        boolean upperCase = false;

        if(password.length() < 8){ // check length of password
            return "Password too short.";
        }
        else if(password.length() > 20){
            return "Password too long.";
        }
        // check if there is any capitalization for maximum security
        for (int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                upperCase = true;
            }
        }
        if(upperCase == false){
            return "Password must contain at least 1 uppercase character.";
        }
        return "Success!";
    }

}
