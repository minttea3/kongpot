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

<h3>개발자 채용 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncCodingJobFormSave" method="post">
        <div class="form-group">
            <label for="cjIdx">공고 번호</label>
            <input type="text" class="form-control" id="cjIdx" placeholder="공고 번호" name="cjIdx" value="${codingJob5VO.cjIdx}" <c:if test="${codingInfo3VO.cjIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="cjCompany">회사명</label>
            <input type="text" class="form-control" id="cjCompany" placeholder="작성자" name="cjCompany" value="${codingJob5VO.cjCompany}">
        </div>
        <div class="form-group">
            <label for="cjName">작성자</label>
            <input type="text" class="form-control" id="cjName" placeholder="작성자" name="cjName" value="${codingJob5VO.cjName}">
        </div>
        <div class="form-group">
            <label for="cjTel">연락처</label>
            <input type="text" class="form-control" id="cjTel" placeholder="연락처" name="cjTel" value="${codingJob5VO.cjTel}">
        </div>
        <div class="form-group">
            <label for="cjEmail">이메일</label>
            <input type="text" class="form-control" id="cjEmail" placeholder="이메일" name="cjEmail" value="${codingJob5VO.cjEmail}">
        </div>
        <div class="form-group">
            <label for="cjTitle">제목</label>
            <input type="text" class="form-control" id="cjTitle" placeholder="제목" name="cjTitle" value="${codingJob5VO.cjTitle}">
        </div>
        <div class="form-group">
            <label for="cjContent">내용</label>
            <input type="text" class="form-control" id="cjContent" placeholder="내용" name="cjContent" value="${codingJob5VO.cjContent}">
        </div>
        <div class="form-group">
            <label for="cjDate">작성일자</label>
            <input type="date" class="form-control" id="cjDate" placeholder="작성일자" name="cjDate" value="${codingJob5VO.cjDate}">
        </div>
        <c:if test="${codingJob5VO.cjIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${codingJob5VO.cjIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
