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


<h3>공부/자격증 공지사항 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncStudyCertificateTestScheduleSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="sctsIdx" placeholder="작성번호" name="sctsIdx" value="${studyCertificateTestSchedule13VO.sctsIdx}" <c:if test="${studyCertificateTestSchedule13VO.sctsIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="scnTitle">구분</label>
            <input type="text" class="form-control" id="sctsType" placeholder="구분" name="sctsType" value="${studyCertificateTestSchedule13VO.sctsType}">
        </div>
        <div class="form-group">
            <label for="scnContent">등급</label>
            <input type="text" class="form-control" id="sctsClass" placeholder="등급" name="sctsClass" value="${studyCertificateTestSchedule13VO.sctsClass}">
        </div>
        <div class="form-group">
            <label for="sctsTestName">시험명</label>
             <input type="text" class="form-control" id="sctsTestName"  name="sctsTestName" value="${studyCertificateTestSchedule13VO.sctsTestName}">
        </div>
        <div class="form-group">
            <label for="sctsTestPeriod">접수기간</label>
             <input type="text" class="form-control" id="sctsTestPeriod"  name="sctsTestPeriod" value="${studyCertificateTestSchedule13VO.sctsTestPeriod}">
        </div>
        <div class="form-group">
            <label for="sctsTestingDay">시험일</label>
             <input type="text" class="form-control" id="sctsTestingDay"  name="sctsTestingDay" value="${studyCertificateTestSchedule13VO.sctsTestingDay}">
        </div>
        
        <c:if test="${studyCertificateTestSchedule13VO.sctsIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${studyCertificateTestSchedule13VO.sctsIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
