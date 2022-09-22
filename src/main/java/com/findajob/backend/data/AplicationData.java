package com.findajob.backend.data;

import java.util.Date;

import com.findajob.backend.entities.User;
import com.findajob.backend.entities.Vacant;

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
public class AplicationData {

    private int id;
    private User user;
    private Vacant vacant;
    private Date date;
    private String comment;

}
