package com.dependencyinjection.Dependency.Injection.venda;

import com.dependencyinjection.Dependency.Injection.pagamento.PagSegurosService;

import java.math.BigDecimal;

public class VendaService {

    public void registar(Venda venda, String numeroCartao){
        BigDecimal valorTotal = venda.getPrecoUnitario().multiply(new BigDecimal(venda.getQuantidade()));

        System.out.printf("[Venda] Registrando venda de %s no valor total de %f...\n",
                venda.getProduto(), valorTotal);

        //alta acoplamento - dependecina com a classe PagSeguro fere os Open Close Principle - Dependency Inversion Principle
        PagSegurosService pagSegurosService = new PagSegurosService("857db3bbb149abc89433420f4d18bdf3");
        pagSegurosService.efetuarPagamento(numeroCartao, valorTotal);

    }

}
