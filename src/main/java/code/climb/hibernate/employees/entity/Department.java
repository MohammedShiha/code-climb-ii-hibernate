package code.climb.hibernate.employees.entity;

import javax.persistence.*;
import java.util.List;
import java.util.StringJoiner;

@Entity(name = "department")
@Table(name = "departments")
public class Department {
    @Id
    @Column(name = "dept_no")
    private String departmentNo;

    @Column(name = "dept_name")
    private String name;

    @ManyToMany
    @JoinTable(name = "dept_emp",
            joinColumns = @JoinColumn(name = "dept_no", referencedColumnName = "dept_no"),
            inverseJoinColumns = @JoinColumn(name = "emp_no", referencedColumnName = "emp_no"))
    private List<Employee> employees;

    @OneToMany
    @JoinColumn(name = "dept_no")
    private List<DepartmentManagement> management;

    public Department() {
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<DepartmentManagement> getManagement() {
        return management;
    }

    public void setManagement(List<DepartmentManagement> management) {
        this.management = management;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Department.class.getSimpleName() + "[", "]")
                .add("departmentNo='" + departmentNo + "'")
                .add("name='" + name + "'")
                .toString();
    }
}
