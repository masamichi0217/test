package org.example.action;

import javax.annotation.Resource;

import org.example.form.EmployeeForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class HogeAction {
	
	//アクションとフォームはどうやら別の名前でも問題無いらしい。
	@Resource
	@ActionForm
	protected EmployeeForm employeeForm;
	
	
	
	//なぜかSESSIONがDIされない？んー、、なぞが残るがActionFormにしてあげたらできた。
	//@Resource
	//@ActionForm
	//protected UserDto userDto;
	
	@Execute(validator=false,urlPattern="detail/{empId}")
	public String index(){

		return "fuga.jsp";
	}
	
	//これは使えない。DTO使ってるし。
	@Execute(validator=false)
	public String input(){
		
		
		return "input.jsp";
	}
	//これもそう。
	@Execute(validator = false , urlPattern="list")
	public String fuga() {

		return "fuga.jsp";
	}

	@Execute(validator=false)
	public String sample(){
		
		
		return "sample.jsp";
	}
	
	@Execute(validator=false)
	public String send(){
		
		return "send.jsp";
	}
}
