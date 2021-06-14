package com.itbank.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itbank.model.GuestBookDAO;
import com.itbank.model.GuestBookDTO;

@Service
public class GuestBookService {
	@Autowired
	private GuestBookDAO dao;
	private ObjectMapper mapper = new ObjectMapper();

	public int insert(Map<String, String> map) {
		String date = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		map.put("writeDate", date);
		return dao.insert(map);
	}

	public String selectAll() throws JsonProcessingException {
		List<GuestBookDTO> list = dao.selectAll();
		List<Map<String, String>> list_map = new ArrayList<Map<String,String>>();
		
		for(GuestBookDTO dto : list) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("writer", dto.getWriter());
			map.put("content", dto.getContent());
			map.put("writeDate", dto.getWriteDate().substring(0, 10));
			list_map.add(map);
		}
		return mapper.writeValueAsString(list_map);
	}
}
