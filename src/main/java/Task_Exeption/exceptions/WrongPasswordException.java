package Task_Exeption.exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException {

    private String message;
    private String title;

    public WrongPasswordException(String message, String title) {
        this.message = message;
        this.title = title;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }
}
