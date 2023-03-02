package br.com.pedroestacionamento.Service;

import br.com.pedroestacionamento.Entity.Model;
import br.com.pedroestacionamento.Entity.Vehicle;
import br.com.pedroestacionamento.Repository.VehicleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle insert (Vehicle vehicle){
        return saveTransactional(vehicle);
    }
    public Optional<Vehicle> findByID(Long id){

        return this.vehicleRepository.findById(id);
    }

    public ArrayList<Vehicle> findAll(){

        return (ArrayList<Vehicle>) this.vehicleRepository.findAll();
    }

    public Vehicle update (Vehicle vehicle){

        return saveTransactional(vehicle);
    }

    public void delete(Long id){

        this.vehicleRepository.deleteById(id);
    }

    public Optional<Vehicle> findByPlate(String plate){
        return this.vehicleRepository.findByPlateContains(plate);
    }


    @Transactional
    private Vehicle saveTransactional(Vehicle vehicle){

        return this.vehicleRepository.save(vehicle);
    }

}
