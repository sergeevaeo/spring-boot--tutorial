package com.example.springboottutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // класс - сущность JPA, которую надо преобразовать в таблицу
public class Customer {

    @Id // id - идентификатор объекта
    @GeneratedValue(strategy = GenerationType.AUTO) // идентификатор генерится автоматически
    private Integer id;

    private String firstName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
