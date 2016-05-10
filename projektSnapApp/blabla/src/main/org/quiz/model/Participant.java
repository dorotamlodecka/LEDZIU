package quiz.model;

import javax.persistence.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Kasia on 2016-05-08.
 */
@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private File photo;
    @Column
    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<Happening> happenings = new ArrayList<Happening>();
    @Column
    @ManyToMany(cascade = CascadeType.ALL)
    private Collection <Point> pointList = new ArrayList<Point>();

    public Participant() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public Collection<Happening> getHappenings() {
        return happenings;
    }

    public void setHappenings(Collection<Happening> happenings) {
        this.happenings = happenings;
    }

    public Collection<Point> getPointList() {
        return pointList;
    }

    public void setPointList(Collection<Point> pointList) {
        this.pointList = pointList;
    }
}
