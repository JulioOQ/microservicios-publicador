package com.jvoq.microservicios.monedero.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvoq.microservicios.monedero.app.dtos.WalletDto;
import com.jvoq.microservicios.monedero.app.services.WalletService;


@RestController
@RequestMapping("/publicador")
public class PublicadorController {
  
  @Autowired
  WalletService walletService;
  
  
  @PostMapping
  public void enviar(@RequestBody WalletDto walletDto) {
     walletService.sendMessage(walletDto);
  }
  
 

}
