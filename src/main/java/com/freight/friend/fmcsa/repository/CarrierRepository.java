package com.freight.friend.fmcsa.repository;

import com.freight.friend.fmcsa.domain.Carrier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrierRepository extends CrudRepository<Carrier, String> {

    //Carrier findByInspectionId(String inspectionId);
    List<Carrier> findByInspectionIdOrderByInsertedDateDesc(String inspectionId);
    List<Carrier> findByInspectionId(String inspectionId);
}
