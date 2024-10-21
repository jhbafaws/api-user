package com.neoris.jba.apiuser.infrastructure.validation.anotations;

import com.neoris.jba.apiuser.infrastructure.validation.PasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "Password must contain numbers, uppercase and lowercase letters, some character (@$!%*?&) and a minimum length of 8.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}


