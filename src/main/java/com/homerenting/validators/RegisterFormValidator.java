package com.homerenting.validators;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.contacts.EmailContact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Arthur on 14/04/14.
 */
public class RegisterFormValidator implements Validator {

    public static final String COMPONENT_NAME = "registerFormValidator";

    private static final Logger slf4jLogger = LoggerFactory.getLogger(RegisterFormValidator.class);

    /**
     * Can this {@link org.springframework.validation.Validator} {@link #validate(Object, org.springframework.validation.Errors) validate}
     * instances of the supplied {@code clazz}?
     * <p>This method is <i>typically</i> implemented like so:
     * <pre class="code">return Foo.class.isAssignableFrom(clazz);</pre>
     * (Where {@code Foo} is the class (or superclass) of the actual
     * object instance that is to be {@link #validate(Object, org.springframework.validation.Errors) validated}.)
     *
     * @param clazz the {@link Class} that this {@link org.springframework.validation.Validator} is
     *              being asked if it can {@link #validate(Object, org.springframework.validation.Errors) validate}
     * @return {@code true} if this {@link org.springframework.validation.Validator} can indeed
     * {@link #validate(Object, org.springframework.validation.Errors) validate} instances of the
     * supplied {@code clazz}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(UserShortProfile.class);
    }

    /**
     * Validate the supplied {@code target} object, which must be
     * of a {@link Class} for which the {@link #supports(Class)} method
     * typically has (or would) return {@code true}.
     * <p>The supplied {@link org.springframework.validation.Errors errors} instance can be used to report
     * any resulting validation errors.
     *
     * @param target the object that is to be validated (can be {@code null})
     * @param errors contextual state about the validation process (never {@code null})
     * @see org.springframework.validation.ValidationUtils
     */
    @Override
    public void validate(Object target, Errors errors) {

        slf4jLogger.info("==void validate(Object target, Errors errors)==");

        UserShortProfile userShortProfile = (UserShortProfile)target;

        if (userShortProfile.getEmail() == null || userShortProfile.getEmail().length() == 0) {
            errors.rejectValue("email", "error.empty.field", "empty email from");
        }

        if (userShortProfile.getPassword() == null || userShortProfile.getPassword().length() == 0) {
            errors.rejectValue("name", "error.empty.field", "empty name");
        }
    }
}
