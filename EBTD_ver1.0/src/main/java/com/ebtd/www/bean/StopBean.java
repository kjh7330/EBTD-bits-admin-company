package com.ebtd.www.bean;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.experimental.Accessors;

@Alias("stop")
@Data
@Accessors(chain = true)
public class StopBean {
	private String s_No;		//노선 번호
	private String t_Name;  	//동 이름
	private String s_Name;  	//정류장 이름
	private int s_X;			//x축
	private int s_Y;			//y축
	private String s_Detail; 	//정류장 상세 정보
}