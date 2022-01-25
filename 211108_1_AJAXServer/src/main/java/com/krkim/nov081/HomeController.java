package com.krkim.nov081;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.krkim.nov081.fruit.FruitDAO;
import com.krkim.nov081.gift.GiftDAO;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private FruitDAO fDAO;
	@Autowired
	private GiftDAO gDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		fDAO.getAllFruit(req);
		gDAO.getAllGift(req);
		
		return "index";
	}
	
}
