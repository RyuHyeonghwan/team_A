package org.zerock.mapper;

import org.zerock.domain.MemberVO;

public interface MemberMapper {

	public MemberVO read(String userid);
	public void createMember(MemberVO member);
	public void createMemberAuth(MemberVO member);
}
