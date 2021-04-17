package com.ebtd.www.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ebtd.www.service.AdminStopMM;
import com.fasterxml.jackson.core.JsonProcessingException;




@Controller
@RequestMapping(value = "/admin/stop")
public class AdminStopController {
	@Autowired
	private AdminStopMM am; //게시판 서비스 클래스
	
	ModelAndView mav;
	
	//정류장 전체 리스트 출력
	@GetMapping(value = "/getStopList")
	public ModelAndView getStopList() throws JsonProcessingException {
		mav=am.getStopList();
		return mav; //.jsp
	}
	
	//정류장 상세정보 출력
	@GetMapping(value = "/getStopDetail")
	public ModelAndView getStopDetail(@RequestParam("s_Name")String s_Name) throws JsonProcessingException {
		mav=am.getStopDetail(s_Name);
		return mav; //.jsp
	}
	
	//코멘트 등록(아직 작업중)
	@PostMapping(value = "/addStopComment")
	public ModelAndView addStopComment(){
		mav=am.addStopComment();
		return mav;
	}
	//정류장 신청 리스트 출력
	@GetMapping(value = "/getStopConfirmList")
	public ModelAndView getStopConfirmList() throws JsonProcessingException {
		mav=am.getStopConfirmList();
		return mav; //.jsp
	}
	
}
