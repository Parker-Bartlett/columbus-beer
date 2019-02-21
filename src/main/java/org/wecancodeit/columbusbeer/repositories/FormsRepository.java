package org.wecancodeit.columbusbeer.repositories;

import java.util.List;

import org.wecancodeit.columbusbeer.Form;

public class FormsRepository {
	
	List<Form> forms;

	public FormsRepository(List<Form> forms) {
		this.forms = forms;
	}
	
	public void addForm(Form form) {
		forms.add(form);
	}

	public List<Form> getForms() {
		return forms;
	}

	@Override
	public String toString() {
		return "FormsRepository [forms=" + forms + "]";
	}
	
	
}
