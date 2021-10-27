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


<h3>영화관 블로거 후기 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncMovieReviewBloggerFormSave" method="post">
        <div class="form-group">
            <label for="mrbIdx">작성번호</label>
            <input type="text" class="form-control" id="mrbIdx" placeholder="작성번호" name="mrbIdx" value="${movieReviewBlogger45VO.mrbIdx}" <c:if test="${movieReviewBlogger45VO.mrbIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="mrbMovieTitle">영화 제목</label><br>
            <input type="text" class="form-control" id="mrbIdx" placeholder="영화 제목" name="mrbMovieTitle" value="${movieReviewBlogger45VO.mrbMovieTitle}"/>
        </div>
        <div class="form-group">
            <label for="mrbGenre">장르</label>
            <input type="text" class="form-control" id="mrbGenre" placeholder="장르" name="mrbGenre" value="${movieReviewBlogger45VO.mrbGenre}">
        </div>
        <div class="form-group">
            <label for="mrbContent">내용</label>
            <input type="text" class="form-control" id="mrbContent" placeholder="내용" name="mrbContent" value="${movieReviewBlogger45VO.mrbContent}">
        </div>
        <div class="form-group">
            <label for="mrbScore">별점</label><br>&nbsp;&nbsp;&nbsp;&nbsp;
           <%--  <input type="text" class="form-control" id="mrbScore" placeholder="별점" name="mrbScore" value="${movieReviewBlogger45VO.mrbScore}"> --%>
            <input type="radio"  id="mrbScore1" name="mrbScore" value="1" <c:if test="${movieReviewBlogger45VO.mrbScore eq 1}">checked="checked"</c:if>>
            <label for="mrbScore1">⭐</label>
            <input type="radio"  id="mrbScore2" name="mrbScore" value="2"<c:if test="${movieReviewBlogger45VO.mrbScore eq 2}">checked="checked"</c:if>>
            <label for="mrbScore2">⭐⭐</label>
            <input type="radio"  id="mrbScore3" name="mrbScore" value="3"<c:if test="${movieReviewBlogger45VO.mrbScore eq 3}">checked="checked"</c:if>>
            <label for="mrbScore3">⭐⭐⭐</label>
            <input type="radio"  id="mrbScore4" name="mrbScore" value="4"<c:if test="${movieReviewBlogger45VO.mrbScore eq 4}">checked="checked"</c:if>>
            <label for="mrbScore4">⭐⭐⭐⭐</label>
            <input type="radio"  id="mrbScore5" name="mrbScore" value="5"<c:if test="${movieReviewBlogger45VO.mrbScore eq 5}">checked="checked"</c:if>>
            <label for="mrbScore5">⭐⭐⭐⭐</label>
        </div>
        <c:if test="${movieReviewBlogger45VO.mrbIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${movieReviewBlogger45VO.mrbIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
