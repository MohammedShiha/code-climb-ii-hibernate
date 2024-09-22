package code.climb.hibernate.employees.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.StringJoiner;

@Entity(name = "employee")
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "emp_no")
    private Integer employeeNo;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private FullName fullName;

    @Column(columnDefinition = "enum('M','F')")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @ManyToMany
    @JoinTable(name = "dept_emp",
            joinColumns = @JoinColumn(name = "emp_no", referencedColumnName = "emp_no"),
            inverseJoinColumns = @JoinColumn(name = "dept_no", referencedColumnName = "dept_no"))
    private List<Department> departments;

    @OneToMany
    @JoinColumn(name = "emp_no")
    private List<Title> titles;

    @OneToMany
    @JoinColumn(name = "emp_no")
    private List<Salary> salaries;

    public Employee() {
    }

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("employeeNo=" + employeeNo)
                .add("fullName=" + fullName)
                .toString();
    }
}
