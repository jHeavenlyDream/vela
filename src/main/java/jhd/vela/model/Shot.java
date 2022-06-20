package jhd.vela.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shots")
public class Shot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private Integer number;
    private String description;
    @Column(name = "shot_date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "shot_time")
    @Temporal(TemporalType.TIME)
    private Date time;
}
