package com.findajob.backend.data;

import java.util.Date;
import java.util.List;

import com.findajob.backend.entities.Role;

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
public class UserData {
    
    private int id;
    private String fullname;
    private String nickname;
    private String email;
    private String password;
    private List<Role> roles;
    private Date registration;
    private boolean enable;
}
