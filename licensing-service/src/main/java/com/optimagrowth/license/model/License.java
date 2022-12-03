package com.optimagrowth.license.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class License {

    private Integer id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
