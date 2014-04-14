package com.homerenting.mvc;

import com.homerenting.domain.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Arthur on 14/04/14.
 */
public class LoginFormValidator  implements Validator {
    /**
     * Can this {@link org.springframework.validation.Validator} {@link #validate(Object, Errors) validate}
     * instances of the supplied {@code clazz}?
     * <p>This method is <i>typically</i> implemented like so:
     * <pre class="code">return Foo.class.isAssignableFrom(clazz);</pre>
     * (Where {@code Foo} is the class (or superclass) of the actual
     * object instance that is to be {@link #validate(Object, Errors) validated}.)
     *
     * @param clazz the {@link Class} that this {@link org.springframework.validation.Validator} is
     *              being asked if it can {@link #validate(Object, Errors) validate}
     * @return {@code true} if this {@link org.springframework.validation.Validator} can indeed
     * {@link #validate(Object, Errors) validate} instances of the
     * supplied {@code clazz}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(User.class);
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

        User loginData = (User)target;

        if (loginData.getEmail() == null || loginData.getEmail().length() == 0) {
            errors.rejectValue("email", "error.empty.field", "empty email");
        }

        if (loginData.getPassword() == null || loginData.getPassword().length() == 0) {
            errors.rejectValue("password", "error.empty.field", "empty password");
        }
    }
}
