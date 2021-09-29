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
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>book 중고장터 리스트</h3>

<br />

<form:form action="/bookUsedMarketplaceList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="bumIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="bumIdx" placeholder="번호" name="bumIdx" value="${bookUsedMarketplace10VO.bumIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bumTitle">글 제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">글 제목</div>
                </div>
                <input type="text" class="form-control" id="bumTitle" placeholder="글 제목" name="bumTitle" value="${bookUsedMarketplace10VO.bumTitle}">
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
            <th scope="col">작성번호</th>
            <th scope="col">장르</th>
            <th scope="col">책제목</th>
            <th scope="col">작가</th>
            <th scope="col">작성자</th>
            <th scope="col">글제목</th>
            <th scope="col">내용</th>
            <th scope="col">판매가</th>
            <th scope="col">날짜</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${bookUsedMarketplaceList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.bumIdx}</td>
                    <td>${map.bumGenre}</td>
                    <td><a href="<c:url value='/syncBookUsedMarketplaceForm?bumIdx=${map.bumIdx}' />">${map.bumBookTitle}</a></td>
                    <td>${map.bumWriter}</td>
                    <td>${map.bumName}</td>
                    <td>${map.bumTitle}</td>
                    <td>${map.bumContent}</td>
                    <td>${map.bumPrice}</td>
                    <td>${map.bumDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
