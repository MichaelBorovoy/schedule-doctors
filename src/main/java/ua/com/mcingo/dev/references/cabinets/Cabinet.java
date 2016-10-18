package ua.com.mcingo.dev.references.cabinets;

import javax.persistence.*;

/**
 * Created by it_mb on 18.10.2016.
 */
@Entity
@Table
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String colorCabinet;
    @Column
    private String floor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorCabinet() {
        return colorCabinet;
    }

    public void setColorCabinet(String colorCabinet) {
        this.colorCabinet = colorCabinet;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colorCabinet='" + colorCabinet + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
