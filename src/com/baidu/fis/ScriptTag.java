package com.baidu.fis;

import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class ScriptTag extends BodyTagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2298651716053938808L;
	
	public int doStartTag(){
		return EVAL_BODY_BUFFERED;
	}

	public int doEndTag(){
		Resource resource = Resource.getInstance();
		BodyContent body = this.getBodyContent();
		String code = body.getString();
		resource.addScriptPool(code);
		return EVAL_PAGE;
	}
}
