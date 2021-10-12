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

<h3>맛집 리스트</h3>

<br />

<form:form action="/foodBestRestaurantList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="fbrIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="fbrIdx" placeholder="번호" name="fbrIdx" value="${foodBestRestaurant22VO.fbrIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="fbrName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="fbrName" placeholder="작성자" name="fbrName" value="${foodBestRestaurant22VO.fbrName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="fbrTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="fbrTitle" placeholder="제목" name="fbrTitle" value="${foodBestRestaurant22VO.fbrTitle}">
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
            <th scope="col">작성자</th>
            <th scope="col">분류</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${foodBestRestaurantList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.fbrIdx}</td>
                    <td>${map.fbrName}</td>
                    <td>${map.fbrType}</td>
                    <td><a href="<c:url value='/syncFoodBestRestaurantForm?fbrIdx=${map.fbrIdx}' />">${map.fbrTitle}</a></td>
                    <td>${map.fbrContent}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
