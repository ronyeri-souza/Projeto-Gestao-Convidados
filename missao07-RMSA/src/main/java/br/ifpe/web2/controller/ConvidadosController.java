package br.ifpe.web2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ifpe.web2.model.Convidado;
import br.ifpe.web2.repository.ConvidadosDAO;

@Controller
public class ConvidadosController {

	@Autowired
	private ConvidadosDAO convidadosDAO;

	@GetMapping("/convidados")
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("listaConvidados");

		mv.addObject("convidados", convidadosDAO.findAll());
		mv.addObject(new Convidado());
		return mv;
	}
	
	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		
		this.convidadosDAO.save(convidado);
		
	}
}
