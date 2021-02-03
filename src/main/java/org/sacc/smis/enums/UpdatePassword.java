package org.sacc.smis.enums;

public enum UpdatePassword {

    ORIGINAL_PASSWORD_WRONG(400,"原密码错误"),
    ID_IS_NOT_EXIT(400,"ID不存在")
    ;

    private final Integer resultCode;
    private final String resultMsg;

    UpdatePassword(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }
}
