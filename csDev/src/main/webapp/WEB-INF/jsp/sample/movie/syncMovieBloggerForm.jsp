<%--
  Created by IntelliJ IDEA.
  User: kimchangsu
  Date: 2021. 8. 23.
  Time: 오후 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />


<h3>영화관 블로거 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncMovieBloggerFormSave" method="post">
        <div class="form-group">
            <label for="mbIdx">작성번호</label>
            <input type="text" class="form-control" id="mbIdx" placeholder="작성번호" name="mbIdx" value="${movieBlogger48VO.mbIdx}" <c:if test="${movieBlogger48VO.mbIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="mbBlogger">블로거</label><br>
            <input type="text" class="form-control" id="mbBlogger" placeholder="블로거" name="mbBlogger" value="${movieBlogger48VO.mbBlogger}"/>
        </div>
        <div class="form-group">
            <label for="mbMovieTitle">영화 제목</label>
            <input type="text" class="form-control" id="mbMovieTitle" placeholder="영화 제목" name="mbMovieTitle" value="${movieBlogger48VO.mbMovieTitle}">
        </div>
        <div class="form-group">
            <label for="mbCount">별점</label>
           <%--  <input type="text" class="form-control" id="mbCount" placeholder="별점" name="mbCount" value="${movieBlogger48VO.mbCount}"> --%>
			<input type="radio" name="mbCount" id="mbCount1" value="1" <c:if test="${movieBlogger48VO.mbCount eq 1}">checked="checked"</c:if>>
			<label for="mbCount1">⭐</label>            
			<input type="radio" name="mbCount" id="mbCount2" value="2" <c:if test="${movieBlogger48VO.mbCount eq 2}">checked="checked"</c:if>>
			<label for="mbCount2">⭐⭐</label>            
			<input type="radio" name="mbCount" id="mbCount3" value="3" <c:if test="${movieBlogger48VO.mbCount eq 3}">checked="checked"</c:if>>
			<label for="mbCount3">⭐⭐⭐</label>            
			<input type="radio" name="mbCount" id="mbCount4" value="4" <c:if test="${movieBlogger48VO.mbCount eq 4}">checked="checked"</c:if>>
			<label for="mbCount4">⭐⭐⭐⭐</label>            
			<input type="radio" name="mbCount" id="mbCount5" value="5" <c:if test="${movieBlogger48VO.mbCount eq 5}">checked="checked"</c:if>>
			<label for="mbCount5">⭐⭐⭐⭐⭐</label>            
        </div>
        <div class="form-group">
            <label for="mbStatus">활동 여부</label> <br>&nbsp;&nbsp;&nbsp;
            <%-- <input type="text" class="form-control" id="mbStatus" placeholder="활동 여부" name="mbStatus" value="${movieBlogger48VO.mbStatus}"> --%>
        	<input type="checkbox" name="mbStatus" value="Y" <c:if test="${movieBlogger48VO.mbStatus eq 'Y'}">checked="checked"</c:if>>
        </div>
        <c:if test="${movieBlogger48VO.mbIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${movieBlogger48VO.mbIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
