package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import modelo.Notification;
import modelo.Seguridad;
import service.LoggerService;



@RestController
@RequestMapping("/logger")
public class LoggerController {

	@Autowired
	LoggerService service;
	
	@PostMapping(value="addlogueo",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String guardarLogueo(@RequestBody Seguridad seguridad) {		
		return service.guardarLogueUsuario(seguridad);
	}
	
	@PostMapping(value="updatelogueo",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String actualizarLogueo(@RequestBody Seguridad seguridad) {		
		return service.actualizarLogin(seguridad);
	}
	
	@PostMapping(value="notification",produces=MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
	@ResponseStatus(HttpStatus.CREATED)
	public String guardarNotificacion(@RequestBody String datos) {		
		return service.guardarEjecucionEstadoPago(datos);
	}
	
}
