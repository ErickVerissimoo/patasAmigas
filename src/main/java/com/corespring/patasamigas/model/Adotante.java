
package com.corespring.patasamigas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Set;
import lombok.AllArgsConstructor;
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
public class Adotante extends Pessoa {

    @OneToMany(mappedBy = "adotante")
    private Set<Animal> animal;
    @OneToOne(mappedBy = "adotante")
    private Preferencias pref;
}
