package com.cg.payroll.services;
import java.sql.SQLException;
import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.daoservices.PayrollDAOServices;
import com.cg.payroll.daoservices.PayrollDAOServicesImpl;
import com.cg.payroll.exception.AssociateDetailsNotFoundException;
import com.cg.payroll.exception.PayrollServicesDownException;

public class PayrollServicesImpl implements PayrollServices{
	private PayrollDAOServices daoServices;
	
	public PayrollServicesImpl() {}
	public PayrollServicesImpl(PayrollDAOServices daoServices) {
		super();
		this.daoServices = daoServices;
	}


	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailID, String department,
			String designation, String pancard, int yearlyInvestmentUnder80C, int basicSalary, int companyPf, int epf,
			int accountNumber, String bankName, String ifscCode) throws PayrollServicesDownException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateNetSalary(int associateId)
			throws AssociateDetailsNotFoundException, PayrollServicesDownException {
		return 0;
	}

	@Override
	public Associate getAssociateDetails(int associateId)
			throws PayrollServicesDownException, AssociateDetailsNotFoundException {
		try {
			Associate associate = null;
			associate = daoServices.getAssociate(associateId);
			if(associate==null)throw new AssociateDetailsNotFoundException("Associate Details Not Found");
			return associate;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PayrollServicesDownException(e);
		}

		
	}

	@Override
	public List<Associate> getAllAssociatesDetails() throws PayrollServicesDownException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAssociate(int associateId) throws PayrollServicesDownException {
		// TODO Auto-generated method stub
		return false;
	}

	
}
