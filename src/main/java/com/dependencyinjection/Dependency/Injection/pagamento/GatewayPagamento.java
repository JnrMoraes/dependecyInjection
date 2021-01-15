package com.dependencyinjection.Dependency.Injection.pagamento;

import java.math.BigDecimal;

public interface GatewayPagamento {

    public void efetuarPagamento(String numeroCartao, BigDecimal valor);

}
