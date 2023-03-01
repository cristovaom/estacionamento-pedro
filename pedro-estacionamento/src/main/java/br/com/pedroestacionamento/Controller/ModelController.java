package br.com.pedroestacionamento.Controller;


import br.com.pedroestacionamento.Repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/models")
public class ModelController {
    @Autowired
    private ModelRepository modelRepository;
}
