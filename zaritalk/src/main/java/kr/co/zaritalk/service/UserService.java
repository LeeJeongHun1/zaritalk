package kr.co.zaritalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.zaritalk.mapper.UserMapper;
import kr.co.zaritalk.vo.Board;

@Service
public class UserService {
	
	@Autowired
	private UserMapper mapper;
	
	public List<Board> selectUser() {
		return mapper.selectUser();
	}
}
