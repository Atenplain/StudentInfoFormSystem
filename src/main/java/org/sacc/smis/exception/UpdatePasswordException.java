package org.sacc.smis.exception;

import org.sacc.smis.enums.UpdatePassword;

public class UpdatePasswordException extends Exception{
    private final UpdatePassword updatePassword;

    public UpdatePasswordException(UpdatePassword updatePassword){
        super(updatePassword.getResultMsg());
        this.updatePassword = updatePassword;
    }

    public UpdatePassword getUpdatePassword() {
        return updatePassword;
    }
}
