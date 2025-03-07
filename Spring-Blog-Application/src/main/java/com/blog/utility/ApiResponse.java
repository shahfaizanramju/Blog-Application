package com.blog.utility;

import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private HttpStatus status;
    private int status_code;
    private String message;
    private ArrayList<?> data;

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

    public ArrayList<?> getData() {
        return data;
    }

    public void setData(ArrayList<?> data) {
        this.data = data;
    }

}
