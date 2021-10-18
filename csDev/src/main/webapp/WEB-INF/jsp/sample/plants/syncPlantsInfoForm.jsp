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


<h3>건강관련 뉴스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsInfoFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="piIdx" placeholder="작성번호" name="piIdx" value="${plantsInfo30VO.piIdx}" <c:if test="${plantsInfo30VO.piIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="piType">타입</label>
            <input type="text" class="form-control" id="piType" placeholder="타입" name="piType" value="${plantsInfo30VO.piType}">
        </div>
        <div class="form-group">
            <label for="piName">이름</label>
            <input type="text" class="form-control" id="piName" placeholder="이름" name="piName" value="${plantsInfo30VO.piName}">
        </div>
        <div class="form-group">
            <label for="piTitle">제목</label>
            <input type="text" class="form-control" id="piTitle" placeholder="제목" name="piTitle" value="${plantsInfo30VO.piTitle}">
        </div>
        <div class="form-group">
            <label for="piContent">내용</label>
            <input type="text" class="form-control" id="piContent" placeholder="내용" name="piContent" value="${plantsInfo30VO.piContent}">
        </div>
        <c:if test="${plantsInfo30VO.piIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsInfo30VO.piIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
