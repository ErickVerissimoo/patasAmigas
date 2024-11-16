/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author Erick
 */
@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Animal extends SerVivo{
  
    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;
    private String especie;
    private LocalDate dataResgate;
    private String raca;
    @Lob
    private byte[] foto;
    @Enumerated(EnumType.STRING)
    private Status status;
    
    private Adotante adotante;
   
    private enum Status{
        Disponivel, EmProcesso, Adotado
    }
}
