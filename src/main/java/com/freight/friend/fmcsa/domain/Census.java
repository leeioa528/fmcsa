package com.freight.friend.fmcsa.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "LATEST_FF_FMCSA_CENSUS_FULL")
public class Census {

    @Id
    @Column(name = "HASH_KEY")
    private String id;

    @NaturalId
    @Column(name = "CENSUS_NUM")
    private String censusumber;

    @Column(name = "NAME")
    private String legalName;

    @Column(name = "NAME_DBA")
    private String doingBusinessName;
    //physical address info
    @Column(name = "PHY_STR")
    private String addressStreet;

    @Column(name = "PHY_CITY")
    private String addressCity;

    @Column(name = "PHY_ST")
    private String addressState;

    @Column(name = "PHY_ZIP")
    private String addressZip;

    @Column(name = "TEL_NUM")
    private String addressLandPhone;

    @Column(name = "CELL_NUM")
    private String addressCellPhone;

    @Column(name = "CLASS")
    private String classification;

    @Column(name = "CRRINTER")
    private String classInterstate;

    @Column(name = "CRRHMINTRA")
    private String classIntrHazmat;

    @Column(name = "CRRINTRA")
    private String classIntrNonHazmat;

    @Column(name = "HM_IND")
    private String hazmatInd;

    @Column(name = "TOT_TRUCKS")
    private String totalTrucks;

    @Column(name = "TOT_PWR")
    private String totalPwdUnits;

    @Column(name = "TOT_DRS")
    private String totalDrivers;

    @Column(name = "RATING")
    private String ratting;

    @Column( name ="RATEDATE" )
    private String rateDate;

    @Column( name ="EMAILADDRESS" )
    private String emailAddress;



}
