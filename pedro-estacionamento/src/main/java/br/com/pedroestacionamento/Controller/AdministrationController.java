package br.com.pedroestacionamento.Controller;

import br.com.pedroestacionamento.Entity.Administration;
import br.com.pedroestacionamento.Service.AdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/administrations")
public class AdministrationController {
    @Autowired
    private AdministrationService administrationService;

    @GetMapping("/{idAdministration}")
    public ResponseEntity<Administration> findById(
            @PathVariable("idAdministration") Long idAdministration
    ){
        return ResponseEntity.ok().body(this.administrationService.findByID(idAdministration).get());
    }

    @PostMapping
    public ResponseEntity<?> insert(
            @RequestBody Administration administration
    ){
        try{
            this.administrationService.insert(administration);
            return ResponseEntity.ok().body("Sucesso! Sr. Pedro");
        }catch (RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @DeleteMapping
    public ResponseEntity<?> delete(
            @RequestBody Administration administration
    ){
        try{
            this.administrationService.delete(administration);
            return ResponseEntity.ok().body("Deletado com Sucesso!");
        }catch (RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(
            @RequestBody Administration administration
    ){
        try{
            this.administrationService.update(administration);
            return ResponseEntity.ok().body("Atualizado Com Sucesso!");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
        try{
            return ResponseEntity.ok().body(this.administrationService.findAll());
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }
}
