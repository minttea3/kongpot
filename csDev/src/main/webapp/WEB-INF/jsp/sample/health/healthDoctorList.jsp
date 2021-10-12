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

<h3>건강 닥터 리스트</h3>

<br />

<form:form action="/healthDoctorList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="hdIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="hdIdx" placeholder="번호" name="hdIdx" value="${healthDoctor26VO.hdIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="hdName">닥터이름</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">닥터이름</div>
                </div>
                <input type="text" class="form-control" id="hdName" placeholder="닥터이름" name="hdName" value="${healthDoctor26VO.hdName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="hdMedicalField">진료분야</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">진료분야</div>
                </div>
                <input type="text" class="form-control" id="hdMedicalField" placeholder="진료분야" name="hdMedicalField" value="${healthDoctor26VO.hdMedicalField}">
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
            <th scope="col">닥터이름</th>
            <th scope="col">진료분야</th>
            <th scope="col">연락처</th>
            <th scope="col">날짜</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${healthDoctorList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.hdIdx}</td>
                    <td>${map.hdName}</td>
                    <td><a href="<c:url value='/syncHealthDoctorForm?hdIdx=${map.hdIdx}' />">${map.hdMedicalField}</a></td>
                    <td>${map.hdTel}</td>
                    <td>${map.hdDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
