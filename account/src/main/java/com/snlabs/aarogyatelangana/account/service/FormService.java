package com.snlabs.aarogyatelangana.account.service;

import com.snlabs.aarogyatelangana.account.beans.Declaration;
import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.Invasive;
import com.snlabs.aarogyatelangana.account.beans.NonInvasive;
import com.snlabs.aarogyatelangana.account.beans.SectionA;

public interface FormService {
	public int createForm(Form form);

	public Form searchForm(int formId);

	public Form searchFormByDateRange(String fromDate, String toDate);

	public int saveSectionA(SectionA section);

	public int saveNonInvasiveDetails(NonInvasive nonInvasive);

	public int saveInvasiveDetails(Invasive invasive);
	
	public int saveDeclarationDetails(Declaration declaration);
}
