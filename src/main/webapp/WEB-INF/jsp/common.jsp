<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="request"    scope="page" value="${pageContext.request}" /> 
<c:set var="scheme"  scope="page" value="${request.scheme}"      /> 
<c:set var="server"  scope="page" value="${request.serverName}"  /> 
<c:set var="port"  scope="page" value="${request.serverPort}"  /> 
<c:set var="ctx" scope="page" value="${request.contextPath}" /> 
<c:set var="basePath"   scope="page" value="${scheme}://${server}:${port}${ctx}" />