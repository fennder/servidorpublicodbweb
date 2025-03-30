package br.tec.abrindoportas.servidorpublicodbweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.tec.abrindoportas.servidorpublicodbweb.entity.ServidorPublicoEntity;

@Repository
public interface ServidorPublicoRepository  extends CrudRepository<ServidorPublicoEntity, Long>{
  
}
