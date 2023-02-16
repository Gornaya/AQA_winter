package Task_Exeption;


import Task_Exeption.exceptions.WrongLoginException;
import Task_Exeption.exceptions.WrongPasswordException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LoginFormDTO user = new LoginFormDTO("user1_", "password1!", "password1!");

        try {
            SignUpCheck.loginCheck(user.getLogin());
            SignUpCheck.passwordCheck(user.getPassword(), user.getConfirmedPassword());
        } catch (WrongLoginException exceptions) {
            System.out.println(exceptions.getMessage());
            exceptions.printStackTrace();
        } catch (WrongPasswordException exceptions) {
            System.out.println(exceptions.getMessage());
            exceptions.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("True");

    }

}

