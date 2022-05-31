package com.jvoq.microservicios.monedero.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import com.jvoq.microservicios.monedero.app.dtos.WalletDto;

@Service
public class WalletService {

  @Autowired
  private StreamBridge streamBridge;



  public void sendMessage(WalletDto message){
  streamBridge.send("transaccion-out-0",message);
  }
}
