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


<h3>공부/자격증 커뮤니티 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncStudyCertificateCommunityFormSave" method="post">
        <div class="form-group">
            <label for="sccIdx">작성번호</label>
            <input type="text" class="form-control" id="sccIdx" placeholder="작성번호" name="sccIdx" value="${StudyCertificateCommunity17VO.sccIdx}" <c:if test="${StudyCertificateCommunity17VO.sccIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="sccName">작성자</label>
            <input type="text" class="form-control" id="sccName" placeholder="작성자" name="sccName" value="${StudyCertificateCommunity17VO.sccName}">
        </div>
        <div class="form-group">
            <label for="sccTestingName">시험명</label>
            <input type="text" class="form-control" id="sccTestingName" placeholder="시험명" name="sccTestingName" value="${StudyCertificateCommunity17VO.sccTestingName}">
        </div>
        <div class="form-group">
            <label for="sccTitle">제목</label>
            <input type="text" class="form-control" id="sccTitle" placeholder="제목" name="sccTitle" value="${StudyCertificateCommunity17VO.sccTitle}">
        </div>
        <div class="form-group">
            <label for="sccContent">내용</label>
            <input type="text" class="form-control" id="sccContent" placeholder="내용" name="sccContent" value="${StudyCertificateCommunity17VO.sccContent}">
        </div>
       
        
        <c:if test="${StudyCertificateCommunity17VO.sccIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${StudyCertificateCommunity17VO.sccIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
