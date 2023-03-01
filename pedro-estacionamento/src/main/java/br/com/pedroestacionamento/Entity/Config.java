package br.com.pedroestacionamento.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
public class Config extends AbstractEntity{


    @Getter
    @Setter
    @Column(name = "key",unique = true,nullable = false)
    private String key;

    @Getter
    @Setter
    @Column(name = "valueHour",unique = false,nullable = false)
    private BigDecimal valorHora;

    @Getter
    @Setter
    @Column(name = "valueTax",unique = false,nullable = false)
    private BigDecimal valorMulta;

    @Getter
    @Setter
    @Column(name = "parkingLotsM",unique = false,nullable = false)
    private int vagasM;

    @Getter
    @Setter
    @Column(name = "parkingLotsC",unique = false,nullable = false)
    private int vagasC;

    @Getter
    @Setter
    @Column(name = "parkingLotsV",unique = false,nullable = false)
    private int vagasV;

}
