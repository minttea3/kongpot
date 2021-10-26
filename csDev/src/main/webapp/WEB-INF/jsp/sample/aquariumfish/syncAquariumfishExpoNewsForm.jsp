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


<h3>물고기 뉴스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishExpoNewsFormSave" method="post">
        <div class="form-group">
            <label for="anIdx">작성번호</label>
            <input type="text" class="form-control" id="anIdx" placeholder="작성번호" name="anIdx" value="${aquariumfishNews41VO.anIdx}" <c:if test="${aquariumfishNews41VO.anIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="anPress">언론사</label><br>
            <input type="text" class="form-control" id="anPress" placeholder="언론사" name="anPress" value="${aquariumfishNews41VO.anPress}"/>
        	
        </div>
        <div class="form-group">
            <label for="anName">작성자</label>
            <input type="text" class="form-control" id="anName" placeholder="작성자" name="anName" value="${aquariumfishNews41VO.anName}">
        </div>
        <div class="form-group">
            <label for="anTitle">제목</label>
            <input type="text" class="form-control" id="anTitle" placeholder="제목" name="anTitle" value="${aquariumfishNews41VO.anTitle}">
        </div>
        <div class="form-group">
            <label for="anContent">내용</label>
            <input type="text" class="form-control" id="anContent" placeholder="내용" name="anContent" value="${aquariumfishNews41VO.anContent}">
        </div>
        <c:if test="${aquariumfishNews41VO.anIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishNews41VO.anIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
