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


<h3>공부/자격증 공지사항 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncStudyCertificateNoticSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="scnIdx" placeholder="작성번호" name="scnIdx" value="${studyCertificateNotice12VO.scnIdx}" <c:if test="${studyCertificateNotice12VO.scnIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="scnTitle">제목</label>
            <input type="text" class="form-control" id="scnTitle" placeholder="제목" name="scnTitle" value="${studyCertificateNotice12VO.scnTitle}">
        </div>
        <div class="form-group">
            <label for="scnContent">내용</label>
            <input type="text" class="form-control" id="scnContent" placeholder="내용" name="scnContent" value="${studyCertificateNotice12VO.scnContent}">
        </div>
        <div class="form-group">
            <label for="scnDate">등록일</label>
             <input type="date" class="form-control" id="scnDate"  name="scnDate" value="${studyCertificateNotice12VO.scnDate}">
        </div>
        
        <c:if test="${studyCertificateNotice12VO.scnIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${studyCertificateNotice12VO.scnIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
