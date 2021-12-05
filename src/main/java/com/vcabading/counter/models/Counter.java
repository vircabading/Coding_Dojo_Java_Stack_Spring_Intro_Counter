package com.vcabading.counter.models;

import javax.servlet.http.HttpSession;

/////////////////////////////////////////////////////////////
//	COUNTER CLASS
/////////////////////////////////////////////////////////////

public class Counter {
		
	//	//// CONSTRUCTORS ///////////////////////////////////
	
	public Counter() {
	}
	
	//	//// ACTION /////////////////////////////////////////
	
	public void addCount(HttpSession session) {
		if (session.getAttribute("count") == null) {
		    // Use setAttribute to initialize the count in session
			session.setAttribute("count", 1);
		}
		else {
		    // increment the count by 1 using getAttribute and setAttribute
			Integer count = this.getCount(session);
			session.setAttribute("count", count+1);
		}
	}
	
	//	//// GETTERS ////////////////////////////////////////
	
	public Integer getCount(HttpSession session) {
	    return (Integer) session.getAttribute("count");
	}

}
