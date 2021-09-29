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

<h3>국외 소설 정보 리스트</h3>

<br />

<form:form action="/bookForeignNovelsList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="bfIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="bfIdx" placeholder="번호" name="bfIdx" value="${bookForeignNovelsInfo7VO.bfIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bfGenre">장르</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">장르</div>
                </div>
                <input type="text" class="form-control" id="bfGenre" placeholder="장르" name="bfGenre" value="${bookForeignNovelsInfo7VO.bfGenre}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bfTitle">책제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">책제목</div>
                </div>
                <input type="text" class="form-control" id="bfTitle" placeholder="책제목" name="bfTitle" value="${bookForeignNovelsInfo7VO.bfTitle}">
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
            <th scope="col">장르</th>
            <th scope="col">책제목</th>
            <th scope="col">작가</th>
            <th scope="col">별점</th>
            <th scope="col">가격</th>
            <th scope="col">출판일</th>
            <th scope="col">줄거리</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${bookForeignNovelsInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.bfIdx}</td>
                    <td>${map.bfGenre}</td>
                    <td><a href="<c:url value='/syncbookForeignNovelsForm?bfIdx=${map.bfIdx}' />">${map.bfTitle}</a></td>
                    <td>${map.bfWriter}</td>
                    <td>${map.bfCount}</td>
                    <td>${map.bfPrice}</td>
                    <td>${map.bfPublicationDate}</td>
                    <td>${map.bfStory}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
