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

<h3>계절 요리 레시피 소개 리스트</h3>

<br />

<form:form action="/FoodSeasonInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="fsiIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="fsiIdx" placeholder="번호" name="fsiIdx" value="${foodSeasonInfo19VO.fsiIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="fsiTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="fsiTitle" placeholder="제목" name="fsiTitle" value="${foodSeasonInfo19VO.fsiTitle}">
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
            <th scope="col">작성자</th>
            <th scope="col">재료</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${foodSeasonInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.fsiIdx}</td>
                    <td>${map.fsiName}</td>
                    <td>${map.fsiIngredients}</td>
                    <td><a href="<c:url value='/syncFoodSeasonInfoForm?fsiIdx=${map.fsiIdx}' />">${map.fsiTitle}</a></td>
                    <td>${map.fsiContent}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
