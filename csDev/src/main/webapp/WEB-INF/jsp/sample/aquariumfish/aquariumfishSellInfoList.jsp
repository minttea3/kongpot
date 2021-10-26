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

<h3>물고기 수족관 판매 정보 리스트</h3>

<br />

<form:form action="/aquariumfishSellInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="asiiIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="asiiIdx" placeholder="고유번호" name="asiiIdx" value="${aquariumfishSellInfo43VO.asiiIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="asiiStoreName">상호명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">상호명</div>
                </div>
                <input type="text" class="form-control" id="asiiStoreName" placeholder="상호명" name="asiiStoreName" value="${aquariumfishSellInfo43VO.asiiStoreName}">
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
            <th scope="col">판매</th>
            <th scope="col">가격</th>
            <th scope="col">작성일</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${aquariumfishSellInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.asiiIdx}</td>
                    <td><a href="<c:url value='/syncAquariumfishSellInfoForm?asiiIdx=${map.asiiIdx}' />">${map.asiiStoreName}</a></td>
                    <td>${map.asiiProduct}</td>
                    <td>${map.asiiPrice}</td>
                    <td>${map.asiiDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
