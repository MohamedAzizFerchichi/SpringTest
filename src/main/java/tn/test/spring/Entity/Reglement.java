package tn.test.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReglement;

    private float montantPaye;

    private float montantRestant;

    private boolean payee;

    @Temporal(TemporalType.DATE)
    private Date Date;

    @ManyToOne(cascade = CascadeType.ALL)
    private Facture facture;

}
