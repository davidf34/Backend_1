package com.findajob.backend.converters;

import com.findajob.backend.data.RoleData;
import com.findajob.backend.entities.Role;

public class RoleConverter extends Converter<Role,RoleData> {

    @Override
    public Role toEntity(RoleData object) {
        return (Role.builder())
            .id(object.getId())
            .name(object.getName())
            .build();
    }

    @Override
    public RoleData toData(Role object) {
        return RoleData.builder()
            .id(object.getId())
            .name(object.getName())
            .build();
    }
    
}
