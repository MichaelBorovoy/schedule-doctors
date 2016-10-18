package ua.com.mcingo.dev.references.employers;

import javax.persistence.*;

@Entity
@Table
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
}
