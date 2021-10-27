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


<h3>영화관 개봉일 예정작 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncmovieComingSoonFormSave" method="post">
        <div class="form-group">
            <label for="mcsIdx">작성번호</label>
            <input type="text" class="form-control" id="mcsIdx" placeholder="작성번호" name="mcsIdx" value="${movieComingSoon47VO.mcsIdx}" <c:if test="${movieComingSoon47VO.mcsIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="mcsMovieTitle">영화 제목</label><br>
            <input type="text" class="form-control" id="mcsIdx" placeholder="영화 제목" name="mcsMovieTitle" value="${movieComingSoon47VO.mcsMovieTitle}"/>
        </div>
        <div class="form-group">
            <label for="mcsReservationRate">예매율</label>
            <input type="text" class="form-control" id="mcsReservationRate" placeholder="예매율" name="mcsReservationRate" value="${movieComingSoon47VO.mcsReservationRate}">
        </div>
        <div class="form-group">
            <label for="mcsReleaseDate">개봉일</label>
            <input type="text" class="form-control" id="mcsReleaseDate" placeholder="개봉일" name="mcsReleaseDate" value="${movieComingSoon47VO.mcsReleaseDate}">
        </div>
        <c:if test="${movieComingSoon47VO.mcsIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${movieComingSoon47VO.mcsIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
