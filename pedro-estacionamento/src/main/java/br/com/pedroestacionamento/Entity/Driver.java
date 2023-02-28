package br.com.pedroestacionamento.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "driver",schema = "public")
public class Driver extends AbstractEntity{
    @Getter
    @Setter
    @Column(name = "name",unique = false,nullable = false)
    private String name;
    @Getter
    @Setter
    @Column(name = "cpf",unique = true,nullable = false)
    private String cpf;

    @Getter
    @Setter
    @Column(name = "numCell",unique = true,nullable = false)
    private String numCell;

    @Getter
    @Setter
    @Column(name = "timeSpent",unique = false,nullable = false)
    private LocalDateTime timeSpent;
}
