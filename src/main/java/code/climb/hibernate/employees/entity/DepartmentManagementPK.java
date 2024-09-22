package code.climb.hibernate.employees.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.StringJoiner;

@Embeddable
public class DepartmentManagementPK implements Serializable {
    @Column(name = "emp_no")
    private Integer employeeNo;

    @Column(name = "dept_no")
    private String departmentNo;

    public DepartmentManagementPK() {
    }

    public DepartmentManagementPK(Integer employeeNo, String departmentNo) {
        this.employeeNo = employeeNo;
        this.departmentNo = departmentNo;
    }

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DepartmentManagementPK.class.getSimpleName() + "[", "]")
                .add("employeeNo=" + employeeNo)
                .add("departmentNo=" + departmentNo)
                .toString();
    }
}
