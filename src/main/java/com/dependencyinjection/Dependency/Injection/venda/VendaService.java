package com.dependencyinjection.Dependency.Injection.venda;

import com.dependencyinjection.Dependency.Injection.pagamento.GatewayPagamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component // Declarando assim não precisa do Bean explícito em config, pq a anotacão Component tbm é um Bean
public class VendaService {

    // Usado com Autowired reduz o Boilerplate, mas fica mais trabalhoso para fazer teste, usado de forma implicita pela anotação
    // Tem que usar test com Reflection (Ver como fazer teste usando Reflection) por ser privado
    @Autowired
    private GatewayPagamento gatewayPagamento;

//    public VendaService(GatewayPagamento gatewayPagamento) {
//        this.gatewayPagamento = gatewayPagamento;
//    }

//    @Autowired
//    public void setVendaServide(GatewayPagamento gatewayPagamento){
//        this.gatewayPagamento = gatewayPagamento;
//    }


    public void registar(Venda venda, String numeroCartao){
        BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));

        System.out.printf("[Venda] Registrando venda de %s no valor total de %f...\n",
                venda.getProduto(), valorTotal);

        gatewayPagamento.efetuarPagamento(numeroCartao, valorTotal);

    }

}
