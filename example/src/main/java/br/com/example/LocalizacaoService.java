package br.com.example;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String obtemCoordenadas(@RequestParam(value = "latitude", defaultValue = "0.0") String latitude,
                                   @RequestParam(value = "longitude", defaultValue = "0.0") String longitude) {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }

    @GetMapping("/obtemendereco/{rua}/{numero}")
    public String obtemendereco(@PathVariable String rua, @PathVariable String numero) {
        return "Endereço: Rua " + rua + " n° " + numero + ", Cidade São Paulo, Estado São Paulo";
    }

    @GetMapping("/obtempais")
    public String obtempais(@RequestParam(value = "nome", defaultValue = "Brasil") String nome,
                            @RequestParam(value = "populacao", defaultValue = "215,3 milhões") String populacao) {
        return "País: " + nome + ", População: " + populacao;
    }
}