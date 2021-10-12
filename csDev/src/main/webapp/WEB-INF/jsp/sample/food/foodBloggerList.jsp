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

<h3>요리 레시피 소개 리스트</h3>

<br />

<form:form action="/foodBloggerList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="frIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="fbIdx" placeholder="번호" name="fbIdx" value="${foodBlogger21VO.fbIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="fbName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="fbName" placeholder="작성자" name="fbName" value="${foodBlogger21VO.fbName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="fbTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="fbTitle" placeholder="제목" name="fbTitle" value="${foodBlogger21VO.fbTitle}">
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
            <th scope="col">분류</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${foodBloggerList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.fbIdx}</td>
                    <td>${map.fbName}</td>
                    <td>${map.fbType}</td>
                    <td><a href="<c:url value='/syncFoodBloggerForm?fbIdx=${map.fbIdx}' />">${map.fbTitle}</a></td>
                    <td>${map.fbContent}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
