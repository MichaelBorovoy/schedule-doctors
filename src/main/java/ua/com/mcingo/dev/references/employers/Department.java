package ua.com.mcingo.dev.references.employers;

import javax.persistence.*;

/**
 * Created by it_mb on 18.10.2016.
 */
@Entity
@Table
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
}

