package ua.com.mcingo.dev.references.workmode;

import javax.persistence.*;

// Режим работы
@Entity
@Table(name="work_mode")
public class WorkMode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;

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

    @Override
    public String toString() {
        return "WorkMode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
