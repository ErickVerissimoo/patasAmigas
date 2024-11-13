/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.NaturalId;

/**
 *
 * @author Erick
 */
@Data
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NaturalId
    @Email(message = "Email não pode ser nulo")
    private String email;
    private String nome;
    private LocalDate dataNascimento;
    private String CPF;
    
    private String senha;
    @Enumerated
    private sexo Sexo;
    private enum sexo{
        MASCULINO, FEMININO;
    }
}
