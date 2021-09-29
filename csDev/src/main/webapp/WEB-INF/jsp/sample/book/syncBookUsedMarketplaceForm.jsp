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

<h3>book 중고장터 글 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncBookUsedMarketplaceFormSave" method="post">
        <div class="form-group">
            <label for="ㅍ">작성번호</label>
            <input type="text" class="form-control" id="bumIdx" placeholder="작성번호" name="bumIdx" value="${bookUsedMarketplace10VO.bumIdx}" <c:if test="${bookUsedMarketplace10VO.bumIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="bumGenre">장르</label>
            <input type="text" class="form-control" id=bumGenre placeholder="장르" name="bumGenre" value="${bookUsedMarketplace10VO.bumGenre}">
        </div>
        <div class="form-group">
            <label for="bumBookTitle">책제목</label>
            <input type="text" class="form-control" id="bumBookTitle" placeholder="책제목" name="bumBookTitle" value="${bookUsedMarketplace10VO.bumBookTitle}">
        </div>
        <div class="form-group">
            <label for="bumWriter">작가</label>
            <input type="text" class="form-control" id="bumWriter" placeholder="작가" name="bumWriter" value="${bookUsedMarketplace10VO.bumWriter}">
        </div>
        <div class="form-group">
            <label for="bumName">작성자</label>
            <input type="text" class="form-control" id="bumName" placeholder="작성자" name="bumName" value="${bookUsedMarketplace10VO.bumName}">
        </div>
        <div class="form-group">
            <label for="bumTitle">글제목</label>
            <input type="text" class="form-control" id="bumTitle" placeholder="글제목" name="bumTitle" value="${bookUsedMarketplace10VO.bumTitle}">
        </div>
        
        <div class="form-group">
            <label for="bumContent">내용</label>
            <input type="text" class="form-control" id="bumContent" placeholder="내용" name="bumContent" value="${bookUsedMarketplace10VO.bumContent}">
        </div> 
      
        <div class="form-group">
            <label for="bumPrice">판매가</label>
             <input type="text" class="form-control" id="bumPrice" placeholder="판매가" name="bumPrice" value="${bookUsedMarketplace10VO.bumPrice}">
        </div>
          <div class="form-group">
            <label for="bumDate">작성일자</label>
            <input type="bumDate" class="form-control" id="bumDate" placeholder="작성일자" name="bumDate" value="${bookUsedMarketplace10VO.bumDate}">
        </div>
        <c:if test="${bookUsedMarketplace10VO.bumIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${bookUsedMarketplace10VO.bumIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
