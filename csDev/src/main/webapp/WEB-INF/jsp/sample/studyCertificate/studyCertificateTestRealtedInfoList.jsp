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

<h3>공부/자격증 관련 정보 리스트</h3>

<br />

<form:form action="/studyCertificateTestRealtedInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="scriIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="scriIdx" placeholder="번호" name="scriIdx" value="${studyCertificateRelatedInfo14VO.scriIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="scriName">글쓴이</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">글쓴이</div>
                </div>
                <input type="text" class="form-control" id="scriName" placeholder="글쓴이" name="scriName" value="${studyCertificateRelatedInfo14VO.scriName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="scriTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="scriTitle" placeholder="제목" name="scriTitle" value="${studyCertificateRelatedInfo14VO.scriTitle}">
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
            <th scope="col">글쓴이</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
            <th scope="col">등록일</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${studyCertificateRelatedInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.scriIdx}</td>
                    <td>${map.scriName}</td>
                    <td><a href="<c:url value='/syncStudyCertificateTestRealtedForm?scriIdx=${map.scriIdx}' />">${map.scriTitle}</a></td>
                    <td>${map.scriContent}</td>
                    <td>${map.scriWriteDay}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
