package com.freight.friend.fmcsa.service;


import com.freight.friend.fmcsa.domain.Census;
import com.freight.friend.fmcsa.exception.NotFoundException;
import com.freight.friend.fmcsa.model.CensusDto;
import com.freight.friend.fmcsa.repository.CarrierRepository;
import com.freight.friend.fmcsa.repository.CensusRepository;
import com.freight.friend.fmcsa.repository.InspectionRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class CarrierService {

    private final CarrierRepository carrierRepository;

    private final InspectionRepository inspectionRepository;

    private final CensusRepository censusRepository;

    @Autowired
    public CarrierService(CarrierRepository carrierRepository, InspectionRepository inspectionRepository, CensusRepository censusRepository) {
        this.carrierRepository = carrierRepository;
        this.inspectionRepository = inspectionRepository;
        this.censusRepository = censusRepository;
    }

    @Transactional
    public CensusDto buildFmscaCarrierInformation(final String usDotNumber) {

        final Census result = censusRepository.findByCensusumber(usDotNumber);

        if (result == null || StringUtils.isBlank(result.getCensusumber())) {
            {
                throw new NotFoundException(String.format("Us Dot number %s,is not found " +
                        "please try again.", usDotNumber));
            }
        }
        System.out.println(result.toString());

        return CensusDto.builder()
                .legalName(result.getLegalName()).doingBusinessName(result.getDoingBusinessName())
                .addressStreet(result.getAddressStreet()).addressCity(result.getAddressCity())
                .addressState(result.getAddressState()).addressZip(result.getAddressZip())
                .addressLandPhone(result.getAddressLandPhone()).addressCellPhone(result.getAddressCellPhone())
                .classification(result.getClassification()).classInterstate(result.getClassInterstate())
                .classIntrHazmat(result.getClassIntrHazmat()).classIntrNonHazmat(result.getClassIntrNonHazmat())
                .hazmatInd(result.getHazmatInd()).totalTrucks(result.getTotalTrucks()).totalPwdUnits(result.getTotalPwdUnits())
                .totalDrivers(result.getTotalDrivers()).ratting(result.getRatting()).rateDate(result.getRateDate())
                .emailAddress(result.getEmailAddress())
                .build();
    }
}
