package dio.desafio.design_patterns.factory_method;

import org.springframework.stereotype.Service;

@Service
public class ProcessadorDePagamentosCartaoDeCredito implements ProcessadorDePagamentos{

    @Override
    public String processarPagamento() {
        return "Processando pagamento via Cartão de Credito";
    }

}
