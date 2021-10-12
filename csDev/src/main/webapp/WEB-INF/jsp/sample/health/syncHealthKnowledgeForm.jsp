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


<h3>건강 지식 소개 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncHealthKnowledgeFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="hkIdx" placeholder="작성번호" name="hkIdx" value="${healthKnowledge23VO.hkIdx}" <c:if test="${healthKnowledge23VO.hkIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="fsiName">작성자</label>
            <input type="text" class="form-control" id="hkName" placeholder="작성자" name="hkName" value="${healthKnowledge23VO.hkName}">
        </div>
        <div class="form-group">
            <label for="fsiTitle">제목</label>
            <input type="text" class="form-control" id="hkTitle" placeholder="제목" name="hkTitle" value="${healthKnowledge23VO.hkTitle}">
        </div>
        <div class="form-group">
            <label for="fsiContent">내용</label>
            <input type="text" class="form-control" id="hkContent" placeholder="내용" name="hkContent" value="${healthKnowledge23VO.hkContent}">
        </div>
        <div class="form-group">
            <label for="hkDate">날짜</label>
            <input type="date" class="form-control" id="hkDate" placeholder="날짜" name="hkDate" value="${healthKnowledge23VO.hkDate}">
        </div>
        <c:if test="${healthKnowledge23VO.hkIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${healthKnowledge23VO.hkIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
