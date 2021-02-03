package org.sacc.smis.exception;

import lombok.Getter;
import org.sacc.smis.enums.Login;

@Getter
public class LoginException extends Exception {
    private final Login login;

    public LoginException(Login login) {
        super(login.getResultMsg());
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }
}
