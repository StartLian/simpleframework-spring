package com.jessica.entity.dto;

import lombok.Data;

//dto:datatransationObject

/**
 * 结果集类
 * @param <T>
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    //返回结果集
    private T data;
}
