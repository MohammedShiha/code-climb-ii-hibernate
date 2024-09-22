package code.climb.hibernate.employees.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.StringJoiner;

@Entity(name = "title")
@Table(name = "titles")
public class Title {
    @EmbeddedId
    private TitlePK titlePK;

    @Column(name = "to_date")
    private LocalDate toDate;

    public Title() {
    }

    public TitlePK getTitlePK() {
        return titlePK;
    }

    public void setTitlePK(TitlePK titlePK) {
        this.titlePK = titlePK;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Title.class.getSimpleName() + "[", "]")
                .add("titlePK=" + titlePK)
                .add("toDate=" + toDate)
                .toString();
    }
}
