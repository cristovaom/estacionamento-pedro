package br.com.pedroestacionamento.Repository;


import br.com.pedroestacionamento.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    @Query("select v from Vehicle v where v.plate = :plate")
    Optional<Vehicle> findByPlateContains(String plate);

}
