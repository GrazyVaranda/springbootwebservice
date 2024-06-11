package br.com.example;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LocalizacaoService {

    @GetMapping("/obtemlocal")
    public String obtemLocalizacao() {
        return "São Miguel Paulista";
    }

    @GetMapping("/obtemhora")
    public String obtemhora() {
        return LocalDateTime.now().toString();
    
    
   }
    @GetMapping("/obtemcoordenadas")
    public String obtemCoordenadas() {
        
        return "Latitude: A, Longitude: B";
    }

    @GetMapping("/obtemendereco")
    public String obtemendereco() {
        
        return "Endereço: Rua abc , Cidade São Paulo, Estado São Paulo";
    }

    @GetMapping("/obtempais")
    public String obtempais() {
       
        return "País: Brasil, Capital: São Paulo, População: 215,3 milhões";
    }
}