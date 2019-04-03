package com.freight.friend.fmcsa.controller;

import com.freight.friend.fmcsa.model.CensusDto;
import com.freight.friend.fmcsa.service.CarrierService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(FmscaPathConstants.FMSCA_API_PATH)
public class FmscaContoller {

    @Autowired
    private CarrierService carrierService;

    @ApiOperation(value = "Health check",
            notes = "Returns the name of the service that indicates the service is up and running.",
            httpMethod = "GET",
            nickname = "Echo")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String echo() {
        return "Fmcsa service is running!";
    }

    @ApiOperation(value = "Get carrier information",
            notes = "This endpoint returns the carrier name and address information",
            httpMethod = "GET",
            nickname = "getCarrierInfo")
    @RequestMapping(
            value = "/dot/{usDotNumber}",
            method = {RequestMethod.GET,
                    RequestMethod.POST},
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CensusDto getCarrierInfo(@PathVariable final String usDotNumber) {
        return carrierService.buildFmscaCarrierInformation(usDotNumber);
    }

}
