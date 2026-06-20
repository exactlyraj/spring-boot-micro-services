package com.learning.address.service;

import com.learning.address.model.AddressRequest;
import com.learning.address.model.AddressResponse;

import java.util.List;

public interface AddressService {
    public AddressRequest addAddress(AddressRequest addressRequest);
    public List<AddressRequest> addAddress(List<AddressRequest> addressRequest);
    public AddressResponse getAddress(Long addressId);
}
