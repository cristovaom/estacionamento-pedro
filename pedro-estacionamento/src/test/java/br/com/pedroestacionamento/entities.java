package br.com.pedroestacionamento;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class entities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_razaoSocial", length = 100, nullable = false)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
