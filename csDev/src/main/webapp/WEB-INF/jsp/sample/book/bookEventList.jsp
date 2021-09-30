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

<h3>book EVENT 리스트</h3>

<br />

<form:form action="/bookEventList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="beIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="beIdx" placeholder="번호" name="beIdx" value="${bookEvent11VO.beIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="beTitle">책제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">책제목</div>
                </div>
                <input type="text" class="form-control" id="beTitle" placeholder="책제목" name="beTitle" value="${bookEvent11VO.beTitle}">
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
            <th scope="col">제목</th>
            <th scope="col">내용</th>
            <th scope="col">사은품</th>
            <th scope="col">등록일</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${bookEventList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.beIdx}</td>
                    <td>${map.beName}</td>
                    <td><a href="<c:url value='/syncBookEventForm?beIdx=${map.beIdx}' />">${map.beTitle}</a></td>
                    <td>${map.beContent}</td>
                    <td>${map.beFreeGift}</td>
                    <td>${map.beDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
