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

<h3>원데이클리스 - 베이커리 정보 리스트</h3>

<br />

<form:form action="/onedayClassBreadList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ocbStoreName">상호명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">상호명</div>
                </div>
                <input type="text" class="form-control" id="ocbStoreName" placeholder="상호명" name="ocbStoreName" value="${onedayClassBread51VO.ocbStoreName}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ocbLoc">위치</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">위치</div>
                </div>
                <input type="text" class="form-control" id="ocbLoc" placeholder="위치" name="ocbLoc" value="${onedayClassBread51VO.ocbLoc}">
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
            <th scope="col">상호명</th>
            <th scope="col">위치</th>
            <th scope="col">클래스 소개</th>
            <th scope="col">상세 정보</th>
            <th scope="col">금액</th>
            <th scope="col">수업 진행 여부</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${onedayClassBreadList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.ocbIdx}</td>
                    <td>${map.ocbStoreName}</td>
                    <td>${map.ocbLoc}</td>
                    <td><a href="<c:url value='/syncOnedayClassBreadForm?ocbIdx=${map.ocbIdx}' />">${map.ocbClassInfo}</a></td>
                    <td>${map.ocbDetail}</td>
                    <td>${map.ocbPrice}</td>
                    <td>${map.ocbClassStatus}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
