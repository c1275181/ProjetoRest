package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Aluno;
import persistence.AlunoDao;

@Controller
public class AlunoController {
	
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public ModelAndView iniciar() {
		return new ModelAndView("index");
	}
	
	
	
	
	@RequestMapping(value="/cadastrar.html",method=RequestMethod.POST)
	public ModelAndView cadastrar(Aluno a) {
		ModelAndView mv= new ModelAndView("index");
		try {
			new AlunoDao().save(a);
			mv.addObject("msg","Dados Gravados do Aluno");
			
		}catch(Exception ex) {
			ex.getMessage();
			 mv.addObject("msg","Error :" + ex.getMessage());
		}
		return mv;
		
	}

	@RequestMapping(value="/listar.html",method=RequestMethod.GET)
	public ModelAndView  listar() {
		ModelAndView  mv= new ModelAndView("consulta");
		 try {
			 mv.addObject("lista",new AlunoDao().listaAluno());
			 
   	 }catch(Exception ex) {
		  ex.getMessage();	 
		 	 mv.addObject("msg","Error :" + ex.getMessage());
		 }
		return mv;
	}
 
	
}
