package quiz.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Kasia on 2016-05-08.
 */
@Entity
public class Happening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private Date hpDate;
    @Column
    private String hpName;
    @Column
    private String hpDescription;
    @Column

    @ManyToMany(cascade = CascadeType.ALL)
    private Collection <Participant> hpParticipant = new ArrayList<Participant>();;

    public Happening() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHpDate() {
        return hpDate;
    }

    public void setHpDate(Date hpDate) {
        this.hpDate = hpDate;
    }

    public String getHpName() {
        return hpName;
    }

    public void setHpName(String hpName) {
        this.hpName = hpName;
    }

    public String getHpDescription() {
        return hpDescription;
    }

    public void setHpDescription(String hpDescription) {
        this.hpDescription = hpDescription;
    }

    public Collection<Participant> getHpParticipant() {
        return hpParticipant;
    }

    public void setHpParticipant(Collection<Participant> hpParticipant) {
        this.hpParticipant = hpParticipant;
    }
}
