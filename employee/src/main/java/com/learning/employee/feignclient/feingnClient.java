package com.learning.employee.feignclient;

import com.learning.address.model.AddressResponse;
import com.learning.employee.model.ESEntity;
import com.learning.springai.entity.FirstIndexEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class feingnClient {

    @FeignClient(url = "http://localhost:8082/", path = "address", name = "address-feingclient")
    public static interface AddressFeingClient {

        @GetMapping("/getaddress/{addressId}")
        public AddressResponse getAddressbyId(@PathVariable Long addressId);

    }

    @FeignClient(url = "http://localhost:8084/", name = "SpringAI-InsertinES-feingclient")
    public static interface SpringAIFeignclient {

        @PostMapping("/insertines")
        public ESEntity insertintoES(@RequestBody ESEntity prompt);

    }
}
