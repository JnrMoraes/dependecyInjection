package com.dependencyinjection.Dependency.Injection.pagamento;

import java.math.BigDecimal;

public class PagSegurosService implements GatewayPagamento {
    private String token;
    public PagSegurosService(String token) {
        this.token = token;
    }

    public void efetuarPagamento(String numeroCartao, BigDecimal valor){
        System.out.printf("[PagSeguro] Usando Token %s\n", token);
        System.out.printf("[PagSeguro] Cobrando %f do cartão %s...\n", valor, numeroCartao);

    }
}
