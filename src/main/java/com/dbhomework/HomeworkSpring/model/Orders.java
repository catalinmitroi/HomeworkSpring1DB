package com.dbhomework.HomeworkSpring.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Orders {
    @Id
    @GeneratedValue
    private Integer id;
    private String status;
    private String comments;
}
