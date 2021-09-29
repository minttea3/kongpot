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

<h3>국내 소설 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncBookKoreanNovelsFormSave" method="post">
        <div class="form-group">
            <label for="bkIdx">작성번호</label>
            <input type="text" class="form-control" id="bkIdx" placeholder="작성번호" name="bkIdx" value="${bookKoreanNovelsInfo6VO.bkIdx}" <c:if test="${bookKoreanNovelsInfo6VO.bkIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="bkGenre">장르</label>
            <input type="text" class="form-control" id=bkGenre placeholder="장르" name="bkGenre" value="${bookKoreanNovelsInfo6VO.bkGenre}">
        </div>
        <div class="form-group">
            <label for="bkTitle">책제목</label>
            <input type="text" class="form-control" id="bkTitle" placeholder="책제목" name="bkTitle" value="${bookKoreanNovelsInfo6VO.bkTitle}">
        </div>
        <div class="form-group">
            <label for="bkWriter">작가</label>
            <input type="text" class="form-control" id="bkWriter" placeholder="작가" name="bkWriter" value="${bookKoreanNovelsInfo6VO.bkWriter}">
        </div>
        <div class="form-group">
            <label for="bkCount">별점</label>
             <input type="text" class="form-control" id="bkCount" placeholder="별점" name="bkCount" value="${bookKoreanNovelsInfo6VO.bkCount}">
        </div>
        <div class="form-group">
            <label for="bkPrice">가격</label>
             <input type="text" class="form-control" id="bkPrice" placeholder="가격" name="bkPrice" value="${bookKoreanNovelsInfo6VO.bkPrice}">
        </div>
        <div class="form-group">
            <label for="bkPublicationDate">출판일</label>
             <input type="text" class="form-control" id="bkPublicationDate" placeholder="작성출판일일자" name="bkPublicationDate" value="${bookKoreanNovelsInfo6VO.bkPublicationDate}">
        </div>
        <div class="form-group">
            <label for="bkStory">줄거리</label>
             <input type="text" class="form-control" id="bkStory" placeholder="줄거리" name="bkStory" value="${bookKoreanNovelsInfo6VO.bkStory}">
        </div>
        <c:if test="${bookKoreanNovelsInfo6VO.bkIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${bookKoreanNovelsInfo6VO.bkIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
