package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor
public class CommonServiceImpl implements CommonService {

	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder pwEncoder;
	private MemberMapper memberMapper;
	
	@Transactional
	@Override
	public void customSignup(MemberVO member) {
		member.setUserpw(pwEncoder.encode(member.getUserpw()));
		log.info("User Sec PW" + member.getUserpw());
		memberMapper.createMember(member);
		memberMapper.createMemberAuth(member);
	}

}
