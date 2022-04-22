package com.bat.service.customer;

import com.bat.model.Customer;
import com.bat.model.Province;
import com.bat.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
