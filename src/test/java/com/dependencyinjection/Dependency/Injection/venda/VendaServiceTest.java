package com.dependencyinjection.Dependency.Injection.venda;

import com.dependencyinjection.Dependency.Injection.pagamento.PagSegurosService;
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


    // Usado com Autowired reduz o Boilerplate mas fica mais trabalhoso para fazer teste, usado de forma implicita pela anotação
    // Tem que usar test com bibliotecas com Reflection (Ver como fazer teste usando Reflection)

//        VendaService vendaService = new VendaService();
//        vendaService.setVendaServide(new PagSegurosService("857db3bbb149abc89433420f4d18bdf3"));
//        vendaService.registar(venda,"4024000109920098753");

    }

}