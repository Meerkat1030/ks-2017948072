package ac.ks.web2.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idx;

    @Column
    private String address;

    @Column
    private String postcode;

    @Builder

    public Location(String address, String postcode) {
        this.address = address;
        this.postcode = postcode;
    }
}
