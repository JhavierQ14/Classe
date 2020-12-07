package com.unab.desarollo.Springdata.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.desarollo.Springsata.DAO.PersonaDAO;

@Controller

public class ControladorInicio {
	
	@Autowired
	private PersonaDAO perDao;
	
	@GetMapping("/")
	public String Inicio() {
		
	  var MostrarPersonas = perDao.findAll();
				
				
		for (var iteracion:MostrarPersonas) {
			
			System.out.println(iteracion.getNombre());
		}		
	
		return "Index";
		
		
	}

}
