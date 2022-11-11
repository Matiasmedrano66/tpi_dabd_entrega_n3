package com.tpiblackjack.tpiblackjack.repositories;

import com.tpiblackjack.tpiblackjack.models.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPartidaRepository extends JpaRepository<Partida, Long> {
  @Query(
    value = "SELECT count(distinct id_usuario), fecha_partida from partidas group by date(fecha_partida)",
    nativeQuery = true)
  List<?> traerCantidadJugadoresPorFecha();
}
