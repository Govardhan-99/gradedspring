package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bins.Account;
import com.example.bins.Employee;
import com.example.dao.AccountRepository;
import com.example.dao.EmployeeRepository;

@Service
public class AccountServiceImple implements IAccount{

	@Autowired
	private AccountRepository account;
	@Autowired
	private EmployeeRepository emp;
	
//	Add Account
	@Override
	public Account addAccount(Account ac) {
			emp.save(ac.getEmployee());
			return account.saveAndFlush(ac);
	
	}
//	Get Account Details
	@Override
	public List<Account> getAccounts() {
		return account.findAll();
	}


}
