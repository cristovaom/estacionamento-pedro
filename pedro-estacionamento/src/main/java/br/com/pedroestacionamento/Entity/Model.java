package br.com.pedroestacionamento.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "model", schema = "public")
public class Model extends AbstractEntity{

    @Getter
    @Setter
    @Column(name = "name",unique = true, nullable = false)
    private String name;
}
