package com.example.api.response;

public class Response <T> {
    private T result;
    private String message;
    private String statusCode;

    public Response(T result, String message, String statusCode) {
        this.result = result;
        this.message = message;
        this.statusCode = statusCode;
    }

    public Response() {
        super();
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Response{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
