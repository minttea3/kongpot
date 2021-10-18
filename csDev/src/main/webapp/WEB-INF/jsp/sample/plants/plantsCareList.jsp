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

<h3>식물 관리법 리스트</h3>

<br />

<form:form action="/plantsCareList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="pbfIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="pbfIdx" placeholder="고유번호" name="pbfIdx" value="${plantsCare31VO.pbfIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="pbfTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="pbfTitle" placeholder="제목" name="pbfTitle" value="${plantsCare31VO.pbfTitle}">
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
            <th scope="col">타입</th>
            <th scope="col">식물이름</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${plantsCareList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.pbfIdx}</td>
                    <td>${map.pbfType}</td>
                    <td><a href="<c:url value='/syncPlantsCareForm?pbfIdx=${map.pbfIdx}' />">${map.pbfTitle}</a></td>
                    <td>${map.pbfContent}</td>
                    <td>${map.pbfDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
