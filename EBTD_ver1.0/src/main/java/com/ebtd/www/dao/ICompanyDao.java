package com.ebtd.www.dao;


import com.ebtd.www.bean.CompanyBean;

public interface ICompanyDao {
	//회원 가입시 필수 정보등록
	public boolean companyJoin(CompanyBean cb);
	//암호화 된 비밀번호Get
	public String getSecurityPwd(String c_username);
	//일치하는 회사 ID 가 있는지 확인
	public boolean existUsername(CompanyBean cb);
	//user name
	public String accessUser(CompanyBean cb);
	public int accessUserState(String username);
	public String getPwd(CompanyBean cb);	
}
