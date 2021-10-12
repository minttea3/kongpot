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

<h3>건강 지식 소개 리스트</h3>

<br />

<form:form action="/healthKnowledgeList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="hkIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="hkIdx" placeholder="번호" name="hkIdx" value="${healthKnowledge23VO.hkIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="hkName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="hkName" placeholder="작성자" name="hkName" value="${healthKnowledge23VO.hkName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="hkTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="hkTitle" placeholder="제목" name="hkTitle" value="${healthKnowledge23VO.hkTitle}">
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
            <th scope="col">날짜</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${healthKnowledgeList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.hkIdx}</td>
                    <td>${map.hkName}</td>
                    <td><a href="<c:url value='/syncHealthKnowledgeForm?hkIdx=${map.hkIdx}' />">${map.hkTitle}</a></td>
                    <td>${map.hkContent}</td>
                    <td>${map.hkDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
