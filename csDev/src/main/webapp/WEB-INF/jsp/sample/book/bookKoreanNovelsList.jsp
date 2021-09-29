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

<h3>국내 소설 정보 리스트</h3>

<br />

<form:form action="/bookKoreanNovelsList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="bkIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="bkIdx" placeholder="번호" name="bkIdx" value="${bookKoreanNovelsInfo6VO.bkIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bkGenre">장르</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">장르</div>
                </div>
                <input type="text" class="form-control" id="bkGenre" placeholder="장르" name="bkGenre" value="${bookKoreanNovelsInfo6VO.bkGenre}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bkTitle">책제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">책제목</div>
                </div>
                <input type="text" class="form-control" id="bkTitle" placeholder="책제목" name="bkTitle" value="${bookKoreanNovelsInfo6VO.bkTitle}">
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
            <c:forEach var="map" items="${selectKoreanNovelsInfo}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.bkIdx}</td>
                    <td>${map.bkGenre}</td>
                    <td><a href="<c:url value='/syncbookKoreanNovelsForm?bkIdx=${map.bkIdx}' />">${map.bkTitle}</a></td>
                    <td>${map.bkWriter}</td>
                    <td>${map.bkCount}</td>
                    <td>${map.bkPrice}</td>
                    <td>${map.bkPublicationDate}</td>
                    <td>${map.bkStory}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
