package com.dependencyinjection.Dependency.Injection;

import com.dependencyinjection.Dependency.Injection.pagamento.PagSegurosService;
import com.dependencyinjection.Dependency.Injection.venda.Venda;
import com.dependencyinjection.Dependency.Injection.venda.VendaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.math.BigDecimal;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		/*
		 * Representa o container de inversão de controle e
		 * da acesso aos Beans gerenciados pelo Spring
		 */

		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);

		// Foi dado por ter sido confiurado em LojaConfig para retornar um Bean
		VendaService vendaService = applicationContext.getBean(VendaService.class);

		Venda venda = new Venda();
		venda.setProduto("Camiseta Branca Básica");
		venda.setQuantidade(2);
		venda.setPrecoUnitario(new BigDecimal(109.5));

		vendaService.registrar(venda,"4024000109920098753");



	}
}
