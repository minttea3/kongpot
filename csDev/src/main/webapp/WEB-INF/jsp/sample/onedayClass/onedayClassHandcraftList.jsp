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

<h3>원데이클리스 - 수공예 정보 리스트</h3>

<br />

<form:form action="/onedayClassHandcraftList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ochStoreName">상호명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">상호명</div>
                </div>
                <input type="text" class="form-control" id="ochStoreName" placeholder="상호명" name="ochStoreName" value="${onedayClassHandcraft59VO.ochStoreName}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ochLoc">위치</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">위치</div>
                </div>
                <input type="text" class="form-control" id="ochLoc" placeholder="위치" name="ochLoc" value="${onedayClassHandcraft59VO.ochLoc}">
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
            <c:forEach var="map" items="${onedayClassHandcraftList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.ochIdx}</td>
                    <td>${map.ochStoreName}</td>
                    <td>${map.ochLoc}</td>
                    <td><a href="<c:url value='/syncOnedayClassHandcraftForm?ochIdx=${map.ochIdx}' />">${map.ochClassInfo}</a></td>
                    <td>${map.ochDetail}</td>
                    <td>${map.ochPrice}</td>
                    <td>${map.ochClassStatus}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
