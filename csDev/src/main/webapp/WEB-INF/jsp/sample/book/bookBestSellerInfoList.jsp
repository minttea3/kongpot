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

<h3>베스트 셀러 정보 리스트</h3>

<br />

<form:form action="/bookBestSellerInfoList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="bbIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="bbIdx" placeholder="번호" name="bbIdx" value="${bookBestseller8VO.bbIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bbGenre">장르</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">장르</div>
                </div>
                <input type="text" class="form-control" id="bbGenre" placeholder="장르" name="bbGenre" value="${bookBestseller8VO.bbGenre}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bbTitle">책제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">책제목</div>
                </div>
                <input type="text" class="form-control" id="bbTitle" placeholder="책제목" name="bbTitle" value="${bookBestseller8VO.bbTitle}">
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
                    <td>${map.bbIdx}</td>
                    <td>${map.bbGenre}</td>
                    <td><a href="<c:url value='/syncBookBestSellerForm?bbIdx=${map.bbIdx}' />">${map.bbTitle}</a></td>
                    <td>${map.bbWriter}</td>
                    <td><%-- ${map.bbCount} 에서 가져온 값을 숫자로 변환 후 조건을 주어 별처리 (숫자로 변환하고 싶어서 굳이 해봄)--%>
                    	<fmt:formatNumber value="${map.bbCount}" pattern="0" type="number" var="num" />
                    
                    	<c:if test="${num eq 1}">⭐ </c:if>
                    	<c:if test="${num eq 2}">⭐⭐</c:if>
                    	<c:if test="${num eq 3}">⭐⭐⭐</c:if>
                    	<c:if test="${num eq 4}">⭐⭐⭐⭐ </c:if>
                    	<c:if test="${num eq 5}">⭐⭐⭐⭐⭐ </c:if>
                    </td>
                    <td>
                    <!-- 숫자 천단위마다 자동 콤마 처리 -->
                    <fmt:formatNumber value="${map.bbPrice}" pattern="#,###"/>
					</td>
                    <td>${map.bbPublicationDate}</td>
                    <td>${map.bbStory}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
