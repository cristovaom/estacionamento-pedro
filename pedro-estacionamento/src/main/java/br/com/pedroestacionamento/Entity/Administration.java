package br.com.pedroestacionamento.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "Administration",schema = "public")
public class Administration extends AbstractEntity{

    @Getter
    @Setter
    @Column(name = "entranceDate",unique = false,nullable = false)
    private LocalDateTime entranceDate;

    @Getter
    @Setter
    @Column(name = "exitDate",unique = false,nullable = false)
    private LocalDateTime exitDate;

    @Getter
    @Setter
    @Column(name = "descountTime",unique = false,nullable = false)
    private BigDecimal descountTime;
    @Getter
    @Setter
    @Column(name = "time",unique = false,nullable = false)
    private LocalDateTime time;

    @Getter
    @Setter
    @JoinColumn(name = "vehicle",unique = false,nullable = false)
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    private Vehicle vehicle;
    @Getter
    @Setter
    @JoinColumn(name="driver",unique = false,nullable = false)
    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    private Driver driver;

    @Getter
    @Setter
    @Column(name="valueHour",unique = false,nullable = false)
    private BigDecimal valueHour;
    @Getter
    @Setter
    @Column(name="valueTotal",unique = false,nullable = false)
    private BigDecimal valueTotal;
    @Getter
    @Setter
    @Column(name="valueTax",unique = false,nullable = false)
    private BigDecimal valueTax;
}
