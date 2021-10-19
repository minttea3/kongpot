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


<h3>식물 블로그 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsBlogFormSave" method="post">
        <div class="form-group">
            <label for="pbsIdx">작성번호</label>
            <input type="text" class="form-control" id="pbsIdx" placeholder="작성번호" name="pbsIdx" value="${plantsBlog33VO.pbsIdx}" <c:if test="${plantsBlog33VO.pbsIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="pbsName">작성자</label>
            <input type="text" class="form-control" id="pbsName" placeholder="작성자" name="pbsName" value="${plantsBlog33VO.pbsName}">
        </div>
        <div class="form-group">
            <label for="pbsTitle">제목</label>
            <input type="text" class="form-control" id="pbsTitle" placeholder="제목" name="pbsTitle" value="${plantsBlog33VO.pbsTitle}">
        </div>
        <div class="form-group">
            <label for="pbsContent">내용</label>
            <input type="text" class="form-control" id="pbsContent" placeholder="내용" name="pbsContent" value="${plantsBlog33VO.pbsContent}">
        </div>
        <div class="form-group">
            <label for="pbsDay">날짜</label>
            <input type="date" class="form-control" id="pbsDay" placeholder="날짜" name="pbsDay" value="${plantsBlog33VO.pbsDay}">
        </div>
        <c:if test="${plantsBlog33VO.pbsIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsBlog33VO.pbsIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
