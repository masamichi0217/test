package org.example.action;

import javax.annotation.Resource;

import org.example.form.EchoForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;


public class EchoAction {

	
	/*ActionForm*/
	@Resource
	@ActionForm
	protected EchoForm echoForm;
	
	@Execute(validator=false)
	public String index(){
		
		return "input.jsp";
	}
	
	@Execute(validator=true, input="input.jsp")
	public String echo(){
		
		return "echo.jsp";
	}
	
	
	
}
