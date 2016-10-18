package ua.com.mcingo.dev.references.norma;

import javax.persistence.*;
import java.util.Map;


// Норма тривалості робочого часу в годинах
@Entity
@Table(name = "normawh")
public class NormaWH {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "NormaWH{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", hours=" + hours +
                '}';
    }
}
