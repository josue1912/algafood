package com.algaworks.algafood;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

  private AtivacaoClienteService ativacaoClienteService;

  public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
    this.ativacaoClienteService = ativacaoClienteService;
    System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
  }

  @GetMapping("/hello")
  @ResponseBody
  public String hello(){
    Cliente joao = new Cliente("Joao", "joao@gmail.com", "2199887766");
    ativacaoClienteService.ativar(joao);

    return "Teste!";
  }
}
