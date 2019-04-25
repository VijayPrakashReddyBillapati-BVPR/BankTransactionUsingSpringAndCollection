package com.cg.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.CustomerDetails;

@Repository
@Component
public class BankDaoImpl implements BankDao {

	public CustomerDetails setInfo() {
		// TODO Auto-generated method stub
		CustomerDetails customer = new CustomerDetails();
		customer.setFirstName("vijayprakash");
		customer.setLastName("reddy");
		customer.setEmailId("reddybvpr@gmail.com");
		customer.setAadharNo("432112341234");
		customer.setMobileNo("8880749833");
		customer.setPancardNo(12344534);
		customer.setPassword("tharak438");
		customer.setAddress("Hyd");
		customer.setBalance(90000);
		customer.setAccountNo(101);
		return customer;
	}

	public CustomerDetails register(@RequestBody CustomerDetails cd) {
		// TODO Auto-generated method stub
		return cd;
	}

	public int login(ArrayList<CustomerDetails> custList, CustomerDetails c) {
		// TODO Auto-generated method stub
		int accNo = 0;
		System.out.println(c.getAccountNo());
		for (CustomerDetails customerDetails : custList) {
			if(customerDetails.getAccountNo() == c.getAccountNo() && customerDetails.getPassword().equals(c.getPassword())) {
				accNo = c.getAccountNo();
			}
		}
		return accNo;
	}
}
