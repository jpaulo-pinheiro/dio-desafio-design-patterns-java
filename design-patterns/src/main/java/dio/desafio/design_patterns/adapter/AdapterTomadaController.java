package dio.desafio.design_patterns.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tomada")
public class AdapterTomadaController {

    @GetMapping("3-pinos")
    public String ligarNaTomadaDeTresPinos() {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
        return t3.ligarNaTomadaDeTresPinos();
    }

    @GetMapping("2-pinos")
    public String ligarNaTomadaDeDoisPinos() {
        TomadaDeDoisPinos t2 = new TomadaDeDoisPinos();
		return t2.ligarNaTomadaDeDoisPinos();
    }

    @GetMapping("adapter")
    public String ligarNoAdapterTomada() {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();		
		AdapterTomada a = new AdapterTomada(t3);		
        return a.ligarNaTomadaDeDoisPinos();
    }

}
