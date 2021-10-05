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


<h3>공부/자격증 관련 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncStudyCertificateTestRealtedFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="scriIdx" placeholder="작성번호" name="scriIdx" value="${studyCertificateRelatedInfo14VO.scriIdx}" <c:if test="${studyCertificateRelatedInfo14VO.scriIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="scriName">작성자</label>
            <input type="text" class="form-control" id="scriName" placeholder="작성자" name="scriName" value="${studyCertificateRelatedInfo14VO.scriName}">
        </div>
        <div class="form-group">
            <label for="scriTitle">제목</label>
            <input type="text" class="form-control" id="scriTitle" placeholder="제목" name="scriTitle" value="${studyCertificateRelatedInfo14VO.scriTitle}">
        </div>
        <div class="form-group">
            <label for="scriContent">내용</label>
            <input type="text" class="form-control" id="scriContent" placeholder="내용" name="scriContent" value="${studyCertificateRelatedInfo14VO.scriContent}">
        </div>
        <div class="form-group">
            <label for="scnDate">작성일자</label>
             <input type="date" class="form-control" id="scriWriteDay"  name="scriWriteDay" value="${studyCertificateRelatedInfo14VO.scriWriteDay}">
        </div>
        
        <c:if test="${studyCertificateRelatedInfo14VO.scriIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${studyCertificateRelatedInfo14VO.scriIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
