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

<h3>정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncCodingCommunityFormSave" method="post">
        <div class="form-group">
            <label for="ccIdx">작성번호</label>
            <input type="text" class="form-control" id="ccIdx" placeholder="작성번호" name="ccIdx" value="${codingCommunity4VO.ccIdx}" <c:if test="${codingCommunity4VO.ccIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="ccName">작성자</label>
            <input type="text" class="form-control" id="ccName" placeholder="작성자" name="ccName" value="${codingCommunity4VO.ccName}">
        </div>
        <div class="form-group">
            <label for="ccTitle">제목</label>
            <input type="text" class="form-control" id="ccTitle" placeholder="제목" name="ccTitle" value="${codingCommunity4VO.ccTitle}">
        </div>
        <div class="form-group">
            <label for="ccContent">내용</label>
            <input type="text" class="form-control" id="ccContent" placeholder="내용" name="ccContent" value="${codingCommunity4VO.ccContent}">
        </div>
        <div class="form-group">
            <label for="ccDate">작성일자</label>
             <input type="date" class="form-control" id="ccDate" placeholder="작성일자" name="ccDate" value="${codingCommunity4VO.ccDate}">
        </div>
        <c:if test="${codingCommunity4VO.ccIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${codingCommunity4VO.ccIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
