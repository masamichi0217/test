package org.example.action;

import org.example.form.EchoForm;
import org.example.form.EmployeeForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EmployeeAction {

	@ActionForm
	protected EmployeeForm employeeForm;
	
	//フォームはどうやら複数定義的なことが出来ないらしい。この場合employeeFormのみがDIされてる。
	@ActionForm
	protected EchoForm echoForm;
	
	public String name;
	
	@Execute(validator=false,urlPattern="detail/{empId}")
	public String index(){
		this.name ="test";		
		return "employee.jsp";
	}
	
	
	//EchoFormがDIされていないので、何も表示されない
	@Execute(validator=false,urlPattern="name/{name}")
	public String test(){

		return "employee.jsp";
	}
	
}
