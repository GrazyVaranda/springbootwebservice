
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LocalizacaoService {

    @GetMapping("/obtemlocal")
    public String obtemLocalizacao() {
        return "São Miguel Paulista";
    }

    @GetMapping("/obtemlocal")
    public String obtemHoraAtual() {
        return LocalDateTime.now().toString();
    
    
   }
    @GetMapping("/obtelocal")
    public String obtemCoordenadas() {
        
        return "Latitude: xx.xxxx, Longitude: yy.yyyy";
    }

    @GetMapping("/obtemlocal")
    public String obtemEndereco() {
        
        return "Endereço: Rua abc , Cidade São Paulo, Estado São Paulo";
    }

    @GetMapping("/obtemlocal")
    public String obtemPais() {
       
        return "País: Brasil, Capital: São Paulo, População: xxx milhões";
    }
}