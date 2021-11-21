package com.tyr.service.ls.pagingsorting.shared.exception.domain;

public class ErrorMessage {

    private String message;

    private String code;

    private String date;

    public ErrorMessage(String message,String code, String date){
        this.message = message;
        this.code = code;
        this.date = date;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }




}
