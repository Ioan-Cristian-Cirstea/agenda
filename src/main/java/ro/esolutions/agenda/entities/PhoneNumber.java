package ro.esolutions.agenda.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String number;
    @Column
    private Long ownerId;

    public PhoneNumber(String number, Long ownerId) {
        this.number = number;
        this.ownerId = ownerId;
    }
}
