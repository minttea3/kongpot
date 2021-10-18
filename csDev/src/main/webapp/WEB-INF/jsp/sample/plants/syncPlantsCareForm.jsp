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


<h3>식물 관리법 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsCareFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="pbfIdx" placeholder="작성번호" name="pbfIdx" value="${plantsCare31VO.pbfIdx}" <c:if test="${plantsCare31VO.pbfIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="pbfType">타입</label>
            <input type="text" class="form-control" id="pbfType" placeholder="타입" name="pbfType" value="${plantsCare31VO.pbfType}">
        </div>
        <div class="form-group">
            <label for="pbfTitle">이름</label>
            <input type="text" class="form-control" id="pbfTitle" placeholder="이름" name="pbfTitle" value="${plantsCare31VO.pbfTitle}">
        </div>
        <div class="form-group">
            <label for="pbfContent">제목</label>
            <input type="text" class="form-control" id="pbfContent" placeholder="제목" name="pbfContent" value="${plantsCare31VO.pbfContent}">
        </div>
        <div class="form-group">
            <label for="pbfDate">내용</label>
            <input type="text" class="form-control" id="pbfDate" placeholder="내용" name="pbfDate" value="${plantsCare31VO.pbfDate}">
        </div>
        <c:if test="${plantsCare31VO.pbfIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsCare31VO.pbfIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
