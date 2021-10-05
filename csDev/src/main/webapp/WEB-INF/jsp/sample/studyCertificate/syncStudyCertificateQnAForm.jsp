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
    <form:form id="frm" name="frm" action="/syncStudyCertificateQnAFormSave" method="post">
        <div class="form-group">
            <label for="scqIdx">작성번호</label>
            <input type="text" class="form-control" id="scqIdx" placeholder="작성번호" name="scqIdx" value="${studyCertificateQnA16VO.scqIdx}" <c:if test="${studyCertificateQnA16VO.scqIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="scqName">작성자</label>
            <input type="text" class="form-control" id="scqName" placeholder="작성자" name="scqName" value="${studyCertificateQnA16VO.scqName}">
        </div>
        <div class="form-group">
            <label for="scqTitle">제목</label>
            <input type="text" class="form-control" id="scqTitle" placeholder="제목" name="scqTitle" value="${studyCertificateQnA16VO.scqTitle}">
        </div>
        <div class="form-group">
            <label for="scqContent">내용</label>
            <input type="text" class="form-control" id="scqContent" placeholder="내용" name="scqContent" value="${studyCertificateQnA16VO.scqContent}">
        </div>
        <div class="form-group">
            <label for="scnDate">작성일자</label>
             <input type="date" class="form-control" id="scqWriteDay"  name="scqWriteDay" value="${studyCertificateQnA16VO.scqWriteDay}">
        </div>
        
        <c:if test="${studyCertificateQnA16VO.scqIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${studyCertificateQnA16VO.scqIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
