package com.system.parkinglot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.system.parkinglot.model.dto.ParkingLotRequest;
import com.system.parkinglot.model.dto.ParkingLotResponse;
import com.system.parkinglot.service.IParkingLotService;


@RestController
@RequestMapping("/api/v1/parking-lots")
public class ParkingLotController {
    
    @Autowired
    private IParkingLotService iParkingLotService;
    
    @PostMapping
    public ResponseEntity<ParkingLotResponse> createParkingLot( @RequestBody ParkingLotRequest parkingLotRequest){
            
            return iParkingLotService.createParkingLot(parkingLotRequest);

    }

      
    
}
