package egovframework.com.sample.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.jfile.view.JSonView;
import egovframework.com.sample.service.SampleService;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	@RequestMapping
	public void fileupload() {
		service.testConnection();
	}
	
	@RequestMapping
	public void guide() {
	}

	/**
	 * 샘플 업로드 페이지
	 */
	@RequestMapping(value="/site/upload1.do")
	public void upload1() {
	}
	
	/**
	 * 샘플 다운로드 페이지
	 */
	@RequestMapping(value="/site/download1.do")
	public void download1() {
	}
	
	@RequestMapping(value="/site/cutdownSessionLimitTime.do")
	public ModelAndView cutdownSessionLimitTime(HttpServletRequest request) {
		System.out.println("SampleController.cutdownSessionLimitTime()");
		ModelAndView modelAndView = new ModelAndView(JSonView.NAME);
		request.getSession().setMaxInactiveInterval(10);
		return modelAndView;
	}
}
