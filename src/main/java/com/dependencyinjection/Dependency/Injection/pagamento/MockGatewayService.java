package com.dependencyinjection.Dependency.Injection.pagamento;

import java.math.BigDecimal;

public class MockGatewayService implements GatewayPagamento{

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {

    }
}
