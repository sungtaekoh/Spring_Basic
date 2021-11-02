package com.care.root02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationST.xml";
//		classpath:src/main.resources를 뜻한다/위치를 잡아준다
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
//		컨테이너에 대한 정보를 가져온다/xml의 값을 로드시켜준다
		
		STBean stBean = ctx.getBean("stb",STBean.class);
		//이게 무슨뜻일까..? stb가뭐지?
		
//		STBean stBean = new STBean();
//		stBean.Name("홍길동");
//		stBean.setAge(20);
		
//		stBean.setSt(new Student());
		stBean.namePrint();
		stBean.agePrint();
		
	}
}
