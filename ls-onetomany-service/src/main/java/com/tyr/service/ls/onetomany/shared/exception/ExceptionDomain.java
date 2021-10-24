package com.tyr.service.ls.onetomany.shared.exception;

public class ExceptionDomain extends  RuntimeException{

    private static final long serialVersionUID = -12569745844589L;

    private final String code;


    public ExceptionDomain(String mensaje, String code){
        super(mensaje);
        this.code = code;
    }

    public String getCode(){
        return code;
    }

}
