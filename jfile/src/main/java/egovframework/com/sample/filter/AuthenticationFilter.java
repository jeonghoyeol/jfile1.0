package egovframework.com.sample.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.PatternMatchUtils;

public class AuthenticationFilter implements Filter {

	private int customSessionExpiredErrorCode = 901;
	
	private static String[] NONE_FILTER_URI_PATTERNS = {
		"*login*",
		"*/resources/*",
		"*/jfileuploadForm.do",
		"*/jfile/processUpload.do",
		"*/site/cutdownSessionLimitTime.do"
	};
	
	public void init(FilterConfig filterConfig) throws ServletException {}

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response,	FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		HttpSession session = req.getSession(false);
		if(session != null && session.getAttribute("userId") != null) {
			chain.doFilter(request, response);
		}else{
			// 세션인증 예외 패턴 등록
			if(PatternMatchUtils.simpleMatch(NONE_FILTER_URI_PATTERNS, req.getRequestURI())) {
				chain.doFilter(request, response);	
			}else{				
				if("XMLHttpRequest".equals(req.getHeader("X-Requested-With"))) {
					res.sendError(customSessionExpiredErrorCode);
				}else{
					res.sendRedirect(req.getContextPath()+"/loginForm.jsp");//세션이 타임아웃 됬을 때 리다이렉트 될 페이지 URL
				}
			}
		}
	}
}
