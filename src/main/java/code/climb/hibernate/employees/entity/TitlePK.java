package code.climb.hibernate.employees.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.StringJoiner;

@Embeddable
public class TitlePK implements Serializable {
    @Column(name = "emp_no")
    private Integer employeeNo;

    private String title;

    @Column(name = "from_date")
    private LocalDate fromDate;

    public TitlePK() {
    }

    public TitlePK(Integer employeeNo, String title, LocalDate fromDate) {
        this.employeeNo = employeeNo;
        this.title = title;
        this.fromDate = fromDate;
    }

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TitlePK.class.getSimpleName() + "[", "]")
                .add("employeeNo=" + employeeNo)
                .add("title='" + title + "'")
                .add("fromDate=" + fromDate)
                .toString();
    }
}
