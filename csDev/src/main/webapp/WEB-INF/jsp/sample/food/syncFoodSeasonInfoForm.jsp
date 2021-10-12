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


<h3>계절 요리 레시피 소개 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncFoodSeasonInfoFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="fsiIdx" placeholder="작성번호" name="fsiIdx" value="${foodSeasonInfo19VO.fsiIdx}" <c:if test="${foodSeasonInfo19VO.fsiIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="fsiName">작성자</label>
            <input type="text" class="form-control" id="fsiName" placeholder="작성자" name="fsiName" value="${foodSeasonInfo19VO.fsiName}">
        </div>
        <div class="form-group">
            <label for="fsiIngredients">재료</label>
            <input type="text" class="form-control" id="fsiIngredients" placeholder="재료" name="fsiIngredients" value="${foodSeasonInfo19VO.fsiIngredients}">
        </div>
        <div class="form-group">
            <label for="fsiTitle">제목</label>
            <input type="text" class="form-control" id="fsiTitle" placeholder="제목" name="fsiTitle" value="${foodSeasonInfo19VO.fsiTitle}">
        </div>
        <div class="form-group">
            <label for="fsiContent">내용</label>
            <input type="text" class="form-control" id="fsiContent" placeholder="내용" name="fsiContent" value="${foodSeasonInfo19VO.fsiContent}">
        </div>
        <c:if test="${foodSeasonInfo19VO.fsiIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${foodSeasonInfo19VO.fsiIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
