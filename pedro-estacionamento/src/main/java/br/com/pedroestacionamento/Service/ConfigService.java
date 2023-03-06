package br.com.pedroestacionamento.Service;

import br.com.pedroestacionamento.Entity.Config;
import br.com.pedroestacionamento.Entity.Model;
import br.com.pedroestacionamento.Repository.ConfigRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class ConfigService {

    @Autowired
    private ConfigRepository configRepository;

    public Config insert(Config config){
        return saveTransactional(config);
    }

    public Optional<Config> findByID(Long id){
        return this.configRepository.findById(id);
    }

    public void delete(Config config){
        this.configRepository.delete(config);
    }

    public Config update(Config config){
        return saveTransactional(config);
    }

    public ArrayList<Config> findAll(){
        return (ArrayList<Config>) this.configRepository.findAll();
    }



    @Transactional
    public Config saveTransactional(Config config){

        return this.configRepository.save(config);
    }
}
