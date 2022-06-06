package gr.uom.kedivim.gtgh.db.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private String amka;
    private LocalDate birthdate;

    public Person(String name, String surname, String amka, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.amka = amka;
        this.birthdate = birthdate;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", amka='" + amka + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
