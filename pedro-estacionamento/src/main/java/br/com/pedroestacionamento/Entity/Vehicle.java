package br.com.pedroestacionamento.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "vehicle",schema = "public")
public class Vehicle extends AbstractEntity{

    @Getter
    @Setter
    @Column(name = "plate",nullable = false,unique = true)
    private String plate;

    @Getter
    @Setter
    @Column(name = "year")
    private int year;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "color",unique = false,nullable = false)
    private Color color;


    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "category",unique = false,nullable = false)
    private Category category;

}
