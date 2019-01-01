package com.dayi.baseclient.entities;

public class ResultRespone {

    private String errorCode;

    private Boolean success;

    private String errorMsg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public void errorResult(String errorNo, String errorMsg){
        this.success = false;
        this.errorCode = errorNo;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode(){
        return errorCode;
    }

    public void setErrorCode(String errorCode){
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg){
        this.errorMsg = errorMsg;
    }

}
