package com.niit.vhrend.exception;

import com.niit.vhrend.model.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-04-23 12:47
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLException.class)
    public RespBean sqlException(SQLException e) {
        if(e instanceof SQLIntegrityConstraintViolationException) {
            return RespBean.error("该数据有关联数据，操作失败!");
        }
        return RespBean.error("数据库异常，操作失败!");
    }
}