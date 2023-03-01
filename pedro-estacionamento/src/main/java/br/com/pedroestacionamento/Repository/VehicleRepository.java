package br.com.pedroestacionamento.Repository;


import br.com.pedroestacionamento.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    ArrayList <Vehicle> findByPlateContains(String plate);

}
