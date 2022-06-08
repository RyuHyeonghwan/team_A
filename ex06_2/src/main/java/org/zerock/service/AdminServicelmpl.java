package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zerock.mapper.AdminMapper;
import org.zerock.domain.GoodVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServicelmpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;	
	
	/* 상품 등록 */
	@Override
	public void goodregister(GoodVO good) {
		
		log.info("(srevice)상품등록........");
		
		adminMapper.goodregister(good);
		
	}

}
