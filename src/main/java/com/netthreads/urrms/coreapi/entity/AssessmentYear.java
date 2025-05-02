package com.netthreads.urrms.coreapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AssessmentYear extends ParentEntity {

    private String code;
    private String description;
    private Date startDate;
    private Date endDate;
    private Status activationStatus;
}
