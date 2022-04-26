package com.EBsol.Entity;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "candidate")
public class Candidate extends BaseEntity {


//    @OneToOne(cascade = CascadeType.MERGE)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    public User user;
}
