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

<h3>Q&A 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncCodingQnAFormSave" method="post">
        <div class="form-group">
            <label for="userId">작성번호</label>
            <input type="text" class="form-control" id="cIdx" placeholder="작성번호" name="cIdx" value="${codingQnA2VO.cIdx}" <c:if test="${codingQnA2VO.cIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="userName">작성자</label>
            <input type="text" class="form-control" id="cName" placeholder="작성자" name="cName" value="${codingQnA2VO.cName}">
        </div>
        <div class="form-group">
            <label for="userPhone">문의종류</label>
            <input type="text" class="form-control" id="cType" placeholder="문의종류" name="cType" value="${codingQnA2VO.cType}">
        </div>
        <div class="form-group">
            <label for="userPhone">제목</label>
            <input type="text" class="form-control" id="cTitle" placeholder="제목" name="cTitle" value="${codingQnA2VO.cTitle}">
        </div>
        <div class="form-group">
            <label for="userPhone">내용</label>
            <input type="text" class="form-control" id="cContent" placeholder="내용" name="cContent" value="${codingQnA2VO.cContent}">
        </div>
        <div class="form-group">
            <label for="userPhone">작성일자</label>
            <input type="date" class="form-control" id="cDate" placeholder="작성일자" name="cDate" value="${codingQnA2VO.cDate}">
        </div>
        <c:if test="${codingQnA2VO.cIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${codingQnA2VO.cIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
