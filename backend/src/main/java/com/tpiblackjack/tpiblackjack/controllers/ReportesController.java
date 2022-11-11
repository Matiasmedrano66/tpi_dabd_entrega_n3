package com.tpiblackjack.tpiblackjack.controllers;

import com.tpiblackjack.tpiblackjack.services.IPartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reportes")
public class ReportesController {
  @Autowired
  private IPartidaService _partidaService;

  @GetMapping(path = "/cantidadPorFecha")
  @ResponseBody
  private ResponseEntity<?>  traerCantidadJugadoresPorFecha()
  {
    //List<ReportePartidasPorFechaDto> reportes = new ArrayList<>();
    var resultado = _partidaService.traerCantidadJugadoresPorFecha();

    return ResponseEntity.ok(resultado);
  }
}
