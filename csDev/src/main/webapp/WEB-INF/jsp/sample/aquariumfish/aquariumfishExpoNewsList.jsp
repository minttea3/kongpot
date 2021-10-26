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

<h3>물고기 뉴스 리스트</h3>

<br />

<form:form action="/aquariumfishExpoNewsList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="anIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="anIdx" placeholder="고유번호" name="anIdx" value="${aquariumfishNews41VO.anIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="anPress">언론사</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">언론사</div>
                </div>
                <input type="text" class="form-control" id="anPress" placeholder=언론사 name="anPress" value="${aquariumfishNews41VO.anPress}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="anTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="anTitle" placeholder="제목" name="anTitle" value="${aquariumfishNews41VO.anTitle}">
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
            <c:forEach var="map" items="${aquariumfishNewsList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.anIdx}</td>
                    <td>${map.anName}</td>
                    <td>${map.anPress}</td>
                    <td><a href="<c:url value='/syncAquariumfishExpoNewsForm?anIdx=${map.anIdx}' />">${map.anTitle}</a></td>
                    <td>${map.anContent}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
