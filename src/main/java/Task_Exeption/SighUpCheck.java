package Task_Exeption;

import Task_Exeption.exceptions.WrongLoginException;
import Task_Exeption.exceptions.WrongPasswordException;

final class SignUpCheck {

    private SignUpCheck() {
    }

    public static String loginCheck(String login) throws WrongLoginException {
        if (login.contains("_") & login.length() < 20) {
            return login;
        } else {
            throw new WrongLoginException(login + " is incorrect", "INCORRECT LOGIN");
        }
    }

    public static String passwordCheck(String password, String confirmPassword) throws WrongPasswordException {
        if (password.equals(confirmPassword) & password.contains("_") & password.contains("!") & password.length() < 20) {
            return password;
        } else {
            throw new WrongPasswordException(password + " is incorrect", "INCORRECT PASSWORD");
        }

    }
}
