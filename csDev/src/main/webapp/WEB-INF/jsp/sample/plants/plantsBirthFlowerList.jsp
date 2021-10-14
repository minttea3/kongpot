<%--
  Created by eclipseIDE
  User: kong
  Date: 2021. 9. 23.
  Time: 오후 8:50
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

<h3>식물 탄생화 리스트</h3>
<br />

<form:form action="/plantsBirthFlowerList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="pbfIdx"></label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">고유번호</div>
                </div>
                <input type="text" class="form-control" id="pbfIdx" placeholder="회원번호" name="pbfIdx" value="${plantsBirthFlower29VO.pbfIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="pbfMonth">월</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">월</div>
                </div>
                <input type="text" class="form-control" id="pbfMonth" placeholder="월" name="pbfMonth" value="${plantsBirthFlower29VO.pbfMonth}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="pbfTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="pbfTitle" placeholder="제목을 입력하세요." name="pbfTitle" value="${plantsBirthFlower29VO.pbfTitle}">
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
            <th scope="col">No.</th>
            <th scope="col">고유번호</th>
            <th scope="col">월</th>
            <th scope="col">종류</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${plantsBirthFlowerList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.pbfIdx}</td>
                    <td>${map.pbfMonth}</td>
                    <td>${map.pbfType}</td>
                    <td><a href="<c:url value='/syncPlantsBirthFlowerForm?pbfIdx=${map.pbfIdx}' />">${map.pbfTitle}</a></td>
                    <td>${map.pbfContent}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
