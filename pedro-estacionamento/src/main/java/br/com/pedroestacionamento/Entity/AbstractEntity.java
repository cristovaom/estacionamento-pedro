package br.com.pedroestacionamento.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;
import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEntity {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

//    @Getter
//    @Setter
//    private LocalDateTime cadastro;
//
//    @Getter
//    @Setter
//    private LocalDateTime edicao;
//
//    @Getter
//    @Setter
//    private boolean ativo;
}
