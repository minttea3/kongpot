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

<h3>쇼핑몰 정보 리스트</h3>

<br />

<form:form action="/clothesShoppingmallinfoList" method="get">
    <div class="form-row align-items-center">
        
        <div class="col-auto">
            <label class="sr-only" for="csiStoreName">쇼핑몰 이름</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">쇼핑몰 이름</div>
                </div>
                <input type="text" class="form-control" id="csiStoreName" placeholder="쇼핑몰 이름" name="csiStoreName" value="${clothesShoppingmallinfo60VO.csiStoreName}">
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
            <th scope="col">스타일</th>
            <th scope="col">매장 여부</th>
            <th scope="col">평점</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${clothesShoppingmallinfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.csiIdx}</td>
                    <td><a href="<c:url value='/syncClothesShoppingmallinfoForm?csiIdx=${map.csiIdx}' />">${map.csiStoreName}</a></td>
                    <td>${map.csiStyle}</td>
                    <td>${map.csiStoreStatus}</td>
                    <td>${map.csiCount}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
