package code.climb.hibernate.employees.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.StringJoiner;

@Entity(name = "salary")
@Table(name = "salaries")
public class Salary {
    @EmbeddedId
    private SalaryPK salaryPK;

    private Integer salary;

    @Column(name = "to_date")
    private LocalDate toDate;

    public Salary() {
    }

    public SalaryPK getSalaryPK() {
        return salaryPK;
    }

    public void setSalaryPK(SalaryPK salaryPK) {
        this.salaryPK = salaryPK;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Salary.class.getSimpleName() + "[", "]")
                .add("salaryPK=" + salaryPK)
                .add("salary=" + salary)
                .toString();
    }
}
