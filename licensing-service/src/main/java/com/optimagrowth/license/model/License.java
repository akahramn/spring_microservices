package com.optimagrowth.license.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@Data
@ToString
public class License extends RepresentationModel<License> {

    private Integer id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
