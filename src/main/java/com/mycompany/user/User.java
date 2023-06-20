package com.mycompany.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "fullName")
    private String fullName;

    @Column(length = 45, nullable = false, name = "detailSalary")
    private String detailSalary;

    private boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDetailSalary() {return detailSalary;}

    public void setFullName(String Name) {
        this.fullName = Name;
    }


    public void setSalary(String Salary) {
        this.detailSalary = Salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + fullName + '\'' +
                ", Salary='" + detailSalary + '\'' +
//
                '}';
    }


    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
