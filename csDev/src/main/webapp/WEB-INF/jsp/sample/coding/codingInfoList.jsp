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

<h3>코딩 정보 리스트</h3>

<br />

<form:form action="/codingInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ciIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="ciIdx" placeholder="번호" name="ciIdx" value="${codingInfo3VO.ciIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="ciName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="ciName" placeholder="작성자" name="ciName" value="${codingInfo3VO.ciName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="ciTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="ciTitle" placeholder="제목" name="ciTitle" value="${codingQnA2VO.ciTitle}">
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
            <c:forEach var="map" items="${codingInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.ciIdx}</td>
                    <td><a href="<c:url value='/syncCodingInfoForm?ciIdx=${map.ciIdx}' />">${map.ciName}</a></td>
                    <td>${map.ciTitle}</td>
                    <td>${map.ciContent}</td>
                    <td>${map.ciDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
