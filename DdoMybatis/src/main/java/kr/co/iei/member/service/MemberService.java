package kr.co.iei.member.service;

import org.apache.ibatis.session.SqlSession;

import kr.co.iei.common.SqlSessionTemplate;
import kr.co.iei.member.dao.MemberDAO;
import kr.co.iei.member.domain.vo.MemberVO;

// SqlSessionTemplate을 이용하여 연결을 생성하고 DAO 넘겨줌
public class MemberService {

	private SqlSession session;
	private MemberDAO mDao;
	
	public MemberService() {
		session = SqlSessionTemplate.getConnection();
		mDao = new MemberDAO();
	}
	
	public int insertMember(MemberVO member) {
		int result = mDao.insertMember(session, member);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}
}
