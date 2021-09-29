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

<h3>국외 소설 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncBookForeignNovelsFormSave" method="post">
        <div class="form-group">
            <label for="bfIdx">작성번호</label>
            <input type="text" class="form-control" id="bfIdx" placeholder="작성번호" name="bfIdx" value="${bookForeignNovelsInfo7VO.bfIdx}" <c:if test="${bookForeignNovelsInfo7VO.bfIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="bfGenre">장르</label>
            <input type="text" class="form-control" id="bfGenre" placeholder="장르" name="bfGenre" value="${bookForeignNovelsInfo7VO.bfGenre}">
        </div>
        <div class="form-group">
            <label for="bfTitle">책제목</label>
            <input type="text" class="form-control" id="bfTitle" placeholder="책제목" name="bfTitle" value="${bookForeignNovelsInfo7VO.bfTitle}">
        </div>
        <div class="form-group">
            <label for="bfWriter">작가</label>
            <input type="text" class="form-control" id="bfWriter" placeholder="작가" name="bfWriter" value="${bookForeignNovelsInfo7VO.bfWriter}">
        </div>
        <div class="form-group">
            <label for="bfCount">별점</label>
             <input type="text" class="form-control" id="bfCount" placeholder="별점" name="bfCount" value="${bookForeignNovelsInfo7VO.bfCount}">
        </div>
        <div class="form-group">
            <label for="bfPrice">가격</label>
             <input type="text" class="form-control" id="bfPrice" placeholder="가격" name="bfPrice" value="${bookForeignNovelsInfo7VO.bfPrice}">
        </div>
        <div class="form-group">
            <label for="bfPublicationDate">출판일</label>
             <input type="text" class="form-control" id="bfPublicationDate" placeholder="작성출판일일자" name="bfPublicationDate" value="${bookForeignNovelsInfo7VO.bfPublicationDate}">
        </div>
        <div class="form-group">
            <label for="bfStory">줄거리</label>
             <input type="text" class="form-control" id="bfStory" placeholder="줄거리" name="bfStory" value="${bookForeignNovelsInfo7VO.bfStory}">
        </div>
        <c:if test="${bookForeignNovelsInfo7VO.bfIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${bookForeignNovelsInfo7VO.bfIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
