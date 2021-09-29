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
<html>
<head>
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>코딩 Q&A 리스트</h3>

<br />

<form:form action="/codingQnAList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="cIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="cIdx" placeholder="번호" name="cIdx" value="${codingQnA2VO.cIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="cName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="cName" placeholder="작성자" name="cName" value="${codingQnA2VO.cName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="cTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="cTitle" placeholder="제목" name="cTitle" value="${codingQnA2VO.cTitle}">
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
            <th scope="col">문의종류</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
            <th scope="col">작성일자</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${codingQuaList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.cIdx}</td>
                    <td><a href="<c:url value='/syncCodingQnAForm?cIdx=${map.cIdx}' />">${map.cName}</a></td>
                    <td>${map.cType}</td>
                    <td>${map.cTitle}</td>
                    <td>${map.cContent}</td>
                    <td>${map.cDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
