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

<h3>물고기 박람회 방명록  리스트</h3>

<br />

<form:form action="/aquariumfishExpoGuestbookList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="aebIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="aebIdx" placeholder="고유번호" name="aebIdx" value="${aquariumfishExpoGuestbook40VO.aebIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="aebWriter">작성자 이름</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자 이름</div>
                </div>
                <input type="text" class="form-control" id="aebWriter" placeholder="작성자 이름" name="aebWriter" value="${aquariumfishExpoGuestbook40VO.aebWriter}">
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
            <th scope="col">박람회 이름</th>
            <th scope="col">작성자</th>
            <th scope="col">후기</th>
            <th scope="col">별점</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${aquariumfishExpoGuestbookList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.aebIdx}</td>
                    <td>${map.aebExpoName}</td>
                    <td><a href="<c:url value='/syncAquariumfishExpoGuestbookForm?aebIdx=${map.aebIdx}' />">${map.aebWriter}</a></td>
                    <td>${map.aebFeeling}</td>
                    <td>
                    	<c:if test="${map.aebCount eq 5 }">⭐⭐⭐⭐⭐</c:if>
                    	<c:if test="${map.aebCount eq 4 }">⭐⭐⭐⭐</c:if>
                    	<c:if test="${map.aebCount eq 3 }">⭐⭐⭐</c:if>
                    	<c:if test="${map.aebCount eq 2 }">⭐⭐</c:if>
                    	<c:if test="${map.aebCount eq 1 }">⭐</c:if>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
