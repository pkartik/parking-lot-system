package com.system.parkinglot.service;

import org.springframework.http.ResponseEntity;

import com.system.parkinglot.model.dto.ParkingLotRequest;
import com.system.parkinglot.model.dto.ParkingLotResponse;


public interface IParkingLotService {

    public ResponseEntity<ParkingLotResponse> createParkingLot(ParkingLotRequest parkingLotRequest);

    
}
