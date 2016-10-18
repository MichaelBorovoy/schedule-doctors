package ua.com.mcingo.dev.references.employers;

import javax.persistence.*;

// Справочник сотрудников
// Вопросы: надо рассмотреть как добавить специальность доктору, если у него несколько специальностей (в ДЭ только одна специальность)
@Entity
@Table
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    //
    // Логин из доктор элекс для получения в каком отделении работает сотрудник и по какой специальности
    @Column
    private String userLoginDE;

    // Логин для входа в систему, данные получает система из контроллера домена
    @Column
    private String userLoginPortal;


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
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
