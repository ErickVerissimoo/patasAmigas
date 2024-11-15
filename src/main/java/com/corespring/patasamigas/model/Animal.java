/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author Erick
 */
@Data
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Tutor tutor;
    private String nome;
    private Integer idade;
    private Sexo sexo;
    private String especie;
    private LocalDate dataCadastro;
    private String raca;
    @OneToOne(mappedBy = "animal")
    private HistoricoMedico historico;
    @Enumerated(EnumType.STRING)
    private Status status;
    public Animal(){
        dataCadastro = LocalDate.now();
    }
    private enum Sexo{
        MASCULINO, FEMININO
    }
    private enum Status{
        Disponivel, EmProcesso, Adotado
    }
}
