package br.com.example;

      import org.springframework.web.bind.annotation.GetMapping;
	  import org.springframework.web.bind.annotation.RestController;

	  @RestController
	  public class LocalizacaoService {

	   @GetMapping("obtemlocal") public String obtemlocalizacao() {
	   return "São Miguel Paulista";

	  }

	 }

