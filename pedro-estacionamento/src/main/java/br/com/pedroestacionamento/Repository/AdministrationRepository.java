package br.com.pedroestacionamento.Repository;

import br.com.pedroestacionamento.Entity.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrationRepository extends JpaRepository<Administration,Long> {

}
