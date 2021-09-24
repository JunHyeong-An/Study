package com.itbank.model;

import java.util.List;
import java.util.Map;

public interface GuestBookDAO {
	public String test();
	
	public int insert(Map<String, String> map);
	
	public List<GuestBookDTO> selectAll();
}
