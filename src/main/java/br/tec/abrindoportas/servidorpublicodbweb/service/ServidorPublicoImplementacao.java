package br.tec.abrindoportas.servidorpublicodbweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.tec.abrindoportas.servidorpublicodbweb.entity.ServidorPublicoEntity;
import br.tec.abrindoportas.servidorpublicodbweb.repository.ServidorPublicoRepository;
/*
 * Orientação a Objetos parte do Spring MVC
 */
@Service
public class ServidorPublicoImplementacao implements ServidorPublicoService{
  
  @Autowired
  private ServidorPublicoRepository servidorPublicoRepository;

  @Override
  public List<ServidorPublicoEntity> listAll() {
    List<ServidorPublicoEntity> servidorPublicoEntities = new ArrayList<>();
    servidorPublicoRepository.findAll().forEach(servidorPublicoEntities::add);
    return servidorPublicoEntities;
  }

  @Override
  public Optional<ServidorPublicoEntity> listByMatricula(long matricula) {
    return servidorPublicoRepository.findById(matricula);
  }

  @Override
  public void save(ServidorPublicoEntity seridorPublicoEntity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }

  @Override
  public void update(ServidorPublicoEntity seridorPublicoEntity) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(long matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
  
}
