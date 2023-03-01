package br.com.pedroestacionamento.Controller;

import br.com.pedroestacionamento.Entity.Config;
import br.com.pedroestacionamento.Service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping("/api/config")
public class ConfigController {
    @Autowired
    private ConfigService configService;

    @GetMapping("{/idConfig}")
    public ResponseEntity<Config> findById(
            @PathVariable("idConfig") Long idConfig
    ){
        return ResponseEntity.ok().body(this.configService.findByID(idConfig).get());
    }

    @PostMapping
    public ResponseEntity<?> insert(
            @RequestBody Config config
    ){
        try{
            this.configService.insert(config);
            return ResponseEntity.ok().body("Adicionado com Sucesso! ");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @DeleteMapping
    public ResponseEntity<?> delete(
            @RequestBody Config config
    ){
        try{
            this.configService.delete(config);
            return ResponseEntity.ok().body("Deletado com Sucesso!");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(
            @RequestBody Config config
    ){
        try{
            this.configService.update(config);
            return ResponseEntity.ok().body("Atualizado com Sucesso!");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok().body(this.configService.findAll());
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }
}

