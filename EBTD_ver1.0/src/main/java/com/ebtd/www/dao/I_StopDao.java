package com.ebtd.www.dao;

import java.util.List;

import com.ebtd.www.bean.StopBean;



public interface I_StopDao {

	List<StopBean> getStopList();

	List<StopBean> getStopDetail(String s_Name);

	List<StopBean> addStopComment();



}
