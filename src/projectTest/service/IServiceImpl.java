package projectTest.service;

import java.util.Map;

import projectTest.db.DBClass;
import projectTest.vo.MemberVO;

/**
 * 디비로 가기위한 메서드들을 관리하는 클래스
 * @author 이중석
 * @since 2019.02.21
 *
 */
public class IServiceImpl implements IService{
	
	private DBClass db = new DBClass();

	@Override
	public MemberVO getMemberInfo(String mem_id, String mem_pw) {
		MemberVO result = db.getMemberInfo(mem_id,mem_pw);
		return result;
	}

	@Override
	public MemberVO getMemberInfo(Map<String, String> params) {
		MemberVO result = db.getMemberInfo(params);
		return result;
	}

}
