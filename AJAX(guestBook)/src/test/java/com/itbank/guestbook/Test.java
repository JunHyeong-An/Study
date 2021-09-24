package com.itbank.guestbook;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itbank.model.GuestBookDAO;
import com.itbank.model.GuestBookDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class Test {
	@Autowired
	private GuestBookDAO dao;
	private ObjectMapper mapper = new ObjectMapper();
	
	@org.junit.Test
	public void test() {
		System.out.println(dao.test());
	}
	
	@org.junit.Test
	public void insert() throws JsonProcessingException {
		String writer = "test";
		String content = "test";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("writer", writer);
		map.put("content", content);
		map.put("writeDate", date);
		
		System.out.println(map);
		String json = mapper.writeValueAsString(map);
		System.out.println(json);
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		Map<String, String> newMap = new HashMap<String, String>();
		
		newMap = mapper.readValue(json,HashMap.class);
		
		System.out.println("newMap : " + newMap);
		
		int result = dao.insert(newMap);
		System.out.println(result);
	}
	
	@org.junit.Test
	public void selectAll() {
		System.out.println();
		System.out.println("============== select ==============");
		List<GuestBookDTO> list = dao.selectAll();
		List<Map<String, String>> list_map = new ArrayList<Map<String,String>>();
		
		System.out.println(list);
		
		for(GuestBookDTO dto : list) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("writer", dto.getWriter());
			map.put("content", dto.getContent());
			map.put("writeDate", dto.getWriteDate().substring(0, 10));
			list_map.add(map);
		}
		System.out.println(list_map);
		System.out.println();
	}
}











