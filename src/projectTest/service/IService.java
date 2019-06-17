package projectTest.service;

import java.util.List;
import java.util.Map;

import projectTest.vo.MemberVO;

/**
 * 디비에서 써야할 메서드들 목록
 * @author PC25
 *
 */
public interface IService {
	/**
	 * 아이디와 비번이 일치하는 회원의 정보를 가져오는 메서드
	 * @param mem_id : 사람아이디
	 * @param mem_pw : 사람비밀번호
	 * @return MemberVO 아이디와 비번이 일치하는 한명의 정보
	 * @이중석
	 */
	MemberVO getMemberInfo(String mem_id, String mem_pw);

	/**
	 * 아이디와 비번이 일치하는 회원의 정보를 가져오는 메서드
	 * @params param : mem_id와 mem_pw를 매개변수로 받는 
	 * @return MemberVO 아이디와 비번이 일치하는 한명의 정보
	 */
	MemberVO getMemberInfo(Map<String, String> params);

}
