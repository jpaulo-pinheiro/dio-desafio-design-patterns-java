package dio.desafio.design_patterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Cerveja {

    // required
    private String nome;
    private double tamanho;
    private double percentualAlcoolico;
    private double preco;

    // Other attributes
    private String cervejaria; // A cervejaria que produz a cerveja.
    private String paisDeOrigem; // O país de origem da cerveja.
    private String descricao; // Uma breve descrição das características da cerveja.
    private String acondicionamento; // O tipo de embalagem (garrafa, lata, chopp etc.).
    private String temperaturaDeServico; // A temperatura de serviço recomendada.
    private String harmonizaCom; // Alimentos que combinam bem com esta cerveja.

}
