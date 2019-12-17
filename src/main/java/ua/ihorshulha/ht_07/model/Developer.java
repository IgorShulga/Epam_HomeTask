package ua.ihorshulha.ht_07.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Set;

public class Developer {

    private Long id;
    private String name;
    private String surname;
    private String phone;
    private Account.AccountStatus account;
    private Set<Skill> skills;
    private int age;
    private boolean married;
    private LocalDateTime createDate;

    public Developer(Long id, String name, String surname, String phone, Account.AccountStatus account,
                     Set<Skill> skills, int age, boolean married, LocalDateTime createDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.account = account;
        this.skills = skills;
        this.age = age;
        this.married = married;
        this.createDate = createDate;
    }

    public Developer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account.AccountStatus getAccount() {
        return account;
    }

    public void setAccount(Account.AccountStatus account) {
        this.account = account;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) &&
                Objects.equals(surname, developer.surname) &&
                Objects.equals(phone, developer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", account=" + account +
                ", skills=" + skills +
                ", age=" + age +
                ", married=" + married +
                ", createDate="  + createDate.format(DateTimeFormatter.ofPattern("d MMMM uuuu; HH:mm:ss")) +
                '}';
    }
}
