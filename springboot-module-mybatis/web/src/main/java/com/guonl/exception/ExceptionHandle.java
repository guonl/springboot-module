package com.guonl.exception;

import com.guonl.vo.FrontResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guonl
 * Date: 2019-05-14 15:01
 * Description: 异常捕捉，页面显示
 */
@Slf4j
@ResponseBody
@ControllerAdvice
public class ExceptionHandle {

    /**
     * 业务层需要自己声明异常的情况
     */
    // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ValidateException.class)
    public FrontResult handleServiceException(ValidateException e) {
        log.error("参数校验失败 -->> {}", e.getErrorMsg());
        return FrontResult.error(e.getErrorCode(),e.getErrorMsg());
    }

}
