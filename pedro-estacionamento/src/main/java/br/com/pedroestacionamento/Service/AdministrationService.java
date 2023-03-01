package br.com.pedroestacionamento.Service;

import br.com.pedroestacionamento.Entity.Administration;
import br.com.pedroestacionamento.Entity.Model;
import br.com.pedroestacionamento.Repository.AdministrationRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AdministrationService{

    private AdministrationRepository administrationRepository;

    public Administration insert(Administration administration){
        return saveTransactional(administration);
    }

    public Optional<Administration> findByID(Long id){
        return this.administrationRepository.findById(id);
    }

    public void delete(Administration administration){
        this.administrationRepository.delete(administration);
    }

    public Administration update(Administration administration){
        return saveTransactional(administration);
    }

    public ArrayList<Administration> findAll(){
        return (ArrayList<Administration>) this.administrationRepository.findAll();
    }


    @Transactional
    public Administration saveTransactional(Administration administration){
        return this.administrationRepository.save(administration);
    }

}
