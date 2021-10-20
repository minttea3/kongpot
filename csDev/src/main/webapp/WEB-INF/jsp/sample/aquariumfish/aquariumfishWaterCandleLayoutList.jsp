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

<h3>물고기 수초 레이아웃 리스트</h3>

<br />

<form:form action="/aquariumfishWaterCandleLayoutList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="awclIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="awclIdx" placeholder="고유번호" name="awclIdx" value="${aquariumfishWaterCandleLayout38VO.awclIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="awclTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="awclTitle" placeholder="제목" name="awclTitle" value="${aquariumfishWaterCandleLayout38VO.awclTitle}">
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
            <th scope="col">종류</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${aquariumfishInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.awclIdx}</td>
                    <td>${map.awclActivities}</td>
                    <td><a href="<c:url value='/syncAquariumfishWaterCandleLayoutForm?awclIdx=${map.awclIdx}' />">${map.awclTitle}</a></td>
                    <td>${map.awclContent}</td>
                    <td>${map.awclDay}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
