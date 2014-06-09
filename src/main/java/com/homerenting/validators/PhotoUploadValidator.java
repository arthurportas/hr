package com.homerenting.validators;

import com.homerenting.domain.PhotoUpload;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Arthur on 08/06/14.
 */
public class PhotoUploadValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return PhotoUpload.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "title", "title.empty");
        PhotoUpload pu = (PhotoUpload) obj;
        if (pu.getFile() == null || pu.getFile().isEmpty()) {
            if (!pu.validSignature()) {
                e.rejectValue("signature", "signature.mismatch");
            }
        }
    }
}
