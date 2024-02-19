package kr.co.iei.member.dao;

import org.apache.ibatis.session.SqlSession;

import kr.co.iei.member.domain.vo.MemberVO;

// 연결을 가지고 쿼리문을 실행해주는 클래스
public class MemberDAO {

	public int insertMember(SqlSession session, MemberVO member) {
		int result = session.insert("MemberMapper.insertMember", member);
		return result;
	}

}
