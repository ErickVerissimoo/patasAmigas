/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.model;

import jakarta.persistence.Entity;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

/**
 *
 * @author Erick
 */
@SuperBuilder
@DynamicInsert
@Entity
public class Funcionario extends Pessoa{
    
}