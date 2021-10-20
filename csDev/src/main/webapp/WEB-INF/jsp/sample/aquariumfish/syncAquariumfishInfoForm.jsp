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


<h3>물고기 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishInfoFormSave" method="post">
        <div class="form-group">
            <label for="aiIdx">작성번호</label>
            <input type="text" class="form-control" id="aiIdx" placeholder="작성번호" name="aiIdx" value="${aquariumfishInfo37VO.aiIdx}" <c:if test="${aquariumfishInfo37VO.aiIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="aiType">종류</label><br>
        	<input type="radio" name="aiType" id="aiType1" value="해수어" <c:if test="${aquariumfishInfo37VO.aiType eq '해수어'}">checked="checked" </c:if>>
        	<label for="aiType1">해수어</label>
        	<input type="radio" name="aiType" id="aiType2" value="담수어" <c:if test="${aquariumfishInfo37VO.aiType eq '담수어'}">checked="checked" </c:if>>
        	<label for="aiType2">담수어</label>
        </div>
        <div class="form-group">
            <label for="aiWriter">작성자</label>
            <input type="text" class="form-control" id="aiWriter" placeholder="작성자" name="aiWriter" value="${aquariumfishInfo37VO.aiWriter}">
        </div>
        <div class="form-group">
            <label for="aiTitle">제목</label>
            <input type="text" class="form-control" id="aiTitle" placeholder="제목" name="aiTitle" value="${aquariumfishInfo37VO.aiTitle}">
        </div>
        <div class="form-group">
            <label for="aiContent">내용</label>
            <input type="text" class="form-control" id="aiContent" placeholder="내용" name="aiContent" value="${aquariumfishInfo37VO.aiContent}">
        </div>
        <c:if test="${aquariumfishInfo37VO.aiIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishInfo37VO.aiIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
