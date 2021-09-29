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

<h3>book 커뮤니티 글 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncBookBCommunityFormSave" method="post">
        <div class="form-group">
            <label for="bbIdx">작성번호</label>
            <input type="text" class="form-control" id="bcIdx" placeholder="작성번호" name="bcIdx" value="${bookCommunity9VO.bcIdx}" <c:if test="${bookCommunity9VO.bcIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="bbGenre">장르</label>
            <input type="text" class="form-control" id=bcGenre placeholder="장르" name="bcGenre" value="${bookCommunity9VO.bcGenre}">
        </div>
        <div class="form-group">
            <label for="bbTitle">책제목</label>
            <input type="text" class="form-control" id="bcBookTitle" placeholder="책제목" name="bcBookTitle" value="${bookCommunity9VO.bcBookTitle}">
        </div>
        <div class="form-group">
            <label for="bbWriter">작가</label>
            <input type="text" class="form-control" id="bcWriter" placeholder="작가" name="bcWriter" value="${bookCommunity9VO.bcWriter}">
        </div>
        <div class="form-group">
            <label for="bbCount">별점</label>
             <input type="text" class="form-control" id="bcCount" placeholder="별점은 숫자만 입력가능" name="bcCount" value="${bookCommunity9VO.bcCount}" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
        </div>
        <div class="form-group">
            <label for="bbWriter">작성자</label>
            <input type="text" class="form-control" id="bcName" placeholder="작성자" name="bcName" value="${bookCommunity9VO.bcName}">
        </div> 
      
        <div class="form-group">
            <label for="bcTitle">제목</label>
             <input type="text" class="form-control" id="bcTitle" placeholder="제목" name="bcTitle" value="${bookCommunity9VO.bcTitle}">
        </div>
        <div class="form-group">
            <label for="bcContent">내용</label>
             <input type="text" class="form-control" id="bcContent" placeholder="내용" name="bcContent" value="${bookCommunity9VO.bcContent}">
        </div>
          <div class="form-group">
            <label for="bbWriter">작성일자</label>
            <input type="date" class="form-control" id="bcDate" placeholder="작성일자" name="bcDate" value="${bookCommunity9VO.bcDate}" max="1">
        </div>
        <c:if test="${bookCommunity9VO.bcIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${bookCommunity9VO.bcIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
