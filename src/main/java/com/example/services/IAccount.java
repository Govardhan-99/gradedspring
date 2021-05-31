package com.example.services;

import java.util.List;

import com.example.bins.Account;
import com.example.bins.Employee;

public interface IAccount {
	public Account addAccount(Account list);
	public List<Account> getAccounts();
}
