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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>영화관 개봉예정작 리스트</h3>

<br />

<form:form action="/movieComingSoonList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mcsIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="mcsIdx" placeholder="고유번호" name="mcsIdx" value="${movieComingSoon47VO.mcsIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mcsMovieTitle">영화 제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">영화 제목</div>
                </div>
                <input type="text" class="form-control" id="mcsMovieTitle" placeholder="영화 제목" name="mcsMovieTitle" value="${movieComingSoon47VO.mcsMovieTitle}">
            </div>
        </div>
        <div class="col-auto">
            <button name="action" class="btn btn-info" type="submit">조회</button>
        </div>
    </div>
</form:form>
<br /><br />
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">고유번호</th>
            <th scope="col">영화 제목</th>
            <th scope="col">예매율</th>
            <th scope="col">개봉일</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${movieComingSoonList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.mcsIdx}</td>
                    <td><a href="<c:url value='/syncmovieComingSoonForm?mcsIdx=${map.mcsIdx}' />">${map.mcsMovieTitle}</a></td>
                    <td>${map.mcsReservationRate}</td>
                    <td>${map.mcsReleaseDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
