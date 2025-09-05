package com.example.loltipos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "campeoes")
public class Campeao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Função é obrigatória")
    private String funcao;

    @NotNull(message = "Dificuldade (1-10) é obrigatória")
    private Integer dificuldade; // 1 a 10

    // Construtores
    public Campeao() {}

    public Campeao(String nome, String funcao, Integer dificuldade) {
        this.nome = nome;
        this.funcao = funcao;
        this.dificuldade = dificuldade;
    }

    // Getters e Setters
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }
}