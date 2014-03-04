package org.example.action;

import javax.annotation.Resource;

import org.example.form.NestedForm;
import org.example.form.NestedForm.User;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class NestedAction {

	@Resource
	@ActionForm
	protected NestedForm nestedform;
	
    @Execute(validator = false)
	public String set() {
    	//user が null なので、インスタンス化しておかないとエラーになる。別の回避策ないかな・・・。
    	nestedform.user = new User();
        return "set.jsp";
	}
    
    @Execute(validator = false)
	public String output() {
        return "output.jsp";
	}
    
    
}
