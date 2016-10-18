package ua.com.mcingo.dev.scheduling.schedules;

import javax.persistence.*;

/**
 * Created by it_mb on 18.10.2016.
 */
@Entity
@Table
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
