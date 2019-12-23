package ua.ihorshulha.ht_07.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Set;

public class Developer {

    private Long id;
    private String firstName;
    private String secondName;
    private String phone;
    private Account account;
    private Set<Skill> skills;
    private int age;
    private boolean married;
    private LocalDateTime createDate;

    public Developer(Long id, String firstName, String secondName, String phone, Account account,
                     Set<Skill> skills, int age, boolean married, LocalDateTime createDate) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
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
        return Objects.equals(firstName, developer.firstName) &&
                Objects.equals(secondName, developer.secondName) &&
                Objects.equals(phone, developer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, phone);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phone='" + phone + '\'' +
                ", account=" + account +
                ", skills=" + skills +
                ", age=" + age +
                ", married=" + married +
                ", createDate="  + createDate.format(DateTimeFormatter.ofPattern("d MMMM uuuu; HH:mm:ss")) +
                '}';
    }
}
