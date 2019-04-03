package com.freight.friend.fmcsa.repository;

import com.freight.friend.fmcsa.domain.Census;
import org.springframework.data.repository.CrudRepository;

public interface CensusRepository extends CrudRepository<Census, String> {
    Census findByCensusumber(String censusNumber);
}
