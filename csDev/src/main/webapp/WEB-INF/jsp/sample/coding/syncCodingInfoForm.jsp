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

<h3>정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncCodingInfoFormSave" method="post">
        <div class="form-group">
            <label for="userId">작성번호</label>
            <input type="text" class="form-control" id="ciIdx" placeholder="작성번호" name="ciIdx" value="${codingInfo3VO.ciIdx}" <c:if test="${codingInfo3VO.ciIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="userName">작성자</label>
            <input type="text" class="form-control" id="ciName" placeholder="작성자" name="ciName" value="${codingInfo3VO.ciName}">
        </div>
        <div class="form-group">
            <label for="userPhone">제목</label>
            <input type="text" class="form-control" id="ciTitle" placeholder="제목" name="ciTitle" value="${codingInfo3VO.ciTitle}">
        </div>
        <div class="form-group">
            <label for="userPhone">내용</label>
            <input type="text" class="form-control" id="ciContent" placeholder="내용" name="ciContent" value="${codingInfo3VO.ciContent}">
        </div>
        <div class="form-group">
            <label for="userPhone">작성일자</label>
            <input type="date" class="form-control" id="ciDate" placeholder="작성일자" name="ciDate" value="${codingInfo3VO.ciDate}">
        </div>
        <c:if test="${codingInfo3VO.ciIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${codingInfo3VO.ciIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
