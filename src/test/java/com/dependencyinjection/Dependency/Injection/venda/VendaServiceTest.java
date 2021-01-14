package com.dependencyinjection.Dependency.Injection.venda;

import com.dependencyinjection.Dependency.Injection.pagamento.MockGatewayService;
import com.dependencyinjection.Dependency.Injection.pagamento.PagSegurosService;
import com.dependencyinjection.Dependency.Injection.pagamento.PayPalService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class VendaServiceTest {

    @Test
    public void registraVenda(){
        Venda venda = new Venda();
        venda.setProduto("Camiseta Branca Básica");
        venda.setQuantidade(2);
        venda.setPrecoUnitario(new BigDecimal(109.5));


        /*
         * Independente da forma da venda não é preciso alterar a classe VendaService
         */

//        VendaService vendaService = new VendaService(new PagSegurosService("857db3bbb149abc89433420f4d18bdf3"));        VendaService vendaService = new VendaService(new PagSegurosService("857db3bbb149abc89433420f4d18bdf3"));
//        VendaService vendaService = new VendaService(new PayPalService("Junior", "123"));
        VendaService vendaService = new VendaService(new MockGatewayService());
        vendaService.registar(venda,"4024000109920098753");

    }

}