package code.climb.hibernate.employees.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.StringJoiner;

@Embeddable
public class SalaryPK implements Serializable {
    @Column(name = "emp_no")
    private Integer employeeNo;

    @Column(name = "from_date")
    private LocalDate fromDate;

    public SalaryPK() {
    }

    public SalaryPK(Integer employeeNo, LocalDate fromDate) {
        this.employeeNo = employeeNo;
        this.fromDate = fromDate;
    }

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SalaryPK.class.getSimpleName() + "[", "]")
                .add("employeeNo=" + employeeNo)
                .add("fromDate=" + fromDate)
                .toString();
    }
}
