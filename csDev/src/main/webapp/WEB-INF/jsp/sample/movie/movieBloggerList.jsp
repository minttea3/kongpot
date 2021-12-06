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

<h3>영화관 블로거 리스트</h3>

<br />

<form:form action="/movieBloggerList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mbIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="mbIdx" placeholder="고유번호" name="mbIdx" value="${movieBlogger48VO.mbIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mbBlogger">블로거</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">블로거</div>
                </div>
                <input type="text" class="form-control" id="mbBlogger" placeholder="블로거" name="mbBlogger" value="${movieBlogger48VO.mbBlogger}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="mbMovieTitle">영화 제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">영화 제목</div>
                </div>
                <input type="text" class="form-control" id="mbMovieTitle" placeholder="영화 제목" name="mbMovieTitle" value="${movieBlogger48VO.mbMovieTitle}">
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
            <th scope="col">블로거</th>
            <th scope="col">영화 제목</th>
            <th scope="col">별점</th>
            <th scope="col">활동 여부</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${movieBloggerList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.mbIdx}</td>
                    <td><a href="<c:url value='/syncMovieBloggerForm?mbIdx=${map.mbIdx}' />">${map.mbBlogger}</a></td>
                    <td>${map.mbMovieTitle}</td>
                    <td>${map.mbCount}</td>
                    <td>${map.mbStatus}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
