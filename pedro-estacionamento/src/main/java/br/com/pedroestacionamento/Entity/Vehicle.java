package br.com.pedroestacionamento.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.Locale;


@Entity
@NoArgsConstructor
@Table(name = "vehicle",schema = "public")
public class Vehicle extends AbstractEntity{


    @Getter
    @Setter
    @Column(name = "plate",nullable = false,unique = true)
    @Length(min = 0, max = 10, message = "A Placa de acordo com o CTB nao pode ultrapassar 10 letras e ou numeros")
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
