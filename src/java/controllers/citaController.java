package controllers;

import models.CitaBean;
import models.citaValidation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
@Controller
public class citaController {
    citaValidation citValidar;

    /**
     *
     */
    public citaController () {
        this.citValidar = new citaValidation();
    }
    
    /**
     *
     * @return
     */
    @RequestMapping (value= "AgendarCita.htm", method= RequestMethod.GET) 
    
    public ModelAndView cita () {
        return new ModelAndView ("views/AgendarCita", "cita", new CitaBean());
    
}

    /**
     *
     * @param cita
     * @param result
     * @param status
     * @return
     */
    @RequestMapping (value="AgendarCita.htm", method = RequestMethod.POST)
public ModelAndView verCita (
    @ModelAttribute ("cita") CitaBean cita, 
    BindingResult result,
    SessionStatus status) {
  this.citValidar.validate(cita, result);
  if (result.hasErrors ()) {
      ModelAndView mav =  new ModelAndView();
      mav.addObject("cita", new CitaBean());
      mav.setViewName ("views/AgendarCita");
      return mav;
  }
  else {
      ModelAndView mav = new ModelAndView ();
      mav.addObject("nombre", cita.getNombre());
      mav.addObject("ident", cita.getIdent());
      mav.addObject("fecha", cita.getFecha ());
      mav.addObject("tipo", cita.getTipo ());
      
      mav.setViewName("views/vistaCita");
          return mav;
    }
    }
}  
