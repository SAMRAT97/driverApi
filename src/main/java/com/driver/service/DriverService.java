package com.driver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.driver.entities.Driver;
import com.driver.model.DriverRequest;
import com.driver.model.DriverResponse;

@Service
public interface DriverService {

	public Driver getDriverById(String driverId);
	public DriverResponse addDriver(DriverRequest driverRequest);
	public DriverResponse updateDriver(String driverId,DriverRequest driverRequest);
	public DriverResponse deleteDriver(String driverId);
	public List<Driver> getAllDrivers(String transporterId, String phoneNum, String truckId,@RequestParam Optional<Integer> page);
	
	
}
