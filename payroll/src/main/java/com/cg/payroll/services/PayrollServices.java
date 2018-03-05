package com.cg.payroll.services;

import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exception.AssociateDetailsNotFoundException;
import com.cg.payroll.exception.PayrollServicesDownException;

public interface PayrollServices {
	
	public int acceptAssociateDetails(String firstName, String lastName,String emailID,String department, String designation, String pancard,int yearlyInvestmentUnder80C,int basicSalary,int companyPf,int epf, int accountNumber,String bankName, String ifscCode) throws PayrollServicesDownException;
	
	int calculateNetSalary(int associateId)throws AssociateDetailsNotFoundException,PayrollServicesDownException;
	
	Associate getAssociateDetails(int associateId)throws PayrollServicesDownException,AssociateDetailsNotFoundException;
	
	List<Associate> getAllAssociatesDetails()throws PayrollServicesDownException;
	
	boolean removeAssociate(int associateId) throws PayrollServicesDownException;
}
