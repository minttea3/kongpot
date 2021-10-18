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


<h3>식물 블로거 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsBloggerFormSave" method="post">
        <div class="form-group">
            <label for="pbIdx">작성번호</label>
            <input type="text" class="form-control" id="pbIdx" placeholder="작성번호" name="pbIdx" value="${plantsBlogger32VO.pbIdx}" <c:if test="${plantsBlogger32VO.pbIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="pbName">이름</label>
            <input type="text" class="form-control" id="pbName" placeholder="이름" name="pbName" value="${plantsBlogger32VO.pbName}">
        </div>
        <div class="form-group">
            <label for="pbTitle">블로그명</label>
            <input type="text" class="form-control" id="pbTitle" placeholder="블로그명" name="pbTitle" value="${plantsBlogger32VO.pbTitle}">
        </div>
        <div class="form-group">
            <label for="pbActivityStatus">현재 활동 여부</label>
            <%-- <input type="text" class="form-control" id="pbActivityStatus" placeholder="현재 활동 여부" name="pbActivityStatus" value="${plantsBlogger32VO.pbActivityStatus}"> --%>
        	<div>&nbsp;&nbsp;&nbsp;<input type="checkbox" id="pbActivityStatus" name="pbActivityStatus" value="Y" <c:if test="${plantsBlogger32VO.pbActivityStatus eq 'Y' }">checked="checked"</c:if>></div>
        </div>
        <c:if test="${plantsBlogger32VO.pbIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsBlogger32VO.pbIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
