package org.zerock.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.zerock.domain.MemberVO;

public class MemberService {
	
	private List<MemberVO> list;
	
	public MemberService() {
		list = new ArrayList<>();
		
		for(int i=0; i<100; i++) {
			MemberVO vo = new MemberVO();
			vo.setUid("user"+i);
			vo.setUpw("user"+i);
			vo.setUname("사용자"+i);
			
			list.add(vo);
		}
		
	}
	
	public MemberVO findByUidUpw(String uid, String upw) {
		
		Optional<MemberVO> result = list.stream().filter(member -> 
			 member.getUid().equals(uid) && member.getUpw().equals(upw)
		).findFirst();
		
		return result.isPresent() ? result.get() : null;
	}
}
