package com.guonl.exception;

import org.springframework.validation.BindingResult;

/**
 * Created by guonl
 * Date: 2019-05-14 14:57
 * Description: 页面校验异常处理
 */
public class ValidateException extends RuntimeException {

    private int errorCode;

    private String errorMsg;

    //校验错误构造器
    public ValidateException(int errorCode, BindingResult result) {
        this.errorCode = errorCode;
        if (result != null && !result.getAllErrors().isEmpty()) {
            errorMsg = result.getAllErrors().get(0).getDefaultMessage();
        }
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
