<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<% request.getSession().setAttribute("userId", request.getParameter("userId")); %>

<script type="text/javascript">
window.onload=function() {
	self.location.href='<%=request.getContextPath()%>/sample/guide.do';
};
</script>