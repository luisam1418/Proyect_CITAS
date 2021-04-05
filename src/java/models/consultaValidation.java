

package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class consultaValidation implements Validator {
    
    /**
     *
     * @param type
     * @return
     */
    @Override
    public boolean supports(Class<?> type) {
         return consultaBean.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o
     * @param errors
     */
    @Override
    public void validate(Object o, Errors errors) {
        consultaBean consulta = (consultaBean)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "NombreDoctor", 
                "requiered.NombreDoctor", 
                "El campo NOMBRE DOCTOR es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "TipoExamen", 
                "requiered.TipoExamen", 
                "El campo TIPO EXAMEN es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "Consultorio", 
                "requiered.Consultorio", 
                "El campo CONSULTORIO es obligatorio");
    
    } 
    
    
}

    

