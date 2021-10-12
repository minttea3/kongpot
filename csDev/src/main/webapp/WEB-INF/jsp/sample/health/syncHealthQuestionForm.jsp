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


<h3>건강관련 문의 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncHealthQuestionFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="hqIdx" placeholder="작성번호" name="hqIdx" value="${healthQuestion24VO.hqIdx}" <c:if test="${healthQuestion24VO.hqIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="hqName">작성자</label>
            <input type="text" class="form-control" id="hqName" placeholder="작성자" name="hqName" value="${healthQuestion24VO.hqName}">
        </div>
        <div class="form-group">
            <label for="hqTel">연락처</label>
            <input type="text" class="form-control" id="hqTel" placeholder="연락처" name="hqTel" value="${healthQuestion24VO.hqTel}">
        </div>
        <div class="form-group">
            <label for="hqTitle">제목</label>
            <input type="text" class="form-control" id="hqTitle" placeholder="제목" name="hqTitle" value="${healthQuestion24VO.hqTitle}">
        </div>
        <div class="form-group">
            <label for="hqContent">내용</label>
            <input type="text" class="form-control" id="hqContent" placeholder="내용" name="hqContent" value="${healthQuestion24VO.hqContent}">
        </div>
        <c:if test="${healthQuestion24VO.hqIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${healthQuestion24VO.hqIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
