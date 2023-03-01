package br.com.pedroestacionamento.Repository;

import br.com.pedroestacionamento.Entity.Administration;
import br.com.pedroestacionamento.Entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {


}
