package com.learning.address.service;

import com.learning.address.model.AddressRequest;
import com.learning.address.model.AddressResponse;
import com.learning.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    public AddressRequest addAddress(AddressRequest addressRequest){
          return addressRepository.save(addressRequest);
    }

    public List<AddressRequest> addAddress(List<AddressRequest> addressRequest){
        return addressRepository.saveAll(addressRequest);
    }

    @Override
    public AddressResponse getAddress(Long addressId) {
        AddressRequest addressRequest = addressRepository.findById(addressId).get();
       return new AddressResponse(addressRequest.getCity(), addressRequest.getState());
    }


}
