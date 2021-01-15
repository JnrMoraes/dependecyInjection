package com.dependencyinjection.Dependency.Injection.venda;

import com.dependencyinjection.Dependency.Injection.pagamento.GatewayPagamento;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component // Declarando assim não precisa do Bean explícito em config, pq a anotacão Component tbm é um Bean
public class VendaService {

    private GatewayPagamento gatewayPagamento;

    public VendaService(GatewayPagamento gatewayPagamento) {
        this.gatewayPagamento = gatewayPagamento;
    }

    public void registar(Venda venda, String numeroCartao){
        BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));

        System.out.printf("[Venda] Registrando venda de %s no valor total de %f...\n",
                venda.getProduto(), valorTotal);

        gatewayPagamento.efetuarPagamento(numeroCartao, valorTotal);

    }

}
