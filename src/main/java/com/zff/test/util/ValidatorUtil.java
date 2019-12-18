package com.zff.test.util;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author ZhouFufeng
 * @since 2019/12/16
 **/
public class ValidatorUtil {

    public static <T> void validate(T object, Class<?>... groups) {
        Validator validator = Validation.buildDefaultValidatorFactory()
                                        .getValidator();
        validator.validate(object, groups);
    }
}
