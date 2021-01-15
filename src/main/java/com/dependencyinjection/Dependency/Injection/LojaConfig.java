package com.dependencyinjection.Dependency.Injection;


import com.dependencyinjection.Dependency.Injection.pagamento.GatewayPagamento;
import com.dependencyinjection.Dependency.Injection.pagamento.PagSegurosService;
import com.dependencyinjection.Dependency.Injection.pagamento.PayPalService;
import com.dependencyinjection.Dependency.Injection.venda.VendaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  // declara que há Beans para o container do Spring, sendo assim declara que é uma classe de configuração
public class LojaConfig {

    @Primary // É dado preferencia qquando encotrado mais que 1 Bean, existem outras formas, estudar quais
    @Bean // quando iniciar ele deve instanciar essa classe
    public PayPalService payPalService(){
        return new PayPalService("Antonio Roberto", "1234");

    }

    @Bean
    public PagSegurosService pagSegurosService(){
        return new PagSegurosService("857db3bbb149abc89433420f4d18bdf3");
    }

    // Foi declarado @Component e=na classe VendaService, deixando ela declarada como um Bean

//    @Bean
//    public VendaService vendaService(GatewayPagamento gatewayPagamento){
//        return new VendaService(gatewayPagamento);
//    }

}
