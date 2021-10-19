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

<h3>식물 블로그 리스트</h3>

<br />

<form:form action="/plantsBlogList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="pbsIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="pbsIdx" placeholder="고유번호" name="pbsIdx" value="${plantsBlog33VO.pbsIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="pbsName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="pbsName" placeholder="작성자" name="pbsName" value="${plantsBlog33VO.pbsName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="pbsTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="pbsTitle" placeholder="제목" name="pbsTitle" value="${plantsBlog33VO.pbsTitle}">
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
            <th scope="col">작성자</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
            <th scope="col">날짜</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${plantsBloggerList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.pbsIdx}</td>
                    <td>${map.pbsName}</td>
                    <td><a href="<c:url value='/syncPlantsBlogForm?pbsIdx=${map.pbsIdx}' />">${map.pbsTitle}</a></td>
                    <td>${map.pbsContent}</td>
                    <td>${map.pbsDay}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
