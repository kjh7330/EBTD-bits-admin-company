package com.ebtd.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.ebtd.www.bean.StopBean;
import com.ebtd.www.dao.I_StopDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class AdminStopMM {
	@Autowired
	private I_StopDao sDao;
	
	ModelAndView mav;
	
	//정류장 리스트 보기
	public ModelAndView getStopList() throws JsonProcessingException {
		mav = new ModelAndView();
		List<StopBean> sList = null;
		ObjectMapper om = new ObjectMapper();
		String view = null;
		
		sList=sDao.getStopList();
		if(sList!=null && sList.size() != 0) {
			mav.addObject("sList", om.writeValueAsString(sList));
			//mav.addObject("sList", new jackson());
			view = "admin/stop/stopListForm";//.jsp
		}else {
			view = "admin/adminMain";
		}
		mav.setViewName(view);
		return mav;
	}
	
	//정류장 상세정보 보기
	public ModelAndView getStopDetail(String s_Name) throws JsonProcessingException {
		mav = new ModelAndView();
		List<StopBean> sList = null;
		String view = null;
		ObjectMapper om = new ObjectMapper();
		sList=sDao.getStopDetail(s_Name);
		System.out.println(sList);
		if(sList!=null && sList.size() != 0) {
			mav.addObject("sList", om.writeValueAsString(sList));
			view = "admin/stop/stopDetailForm";//.jsp
		}else {
			view = "admin";
		}
		mav.setViewName(view);
		return mav;
	}
	
	//정류장 코멘트 등록(아직 미완성)
	public ModelAndView addStopComment() {
		mav = new ModelAndView();
		List<StopBean> sList = null;
		String view = null;
		sList=sDao.addStopComment();
		return null;
	}

	public ModelAndView getStopConfirmList() {
		mav = new ModelAndView();
		List<StopBean> sList = null;
		String view = null;
		return null;
	}

}
