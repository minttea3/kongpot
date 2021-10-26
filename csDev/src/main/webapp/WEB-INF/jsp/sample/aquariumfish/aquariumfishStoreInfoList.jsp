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

<h3>물고기 수족관 정보 리스트</h3>

<br />

<form:form action="/aquariumfishStoreInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="asiIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="asiIdx" placeholder="고유번호" name="asiIdx" value="${aquariumfishStoreInfo42VO.asiIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="asiStoreName">상호명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">상호명</div>
                </div>
                <input type="text" class="form-control" id="asiStoreName" placeholder="상호명" name="asiStoreName" value="${aquariumfishStoreInfo42VO.asiStoreName}">
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
            <th scope="col">위치</th>
            <th scope="col">연락처</th>
            <th scope="col">운영 여부</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${aquariumfishStoreInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.asiIdx}</td>
                    <td><a href="<c:url value='/syncAquariumfishStoreInfoForm?asiIdx=${map.asiIdx}' />">${map.asiStoreName}</a></td>
                    <td>${map.asiLoc}</td>
                    <td>${map.asiTel}</td>
                    <td>${map.asiStatus}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
