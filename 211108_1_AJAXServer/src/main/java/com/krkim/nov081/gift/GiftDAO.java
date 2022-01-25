package com.krkim.nov081.gift;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftDAO {

	@Autowired
	private SqlSession ss;

	public void getAllGift(HttpServletRequest req) {
		try {
			req.setAttribute("gifts", ss.getMapper(GiftMapper.class).getAllGift());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Gifts getXML(HttpServletRequest req) {
		List<Gift> gifts = ss.getMapper(GiftMapper.class).getAllGift();
		Gifts giftss = new Gifts(gifts);
		return giftss;
	}

}
