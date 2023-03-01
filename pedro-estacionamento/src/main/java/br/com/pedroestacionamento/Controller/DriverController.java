package br.com.pedroestacionamento.Controller;

import br.com.pedroestacionamento.Entity.Driver;
import br.com.pedroestacionamento.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping("{idDriver}")
    public ResponseEntity<Driver> findById(
            @PathVariable ("idDriver") Long idDriver
    ){
        return ResponseEntity.ok().body(this.driverService.findByID(idDriver).get());
    }

    @PostMapping
    public ResponseEntity<?> insert(
            @RequestBody Driver driver
    ){
        try{
            this.driverService.insert(driver);
            return ResponseEntity.ok().body("Inserido com Sucesso! ");
        }catch(RuntimeException error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }
    @DeleteMapping
    public ResponseEntity<?> delete(
        @RequestBody Driver driver
    ){
        try {
            this.driverService.delete(driver);
            return ResponseEntity.ok().body("Deletado com Sucesso!");
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }

    }

    @PutMapping
    public ResponseEntity<?>update(
            @RequestBody Driver driver
    ){
        try{
            this.driverService.update(driver);
            return ResponseEntity.ok().body("Atualizado com Sucesso! ");
        }catch(RuntimeException error){
            return ResponseEntity.ok().body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok().body(this.driverService.findAll());
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

}
