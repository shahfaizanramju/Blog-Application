package com.blog.utility;

import java.util.Optional;

import org.springframework.http.HttpStatus;

public class ApiResponse {

    private HttpStatus status;
    private int status_code;
    private String message;
    private Optional<?> data;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Optional<?> getData() {
        return data;
    }

    public void setData(Optional<?> data) {
        this.data = data;
    }

}
