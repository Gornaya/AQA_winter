package Task_Exeption.exceptions;

import Task_Exeption.LoginFormDTO;

import java.io.IOException;

public class WrongLoginException extends IOException {
    private String message;
    private String title;

    public WrongLoginException(String message, String title) {
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

