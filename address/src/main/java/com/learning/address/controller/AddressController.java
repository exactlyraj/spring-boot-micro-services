package com.learning.address.controller;

import com.learning.address.model.AddressRequest;
import com.learning.address.model.AddressResponse;
import com.learning.address.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressServiceImpl addressServiceImpl;
    @PostMapping("/office")
    public ResponseEntity<AddressRequest> createAddress(@RequestBody AddressRequest addressRequest){
          return ResponseEntity.ok(addressServiceImpl.addAddress(addressRequest));
    }


    @PostMapping("/officelist")
    public ResponseEntity<List<AddressRequest>> createAddressList(@RequestBody List<AddressRequest> addressRequest){
        return ResponseEntity.ok(addressServiceImpl.addAddress(addressRequest));
    }

    @GetMapping("/getaddress/{addressId}")
    public ResponseEntity<AddressResponse> getAddressbyId(@PathVariable Long addressId){
        return ResponseEntity.ok(addressServiceImpl.getAddress(addressId));
   }
}
