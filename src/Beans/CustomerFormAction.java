package Beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class CustomerFormAction extends ActionForm {
	
	public int id;
	public String name,email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors ae=new ActionErrors();
		if(id<10){
			ae.add("id_e", new ActionMessage("id_error_msg"));
		}if(name.equals("")){
			ae.add("name_e", new ActionMessage("name_error_msg"));
		} if(email.isEmpty()){
			ae.add("email_e", new ActionMessage("email_error_msg"));
		}
		
		return ae;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		id=10;
		name="Eg.,kamalesan";
		email="Eg.,kamalesan@gmail.com";
		super.reset(mapping, request);
	}
	
}
