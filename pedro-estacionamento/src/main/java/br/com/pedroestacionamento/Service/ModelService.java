package br.com.pedroestacionamento.Service;

import br.com.pedroestacionamento.Entity.Model;
import br.com.pedroestacionamento.Entity.Vehicle;
import br.com.pedroestacionamento.Repository.ModelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public Model insert(Model model){
        return saveTransactional(model);
    }

    public Optional<Model> findByID(Long id){
        return this.modelRepository.findById(id);
    }

    public Model update(Model model){
        return saveTransactional(model);
    }

    public void delete(Model model){
        this.modelRepository.delete(model);
    }

    public ArrayList<Model> findAll(){
        return (ArrayList<Model>) this.modelRepository.findAll();
    }
    @Transactional
    private Model saveTransactional(Model model){
        return this.modelRepository.save(model);
    }
}
