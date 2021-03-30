package com.bit.servlet.dao;

import java.util.List;

public interface PhoneBookDao {

	public List<PhoneBookVo> getList();
	public List<PhoneBookVo> search(String keyword);
	public PhoneBookVo get(Long id);
	public int insert(PhoneBookVo vo);
	public int update(PhoneBookVo vo);
	public int delete(Long id);
	
	
}
