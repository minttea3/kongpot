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


<h3>영화관 개봉일 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncMovieChartFormSave" method="post">
        <div class="form-group">
            <label for="mcIdx">작성번호</label>
            <input type="text" class="form-control" id="mcIdx" placeholder="작성번호" name="mcIdx" value="${movieChart46VO.mcIdx}" <c:if test="${movieChart46VO.mcIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="mcMovieTitle">영화 제목</label><br>
            <input type="text" class="form-control" id="mcIdx" placeholder="영화 제목" name="mcMovieTitle" value="${movieChart46VO.mcMovieTitle}"/>
        </div>
        <div class="form-group">
            <label for="mcReservationRate">예매율</label>
            <input type="text" class="form-control" id="mcReservationRate" placeholder="예매율" name="mcReservationRate" value="${movieChart46VO.mcReservationRate}">
        </div>
        <div class="form-group">
            <label for="mcCount">평점</label><br>&nbsp;&nbsp;&nbsp;
        	<input type="radio" id="mcCount1" name="mcCount" value="1" <c:if test="${movieChart46VO.mcCount eq 1}">checked="checked"</c:if>>
        	<label for="mcCount1">⭐</label>
        	<input type="radio" id="mcCount2" name="mcCount" value="2" <c:if test="${movieChart46VO.mcCount eq 2}">checked="checked"</c:if>>
        	<label for="mcCount2">⭐⭐</label>
        	<input type="radio" id="mcCount3" name="mcCount" value="3" <c:if test="${movieChart46VO.mcCount eq 3}">checked="checked"</c:if>>
        	<label for="mcCount3">⭐⭐⭐</label>
        	<input type="radio" id="mcCount4" name="mcCount" value="4" <c:if test="${movieChart46VO.mcCount eq 4}">checked="checked"</c:if>>
        	<label for="mcCount4">⭐⭐⭐⭐</label>
        	<input type="radio" id="mcCount5" name="mcCount" value="5" <c:if test="${movieChart46VO.mcCount eq 5}">checked="checked"</c:if>>
        	<label for="mcCount5">⭐⭐⭐⭐⭐</label>
        </div>
        <div class="form-group">
            <label for="mcReleaseDate">개봉일</label>
            <input type="date" class="form-control" id="mcReleaseDate" placeholder="개봉일" name="mcReleaseDate" value="${movieChart46VO.mcReleaseDate}">
        </div>
        <c:if test="${movieChart46VO.mcIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${movieChart46VO.mcIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
