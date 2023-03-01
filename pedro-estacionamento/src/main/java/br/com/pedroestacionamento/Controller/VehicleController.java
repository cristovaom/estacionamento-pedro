package br.com.pedroestacionamento.Controller;

import br.com.pedroestacionamento.Entity.Vehicle;
import br.com.pedroestacionamento.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("{idVehicle}")
    public ResponseEntity<Vehicle> findById(
            @PathVariable("idVehicle") Long idVehicle
    ) {
        return ResponseEntity.ok().body(this.vehicleService.findByID(idVehicle).get());
    }

    @PostMapping
    public ResponseEntity<?> insert(
            @RequestBody Vehicle vehicle
    ) {
        try {
            this.vehicleService.insert(vehicle);
            return ResponseEntity.ok().body("Adicionado com Sucesso! ");
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @DeleteMapping
    public ResponseEntity<?> delete(
            @PathVariable("idVehicle") Long idVehicle
    ) {
        try {
            this.vehicleService.delete(idVehicle);
            return ResponseEntity.ok().body("Deletado com Sucesso! ");
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(
            @RequestBody Vehicle vehicle
    ) {
        try {
            this.vehicleService.update(vehicle);
            return ResponseEntity.ok().body("Atualizado com Sucesso! ");
        } catch (RuntimeException error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }

    @GetMapping("/filter")
    public ArrayList<Vehicle> searchLicensePlate(
            @RequestParam("plate") String plate
    ) {
        return this.searchLicensePlate(plate);
    }
}
