package ro.esolutions.agenda.entities;

import javax.persistence.*;

@Entity
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String number;
    @Column
    private Long ownerId;
}
