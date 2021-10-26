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
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />


<h3>영화관 개봉일 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncMovieInfoFormSave" method="post">
        <div class="form-group">
            <label for="miIdx">작성번호</label>
            <input type="text" class="form-control" id="miIdx" placeholder="작성번호" name="miIdx" value="${movieInfo44VO.miIdx}" <c:if test="${movieInfo44VO.miIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="miMovieTitle">영화 제목</label><br>
            <input type="text" class="form-control" id="miIdx" placeholder="영화 제목" name="miMovieTitle" value="${movieInfo44VO.miMovieTitle}"/>
        </div>
        <div class="form-group">
            <label for="miGenre">장르</label>
            <input type="text" class="form-control" id="miGenre" placeholder="장르" name="miGenre" value="${movieInfo44VO.miGenre}">
        </div>
        <div class="form-group">
            <label for="miPrice">가격</label>
            <input type="text" class="form-control" id="miPrice" placeholder="가격" name="miPrice" value="${movieInfo44VO.miPrice}">
        </div>
        <div class="form-group">
            <label for="miReleaseDate">개봉일</label>
            <input type="date" class="form-control" id="miReleaseDate" placeholder="개봉일" name="miReleaseDate" value="${movieInfo44VO.miReleaseDate}">
        </div>
        <c:if test="${movieInfo44VO.miIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${movieInfo44VO.miIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
