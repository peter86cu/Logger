package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import dao.LoggerDao;
import modelo.Notification;
import modelo.Seguridad;





@Service
public class LoggerServiceImpl implements LoggerService {

	private static final String RESULTADO_OK="Datos guardado ok.";
	private static final String RESULTADO_NOK="A ocurrido un error guardando los datos. Intente de nuevo.";
	
	@Autowired
	LoggerDao daoSeguridad;
	
	

	@Override
	public String guardarLogueUsuario(Seguridad seguridad) {
		if (daoSeguridad.recuperarLoggeo(seguridad.getId()) == null) {			
			daoSeguridad.registrarLogueoUsuario(seguridad);			
			return RESULTADO_OK;
		}
		return RESULTADO_NOK;
	}

	

	@Override
	public String actualizarLogin(Seguridad seguridad) {
		if (daoSeguridad.recuperarLoggeo(seguridad.getId()) != null) {			
			daoSeguridad.registrarLogueoUsuario(seguridad);			
			return RESULTADO_OK;
		}
		return RESULTADO_NOK;
	}



	@Override
	public String guardarEjecucionEstadoPago(String noti) {
		    Notification request = new Gson().fromJson(noti, Notification.class);		
			daoSeguridad.registarLogNotification(request);			
			return RESULTADO_OK;
		
	}
}
