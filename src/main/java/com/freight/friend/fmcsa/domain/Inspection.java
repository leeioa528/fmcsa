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

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "FMCSA_INSPECTION")
public class Inspection {

    @Id
    @Column(name = "HASH_KEY")
    private String id;

    @Column(name = "INSPECTION_ID")
    private String inspectionId;

    @NaturalId
    @Column(name = "USDOT_NUMBER")
    private String inspUsdotNumber;


}
