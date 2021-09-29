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

<h3>베스트셀러 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncBookBestsellerFormSave" method="post">
        <div class="form-group">
            <label for="bbIdx">작성번호</label>
            <input type="text" class="form-control" id="bbIdx" placeholder="작성번호" name="bbIdx" value="${bookBestseller8VO.bbIdx}" <c:if test="${bookBestseller8VO.bbIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="bbGenre">장르</label>
            <input type="text" class="form-control" id=bbGenre placeholder="장르" name="bbGenre" value="${bookBestseller8VO.bbGenre}">
        </div>
        <div class="form-group">
            <label for="bbTitle">책제목</label>
            <input type="text" class="form-control" id="bbTitle" placeholder="책제목" name="bbTitle" value="${bookBestseller8VO.bbTitle}">
        </div>
        <div class="form-group">
            <label for="bbWriter">작가</label>
            <input type="text" class="form-control" id="bbWriter" placeholder="작가" name="bbWriter" value="${bookBestseller8VO.bbWriter}">
        </div>
        <div class="form-group">
            <label for="bbCount">별점</label>
             <input type="text" class="form-control" id="bbCount" placeholder="별점은 숫자만 입력가능" name="bbCount" value="${bookBestseller8VO.bbCount}" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
        </div>
        <div class="form-group">
            <label for="bbPrice">가격</label>
             <input type="text" class="form-control" id="bbPrice" placeholder="가격은 숫자만 입력가능" name="bbPrice" value="${bookBestseller8VO.bbPrice}" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
        </div>
        <div class="form-group">
            <label for="bbPublicationDate">출판일</label>
             <input type="text" class="form-control" id="bbPublicationDate" placeholder="작성출판일일자" name="bbPublicationDate" value="${bookBestseller8VO.bbPublicationDate}">
        </div>
        <div class="form-group">
            <label for="bbStory">줄거리</label>
             <input type="text" class="form-control" id="bbStory" placeholder="줄거리" name="bbStory" value="${bookBestseller8VO.bbStory}">
        </div>
        <c:if test="${bookBestseller8VO.bbIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${bookBestseller8VO.bbIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
