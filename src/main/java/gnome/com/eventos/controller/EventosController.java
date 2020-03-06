/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnome.com.eventos.controller;

import gnome.com.eventos.util.RespuestaDto;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@RestController
public class EventosController {
    
        //JSON
        @RequestMapping("/hola")
	public @ResponseBody RespuestaDto<String> holaMundo() {
            RespuestaDto respuesta = new RespuestaDto();
            respuesta.setCodigo(0);
            respuesta.setResultado("Hola Mundo");
            
            return respuesta;
        }
    
}
