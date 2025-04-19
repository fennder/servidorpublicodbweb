package br.tec.abrindoportas.servidorpublicodbweb.service;

import java.util.List;
import java.util.Optional;

import br.tec.abrindoportas.servidorpublicodbweb.entity.ServidorPublicoEntity;

public interface ServidorPublicoService {
  List<ServidorPublicoEntity> listAll();
  public Optional<ServidorPublicoEntity> listByMatricula(long matricula);
  void save(ServidorPublicoEntity seridorPublicoEntity);
  void update(ServidorPublicoEntity seridorPublicoEntity);
  void delete(long matricula);
}