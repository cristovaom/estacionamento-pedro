package br.com.pedroestacionamento.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;

@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEntity {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;




}
