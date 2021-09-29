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

<h3>book 커뮤니티 리스트</h3>

<br />

<form:form action="/bookCommunityList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="bcIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="bcIdx" placeholder="번호" name="bcIdx" value="${bookCommunity9VO.bcIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bcBookTitle">책제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">책제목</div>
                </div>
                <input type="text" class="form-control" id="bcBookTitle" placeholder="책제목" name="bcBookTitle" value="${bookCommunity9VO.bcBookTitle}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="bcTitle">게시판 제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">게시판 제목</div>
                </div>
                <input type="text" class="form-control" id="bcTitle" placeholder="게시판 제목" name="bcTitle" value="${bookCommunity9VO.bcTitle}">
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
            <th scope="col">작성자</th>
            <th scope="col">게시판 제목</th>
            <th scope="col">내용</th>
            <th scope="col">작성일자</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${bookCommunityList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.bcIdx}</td>
                    <td>${map.bcGenre}</td>
                    <td><a href="<c:url value='/syncBookBCommunityForm?bcIdx=${map.bcIdx}' />">${map.bcBookTitle}</a></td>
                    <td>${map.bcWriter}</td>
                    <td><%-- ${map.bbCount} 에서 가져온 값을 숫자로 변환 후 조건을 주어 별처리 (숫자로 변환하고 싶어서 굳이 해봄)--%>
                    	<fmt:formatNumber value="${map.bcCount}" pattern="0" type="number" var="num" />
                    
                    	<c:if test="${num eq 1}">⭐ </c:if>
                    	<c:if test="${num eq 2}">⭐⭐</c:if>
                    	<c:if test="${num eq 3}">⭐⭐⭐</c:if>
                    	<c:if test="${num eq 4}">⭐⭐⭐⭐ </c:if>
                    	<c:if test="${num eq 5}">⭐⭐⭐⭐⭐ </c:if>
                    </td>
                    <td>${map.bcName}</td>
                    <td>${map.bcTitle}</td>
                    <td>${map.bcContent}</td>
                    <td>${map.bcDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
