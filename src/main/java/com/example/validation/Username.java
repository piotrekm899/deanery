package com.example.validation;

import javax.jws.soap.SOAPBinding;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LoginValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Username {

    public String valueS() default "S";
    public String valueT() default "T";

    public String message() default "must start with T or S";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};


}
