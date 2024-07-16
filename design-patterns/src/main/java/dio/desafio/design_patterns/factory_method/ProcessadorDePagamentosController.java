package dio.desafio.design_patterns.factory_method;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("processar-pagamento")
public class ProcessadorDePagamentosController {

    @GetMapping("cartao-de-credito")
    public String processarPagamentoCartaoDeCredito(){
        return FabricaDeProcessadorDePagamentos.criarProcessadorDePagamentos("creditcard").processarPagamento();
    }

    @GetMapping("paypal")
    public String processarPagamentoPaypal(){
        return FabricaDeProcessadorDePagamentos.criarProcessadorDePagamentos("paypal").processarPagamento();
    }


}
