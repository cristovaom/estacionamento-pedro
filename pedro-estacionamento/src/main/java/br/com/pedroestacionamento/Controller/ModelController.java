package br.com.pedroestacionamento.Controller;


import br.com.pedroestacionamento.Entity.Administration;
import br.com.pedroestacionamento.Entity.Model;
import br.com.pedroestacionamento.Repository.ModelRepository;
import br.com.pedroestacionamento.Service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping("/{idModel}")
    public ResponseEntity<Model> findById(
            @PathVariable("idModel") Long idModel
    ){
        return ResponseEntity.ok().body(this.modelService.findByID(idModel).get());
    }

    @PostMapping
    public ResponseEntity<?> insert(
            @RequestBody Model model
    ){
        try{
            this.modelService.insert(model);
            return ResponseEntity.ok().body("Sucesso , Salvo! ");
        }catch (RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @DeleteMapping
    public ResponseEntity <?> delete(
        @RequestBody Model model
    ){
        try{
            this.modelService.delete(model);
            return ResponseEntity.ok().body("Deletado com Sucesso!");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(
            @RequestBody Model model
    ){
        try{
            this.modelService.update(model);
            return ResponseEntity.ok().body("Atualizado Com Sucesso!");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }


    @GetMapping
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok().body(this.modelService.findAll());
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

}
