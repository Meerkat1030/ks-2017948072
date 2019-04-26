package ac.ks.web2.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idx;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String website;

    @Column
    private LocalDate startdate;

    @Column
    private LocalDate enddate;

    @Column
    private String summry;

    @Builder

    public Work(String company, String position, String website, LocalDate startdate, LocalDate enddate, String summry) {
        this.company = company;
        this.position = position;
        this.website = website;
        this.startdate = startdate;
        this.enddate = enddate;
        this.summry = summry;
    }
}