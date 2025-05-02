package com.netthreads.urrms.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Location extends ParentEntity {

    private String code;
    private String locationName;
    private boolean enabled = true;
    private LocationType locationType;
}
