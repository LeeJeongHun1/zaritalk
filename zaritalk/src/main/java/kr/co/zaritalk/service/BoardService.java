package kr.co.zaritalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.zaritalk.mapper.BoardMapper;
import kr.co.zaritalk.vo.Board;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<Board> selectList() {
		return mapper.selectList();
	}
}