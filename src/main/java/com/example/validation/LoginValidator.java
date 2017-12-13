package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator implements ConstraintValidator<Username,String> {

    private String usernameS;
    private String usernameT;

    @Override
    public void initialize(Username constraintAnnotation) {
        usernameS = constraintAnnotation.valueS();
        usernameT = constraintAnnotation.valueT();

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (s != null) {
            if (s.startsWith(usernameS) || s.startsWith(usernameT)) {
                result = true;
            } else result = false;
        } else result = true;

        return result;
    }
}
