package br.tec.abrindoportas.servidorpublicodbweb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.tec.abrindoportas.servidorpublicodbweb.entity.ServidorPublicoEntity;
import br.tec.abrindoportas.servidorpublicodbweb.service.ServidorPublicoService;

@RestController
public class ServidorPublicoController {
	private ServidorPublicoService servidorPublicoService;
	
	@Autowired
	public void setServidorPublicoService(ServidorPublicoService servidorPublicoService) {
		this.servidorPublicoService = servidorPublicoService;
	}
	
	@GetMapping("/listarServidores")
	  public String listarServidores(Model model)
	  {  
	    model.addAttribute("servidoresPublicos", servidorPublicoService.listAll());
	    return "servidoresPublicos";
	  }

	  @GetMapping("/listarServidor/{matricula}")
	  public String listarServidor(@PathVariable long matricula, Model model)
	  {    
	    model.addAttribute("servidorpublico", servidorPublicoService.listByMatricula(matricula));
	    return "servidorPublicoEntities";
	  }

	  @GetMapping("/excluirServidorPublico/{matricula}")
	  public String excluirServidorPublico(@PathVariable long matricula){
	    servidorPublicoService.delete(matricula);
	    return "redirect:/listarServidores";
	  }

	  @GetMapping("/formularioEditarrServidor/{matricula}")
	  public String formEditarServidor(@PathVariable long matricula, Model model) {
	    Optional<ServidorPublicoEntity> servidorPublicoEncontrado = servidorPublicoService.listByMatricula(matricula);
	    model.addAttribute("servidorpublico", servidorPublicoEncontrado);
	    return "editarServidorPublico";
	  }

	  @GetMapping("/editarServidor/{matricula}")
	  public String editarServidor(@ModelAttribute ServidorPublicoEntity servidorPublicoEntity) {
	    servidorPublicoService.update(servidorPublicoEntity);
	    return "editarServidorPublico";
	  }

	  @GetMapping("/formularioNovoServidor")
	  public String novoServidor(Model model) {
	    
	    model.addAttribute("servidorpublico", new ServidorPublicoEntity());
	    return "novoServidorPublico";
	  }

	  @PostMapping("/cadastrarServidor")
	  public String cadastrarServidor(@ModelAttribute ServidorPublicoEntity servidorPublicoEntity) {

	    Optional<ServidorPublicoEntity> servidorPublicoEncontrado = servidorPublicoService.listByMatricula(Long.parseLong(servidorPublicoEntity.getMatricula()));
	    if (servidorPublicoEncontrado.isPresent()) {
	      servidorPublicoService.save(servidorPublicoEntity);
	    }else{

	      return "redirect:/mensagem";
	    }
	    return "redirect:/listarServidores";
	  }
	  
	  @GetMapping("/mensagem")
	  public String mensagem(Model model) {
	      model.addAttribute("errorMatriculaExistente", true);
	      return "erro/mensagem";
	  }
}
