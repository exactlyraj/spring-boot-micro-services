package com.learning.employee.feignclient;

import com.learning.address.model.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class feingnClient {
    @Service
    @FeignClient(url = "http://localhost:8082/",path = "address", name = "address-feingclient")
    public static interface AddressFeingClient {

        @GetMapping("/getaddress/{addressId}")
        public AddressResponse getAddressbyId(@PathVariable Long addressId);


    }
}
