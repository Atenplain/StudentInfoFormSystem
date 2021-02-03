package org.sacc.smis.enums;

public enum Login {
    PASSWORD_IS_NULL(400,"密码为空")
    ,
    PASSWORD_IS_WRONG(400,"密码错误")
    ,
    ID_IS_NULL(400,"ID为空")
    ,
    ID_IS_NOT_EXIT(400,"ID不存在")
    ;

    private final Integer resultCode;
    private final String resultMsg;

    Login(Integer resultCode, String resultMsg) {
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
