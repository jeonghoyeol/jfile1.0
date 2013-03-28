<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<script>
window.onload=function() {
	document.loginForm.bt.focus();
}
</script>
<form name="loginForm" action="<%=request.getContextPath() %>/login.jsp" method="post">
	ID : <input type="text" name="userId" value="hongildong"> <br/> 
	PW : <input type="password" name="password" value="hongildong"><br/>
	<input type="submit" name="bt" value="로그인">
</form>