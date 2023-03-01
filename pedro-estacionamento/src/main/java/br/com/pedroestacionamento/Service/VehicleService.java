package br.com.pedroestacionamento.Service;

import br.com.pedroestacionamento.Entity.Vehicle;
import br.com.pedroestacionamento.Repository.VehicleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleService {

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

    @Transactional
    private Vehicle saveTransactional(Vehicle vehicle){
        return this.vehicleRepository.save(vehicle);
    }

}
