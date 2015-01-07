package com.snlabs.aarogyatelangana.account.dao;

import com.snlabs.aarogyatelangana.account.beans.Declaration;
import com.snlabs.aarogyatelangana.account.beans.Form;
import com.snlabs.aarogyatelangana.account.beans.Invasive;
import com.snlabs.aarogyatelangana.account.beans.NonInvasive;
import com.snlabs.aarogyatelangana.account.beans.SectionA;

public interface FormDao {
	public int save(Form form);

	public boolean update(Form form);

	public Form findByFormId(int formId);

	public boolean delete(Form patient);

	public Form findByFromName(String formName);

	public Form searchFormByDateRange(String fromDate, String toDate);

	public int saveSectionA(SectionA sectionA);

	public int saveNonInvasive(NonInvasive nonInvasive);

	public int saveInvasive(Invasive invasive);
	
	public int saveDeclaration(Declaration declaration);
}
