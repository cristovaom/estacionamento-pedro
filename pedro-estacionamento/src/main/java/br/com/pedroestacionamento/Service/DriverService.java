package br.com.pedroestacionamento.Service;

import br.com.pedroestacionamento.Entity.Driver;
import br.com.pedroestacionamento.Entity.Model;
import br.com.pedroestacionamento.Repository.DriverRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver insert(Driver driver){
        return saveTransactional(driver);
    }

    public Optional<Driver> findByID(Long id){
        return this.driverRepository.findById(id);
    }

    public void delete(Driver driver){
        this.driverRepository.delete(driver);
    }

    public Driver update(Driver driver){
        return saveTransactional(driver);
    }

    public ArrayList<Driver> findAll(){
        return (ArrayList<Driver>) this.driverRepository.findAll();
    }

    @Transactional
    public Driver saveTransactional(Driver driver){
        return this.driverRepository.save(driver);
    }
}
