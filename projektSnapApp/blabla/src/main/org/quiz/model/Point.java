package quiz.model;

import javax.persistence.*;

/**
 * Created by Kasia on 2016-05-08.
 */
@Entity
public class Point {

    static Integer PRESENT = 1;
    static  Integer NOT_PRESENT = -1;
    static Integer PRESENT_ON_WRONG = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private Integer pointValue;
    @Column
    private String  information;

    public Point() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
