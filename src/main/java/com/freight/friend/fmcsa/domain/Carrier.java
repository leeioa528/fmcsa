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
@Table(name = "FMCSA_CARRIER")
public class Carrier {

    @Id
    @Column(name = "HASH_KEY")
    private String id;

   // @NaturalId
    @Column(name = "INSPECTION_ID")
    private String inspectionId;

    @Column(name = "INSP_CARRIER_NAME")
    private String inspCarrierName;

    @Column(name = "INSP_CARRIER_STREET")
    private String inspCarrierStreet;

    @Column(name = "INSP_CARRIER_CITY")
    private String inspCarrierCity;

    @Column(name = "INSP_CARRIER_STATE")
    private String inspCarrierState;

    @Column(name = "INSP_CARRIER_ZIP_CODE")
    private String inspCarrierZipCode;

    @Column(name="INSERTED_DATE")
    private LocalDateTime insertedDate;


}
