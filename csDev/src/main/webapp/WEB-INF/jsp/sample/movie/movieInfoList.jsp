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

<h3>영화관 개봉일 정보 리스트</h3>

<br />

<form:form action="/movieInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="miIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="miIdx" placeholder="고유번호" name="miIdx" value="${movieInfo44VO.miIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="miMovieTitle">박람회 이름</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">영화 제목</div>
                </div>
                <input type="text" class="form-control" id="miMovieTitle" placeholder="영화 제목" name="miMovieTitle" value="${movieInfo44VO.miMovieTitle}">
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
            <th scope="col">장르</th>
            <th scope="col">가격</th>
            <th scope="col">개봉일</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${movieInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.miIdx}</td>
                    <td><a href="<c:url value='/syncMovieInfoForm?miIdx=${map.miIdx}' />">${map.miMovieTitle}</a></td>
                    <td>${map.miGenre}</td>
                    <td>${map.miPrice}</td>
                    <td>${map.miReleaseDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
