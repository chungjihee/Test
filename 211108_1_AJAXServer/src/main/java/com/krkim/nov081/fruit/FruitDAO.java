package com.krkim.nov081.fruit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void getAllFruit(HttpServletRequest req) {
		try {
			req.setAttribute("fruits", ss.getMapper(FruitMapper.class).getAllFruit());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	// Spring에서 xml 끌어오는 시스템 : XML AJAX Server
	//		Spring XML AJAX Server
	//		현재] DB에 있는 과일데이터 하나를 표현할 JavaBean(Fruit.java)를 가지고 있는 상태
	//		우리가 필요한 것 ]
	//					1. DB에 있는 '과일테이블'을 표현할 또 하나의 JavaBean이 필요
	//					2. Spring이 xml로 바꿀 수 있도록 각각의 JavaBeans에 @XmlRootElement annotion 달기
	//					3. Setter위에 @XmlElemet라고 annotion
	
	// AjaxXml
	public Fruits getXML(HttpServletRequest req) {
		List<Fruit> fruits = ss.getMapper(FruitMapper.class).getAllFruit();
		Fruits fruitss = new Fruits(fruits);
		return fruitss;
	}
	
}
