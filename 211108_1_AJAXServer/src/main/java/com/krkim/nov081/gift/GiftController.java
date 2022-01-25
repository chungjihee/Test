package com.krkim.nov081.gift;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GiftController {
	
	@Autowired
	private GiftDAO gDAO;
	
//	@RequestMapping(value="/gift.get", method=RequestMethod.GET, produces="application/xml; charset=utf-8")
//	public @ResponseBody Gifts giftGetXML(HttpServletRequest req) {
//		return gDAO.getXML(req);
//	}
	
}
