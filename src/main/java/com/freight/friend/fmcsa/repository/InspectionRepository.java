package com.freight.friend.fmcsa.repository;

import com.freight.friend.fmcsa.domain.Inspection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionRepository extends CrudRepository<Inspection, String> {

    Inspection findByInspUsdotNumber(String inspUsdotNumber);
}
