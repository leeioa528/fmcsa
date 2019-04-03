package com.freight.friend.fmcsa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel( description = "A payload that contains all fmsca read information" )
public class CensusDto {
    @ApiModelProperty( "The legal name" )
    private String legalName;

    @ApiModelProperty( "The doing business name" )
    private String doingBusinessName;

    @ApiModelProperty( "The physical street address" )
    private String addressStreet;

    @ApiModelProperty( "The physical city of the address" )
    private String addressCity;

    @ApiModelProperty( "The physical state of the address" )
    private String addressState;

    @ApiModelProperty( "The physical zipcode of the address" )
    private String addressZip;

    @ApiModelProperty( "The physical telephone number of the address" )
    private String addressLandPhone;

    @ApiModelProperty( "The physical cell phone number of the address" )
    private String addressCellPhone;

    @ApiModelProperty( "The classification" )
    private String classification;

    @ApiModelProperty( "The carrier interstate" )
    private String classInterstate;

    @ApiModelProperty( "The carrier interstate haz mat" )
    private String classIntrHazmat;

    @ApiModelProperty( "The carrier interstate non haz mat" )
    private String classIntrNonHazmat;

    @ApiModelProperty( "The haz mat indicator" )
    private String hazmatInd;

    @ApiModelProperty( "The total number of trucks" )
    private String totalTrucks;

    @ApiModelProperty( "The total power units" )
    private String totalPwdUnits;

    @ApiModelProperty( "The total drivers" )
    private String totalDrivers;

    @ApiModelProperty( "The ratting" )
    private String ratting;


    @ApiModelProperty( "The rate date" )
    @JsonFormat( pattern = "yyyy-MM-dd" )
    private String rateDate;

    @ApiModelProperty( "The email address" )
    private String emailAddress;

}
