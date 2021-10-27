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

<h3>영화 블로거 후기 리스트</h3>

<br />

<form:form action="/movieReviewBloggerList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mrbIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="mrbIdx" placeholder="고유번호" name="mrbIdx" value="${movieReviewBlogger45VO.mrbIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mrbMovieTitle">영화 제목 </label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">영화 제목</div>
                </div>
                <input type="text" class="form-control" id="mrbMovieTitle" placeholder="영화 제목" name="mrbMovieTitle" value="${movieReviewBlogger45VO.mrbMovieTitle}">
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
            <th scope="col">내용</th>
            <th scope="col">별점</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${movieReviewBloggerList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.mrbIdx}</td>
                    <td><a href="<c:url value='/syncMovieReviewBloggerForm?mrbIdx=${map.mrbIdx}' />">${map.mrbMovieTitle}</a></td>
                    <td>${map.mrbGenre}</td>
                    <td>${map.mrbContent}</td>
                    <td>
                    	<c:if test="${map.mrbScore eq 1}">⭐</c:if>
                    	<c:if test="${map.mrbScore eq 2}">⭐⭐</c:if>
                    	<c:if test="${map.mrbScore eq 3}">⭐⭐⭐</c:if>
                    	<c:if test="${map.mrbScore eq 4}">⭐⭐⭐⭐</c:if>
                    	<c:if test="${map.mrbScore eq 5}">⭐⭐⭐⭐⭐</c:if>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
