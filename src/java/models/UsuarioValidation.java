

package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class UsuarioValidation implements Validator {
    
    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
         return UsuarioBean.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        UsuarioBean usuario = (UsuarioBean)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Nombre", 
                "requiered.Nombre", 
                "El campo NOMBRE es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Correo", 
                "requiered.Correo", 
                "El campo CORREO es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Edad", 
                "requiered.Edad", 
                "El campo EDAD es obligatorio");
    
    } 
    
    
}

    

