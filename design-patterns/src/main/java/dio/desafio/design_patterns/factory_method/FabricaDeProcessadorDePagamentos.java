package dio.desafio.design_patterns.factory_method;

import org.springframework.stereotype.Component;

@Component
public class FabricaDeProcessadorDePagamentos {

    private FabricaDeProcessadorDePagamentos() {}

    public static ProcessadorDePagamentos criarProcessadorDePagamentos(String metodoDePagamento) {
        if (metodoDePagamento.equalsIgnoreCase("creditcard")) {
            return new ProcessadorDePagamentosCartaoDeCredito();
        } else if (metodoDePagamento.equalsIgnoreCase("paypal")) {
            return new ProcessadorDePagamentosPayPal();
        }
        throw new IllegalArgumentException("Método de pagamento não aceito: " + metodoDePagamento);
    }

}
