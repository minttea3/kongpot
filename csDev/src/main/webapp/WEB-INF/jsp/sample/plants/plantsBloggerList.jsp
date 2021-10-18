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

<h3>식물 블로거 리스트</h3>

<br />

<form:form action="/plantsBloggerList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="pbIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="pbIdx" placeholder="고유번호" name="pbIdx" value="${plantsBlogger32VO.pbIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="pbName">이름</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">이름</div>
                </div>
                <input type="text" class="form-control" id="pbName" placeholder="이름" name="pbName" value="${plantsBlogger32VO.pbName}">
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
            <th scope="col">번호</th>
            <th scope="col">이름</th>
            <th scope="col">블로그명</th>
            <th scope="col">현재 활동 여부</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${plantsBloggerList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.pbIdx}</td>
                    <td><a href="<c:url value='/syncPlantsBloggerForm?pbIdx=${map.pbIdx}' />">${map.pbName}</a></td>
                    <td>${map.pbTitle}</td>
                    <td>${map.pbActivityStatus}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
