package ua.com.mcingo.dev.norma;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;



// Норма тривалості робочого часу в годинах
@Entity
@Table(name = "normawh")
public class NormaWH {
    private int id;
    private String nameNorma;
    private String year;
    @ElementCollection
    private Collection<Integer> hours;

}
