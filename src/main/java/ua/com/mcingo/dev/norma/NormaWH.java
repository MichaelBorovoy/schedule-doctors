package ua.com.mcingo.dev.norma;

import javax.persistence.*;
import java.util.Map;


// Норма тривалості робочого часу в годинах
@Entity
@Table(name = "normawh")
public class NormaWH {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name_norma")
    private String nameNorma;
    @Column
    private String year;
    @ElementCollection
    //Количество часов в месяц
    private Map<String,Integer> hours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameNorma() {
        return nameNorma;
    }

    public void setNameNorma(String nameNorma) {
        this.nameNorma = nameNorma;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Map<String, Integer> getHours() {
        return hours;
    }

    public void setHours(Map<String, Integer> hours) {
        this.hours = hours;
    }
}
