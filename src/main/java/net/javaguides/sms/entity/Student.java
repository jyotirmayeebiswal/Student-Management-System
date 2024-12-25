package net.javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false)
    private String regdNo;

    @Column(name = "email")
    private String email;

    @Column(name = "cgpa")
    private Double cgpa; // Changed to Double to handle null values
    
    @Column(name = "company")
    private String company;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String fullName, String regdNo, String email, Double cgpa, String company) {
        this.fullName = fullName;
        this.regdNo = regdNo;
        this.email = email;
        this.cgpa = cgpa; // Default to 0.0 if null
        this.company = company;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(String regdNo) {
        this.regdNo = regdNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa; // Default to 0.0 if null
    }
    
    public String getCompany() {
    	return company;
    }
    public void setCompany(String company) {
    	this.company = company;
    }
}
