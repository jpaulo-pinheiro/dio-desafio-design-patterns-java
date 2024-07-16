package dio.desafio.design_patterns.factory_method;

import org.springframework.stereotype.Service;

@Service
public class ProcessadorDePagamentosPayPal implements ProcessadorDePagamentos {

    @Override
    public String processarPagamento() {
        return "Processando pagamento via PayPal";
    }

}
