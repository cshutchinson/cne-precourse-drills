package com.galvanize;

import java.util.List;

interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
