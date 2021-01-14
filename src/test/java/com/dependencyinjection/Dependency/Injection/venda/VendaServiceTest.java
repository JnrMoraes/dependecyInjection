package com.dependencyinjection.Dependency.Injection.venda;

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

        // fez uma integração com o PagSeguro, não esta fazendo o certo de um teste unitario
        VendaService vendaService = new VendaService();
        vendaService.registar(venda,"4024000109920098753");

    }

}