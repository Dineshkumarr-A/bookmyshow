package models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie; // one movie can have multiple show not at a particular time
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen; // on screen can have multiple shows not at a particular time
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
