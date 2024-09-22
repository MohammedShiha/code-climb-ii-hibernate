package code.climb.hibernate.employees.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.StringJoiner;

@Entity(name = "management")
@Table(name = "dept_manager")
public class DepartmentManagement {
    @EmbeddedId
    private DepartmentManagementPK departmentManagementPK;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @OneToOne
    @JoinColumn(name = "emp_no", insertable = false, updatable = false)
    private Employee manager;

    @OneToOne
    @JoinColumn(name = "dept_no", insertable = false, updatable = false)
    private Department department;

    public DepartmentManagement() {
    }

    public DepartmentManagementPK getDepartmentManagementPK() {
        return departmentManagementPK;
    }

    public void setDepartmentManagementPK(DepartmentManagementPK departmentManagementPK) {
        this.departmentManagementPK = departmentManagementPK;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DepartmentManagement.class.getSimpleName() + "[", "]")
                .add("departmentManagementPK=" + departmentManagementPK)
                .add("fromDate=" + fromDate)
                .add("toDate=" + toDate)
                .add("manager=" + manager)
                .toString();
    }
}
