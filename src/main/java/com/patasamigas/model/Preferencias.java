/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patasamigas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@NoArgsConstructor
@AllArgsConstructor
public class Preferencias {
       private enum RACA {
            raca1, raca2, raca3;
        }

       private enum IDADE {
            velho, novo, meio;
        }

        private enum TIPO {
            gato, ovelha, coelho, cachorro;
        }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Enumerated(EnumType.STRING)
        private RACA raca;
        @Enumerated(EnumType.STRING)
        private IDADE idade;
        @Enumerated(EnumType.STRING)
        private TIPO Tipo;
        @OneToOne(mappedBy = "pref")
        
        private Adotante adotador;
    }

