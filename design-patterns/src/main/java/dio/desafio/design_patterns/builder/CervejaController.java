package dio.desafio.design_patterns.builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cervejas")
public class CervejaController {

    @GetMapping("basica")
    public String createStandardCerveja() {
        Cerveja cerveja = Cerveja.builder()
                .nome("Standard Cerveja")
                .tamanho(500)
                .percentualAlcoolico(5.0)
                .preco(5.99)
                .build();

        return "Cerveja criada: " + cerveja.getNome() + 
                ", Tamanho: " + cerveja.getTamanho() +
                ", Percentual alcoólico: " + cerveja.getPercentualAlcoolico() +
                ", Preço: " + cerveja.getPreco();
    }

    @GetMapping("premium")
    public String createPremiumCerveja() {
        Cerveja cerveja = Cerveja.builder()
                .nome("Sample Cerveja")
                .tamanho(330)
                .percentualAlcoolico(5.0)
                .preco(10.99)
                .cervejaria("Crafty Brews")
                .paisDeOrigem("United States")
                .descricao("A refreshing lager with a smooth taste.")
                .acondicionamento("Bottle")
                .temperaturaDeServico("4-6°C")
                .harmonizaCom("Pairs well with grilled chicken and salads.")
                .build();

        return "Cerveja criada: " + cerveja.getNome() + 
                ", Tamanho: " + cerveja.getTamanho() +
                ", Percentual alcoólico: " + cerveja.getPercentualAlcoolico() +
                ", Preço: " + cerveja.getPreco() +
                ", Cervejaria: " + cerveja.getCervejaria() +
                ", País de Origem: " + cerveja.getPaisDeOrigem() +
                ", Descrição: " + cerveja.getDescricao() +
                ", Acondicionamento: " + cerveja.getAcondicionamento() +
                ", Servir na temperatura: " + cerveja.getTemperaturaDeServico() +
                ", Harmoniza com: " + cerveja.getHarmonizaCom();
    }

}
