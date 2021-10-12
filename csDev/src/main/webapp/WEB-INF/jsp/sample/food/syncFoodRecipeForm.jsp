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


<h3>요리 레시피 소개 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncFoodRecipeFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="frIdx" placeholder="작성번호" name="frIdx" value="${foodRecipe20VO.frIdx}" <c:if test="${foodRecipe20VO.frIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="frName">작성자</label>
            <input type="text" class="form-control" id="frName" placeholder="작성자" name="frName" value="${foodRecipe20VO.frName}">
        </div>
        <div class="form-group">
            <label for="frType">분류</label>
            <input type="text" class="form-control" id="frType" placeholder="분류" name="frType" value="${foodRecipe20VO.frType}">
        </div>
        <div class="form-group">
            <label for="frTitle">제목</label>
            <input type="text" class="form-control" id="frTitle" placeholder="제목" name="frTitle" value="${foodRecipe20VO.frTitle}">
        </div>
        <div class="form-group">
            <label for="frContent">내용</label>
            <input type="text" class="form-control" id="frContent" placeholder="내용" name="frContent" value="${foodRecipe20VO.frContent}">
        </div>
        <c:if test="${foodRecipe20VO.frIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${foodRecipe20VO.frIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
