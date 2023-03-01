package br.com.pedroestacionamento.Repository;


import br.com.pedroestacionamento.Entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigRepository extends JpaRepository<Config,Long> {
}
