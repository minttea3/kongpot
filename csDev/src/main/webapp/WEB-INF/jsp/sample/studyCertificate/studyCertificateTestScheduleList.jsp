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

<h3>공부/자격증 - 시험 일정 리스트</h3>

<br />

<form:form action="/studyCertificateTestScheduleList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="sctsIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="sctsIdx" placeholder="번호" name="sctsIdx" value="${studyCertificateTestSchedule13VO.sctsIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="sctsTestName">시험명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">시험명</div>
                </div>
                <input type="text" class="form-control" id="sctsTestName" placeholder="시험명" name="sctsTestName" value="${studyCertificateTestSchedule13VO.sctsTestName}">
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
            <th scope="col">구분</th>
            <th scope="col">등급</th>
            <th scope="col">시험명</th>
            <th scope="col">접수기간</th>
            <th scope="col">시험일</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${studyCertificateTestScheduleList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.sctsIdx}</td>
                    <td>${map.sctsType}</td>
                    <td>${map.sctsClass}</td>
                    <td><a href="<c:url value='/syncStudyCertificateTestScheduleForm?sctsIdx=${map.sctsIdx}' />">${map.sctsTestName}</a></td>
                    <td>${map.sctsTestPeriod}</td>
                    <td>${map.sctsTestingDay}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
