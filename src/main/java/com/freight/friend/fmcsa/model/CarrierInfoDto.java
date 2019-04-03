package com.freight.friend.fmcsa.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel( description = "A payload that contains all carrier information" )
public class CarrierInfoDto {

    @ApiModelProperty( "The carrier name" )
    private String carrierName;

    @ApiModelProperty( "The street address of the carrier" )
    private String carrierStreet;

    @ApiModelProperty( "The city of the carrier" )
    private String carrierCity;

    @ApiModelProperty( "The state of the carrier" )
    private String carrierState;

    @ApiModelProperty( "The zipcode of the carrier" )
    private String carrierZipCode;




}
