package com.findajob.backend.data;

import java.util.Date;

import com.findajob.backend.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacantData {

    private int id;
    private Date date;
    private Category category;
    private String name;
    private String description;
    private String image;
    private double salary;
    private boolean enable;

}
