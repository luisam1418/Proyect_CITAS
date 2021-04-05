

package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class citaValidation implements Validator {
    
    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
         return CitaBean.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        CitaBean cita = (CitaBean)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Nombre", 
                "requiered.Nombre", 
                "El campo NOMBRE es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Ident", 
                "requiered.Ident", 
                "El campo NUMERO DE IDENTIFICACIÓN es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Fecha", 
                "requiered.Fecha", 
                "El campo FECHA es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Tipo", 
                "requiered.Tipo", 
                "El campo TIPO es obligatorio");
    
    } 
    
    
}
