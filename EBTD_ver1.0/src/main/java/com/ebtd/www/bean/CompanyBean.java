package com.ebtd.www.bean;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.experimental.Accessors;

@Alias("company")
@Data
@Accessors(chain = true)
public class CompanyBean {
	
	 private String c_username;
	 private String c_name;
	 private String c_password;
	 private String c_no;
	 private String c_imgextention;
	 
	 private int c_status;

}
