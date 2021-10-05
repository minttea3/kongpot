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

<h3>공부/자격증 뉴스기사 리스트</h3>

<br />

<form:form action="/studyCertificateQnAList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="scqIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="scqIdx" placeholder="번호" name="scqIdx" value="${studyCertificateQnA16VO.scqIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="scqName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="scqName" placeholder="작성자" name="scqName" value="${studyCertificateQnA16VO.scqName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="scqTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="scqTitle" placeholder="제목" name="scqTitle" value="${studyCertificateQnA16VO.scqTitle}">
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
            <th scope="col">작성일자</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${studyCertificateQnAList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.scqIdx}</td>
                    <td>${map.scqName}</td>
                    <td><a href="<c:url value='/syncStudyCertificateQnAForm?scqIdx=${map.scqIdx}' />">${map.scqTitle}</a></td>
                    
                    
                    <td>${map.scqContent}</td>
                    <td>${map.scqWriteDay}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
