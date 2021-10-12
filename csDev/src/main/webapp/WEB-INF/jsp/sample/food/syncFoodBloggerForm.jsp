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


<h3>요리 블로거 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncFoodBloggerFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="fbIdx" placeholder="작성번호" name="fbIdx" value="${foodBlogger21VO.fbIdx}" <c:if test="${foodBlogger21VO.fbIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="frName">작성자</label>
            <input type="text" class="form-control" id="fbName" placeholder="작성자" name="fbName" value="${foodBlogger21VO.fbName}">
        </div>
        <div class="form-group">
            <label for="frType">분류</label>
            <input type="text" class="form-control" id="fbType" placeholder="분류" name="fbType" value="${foodBlogger21VO.fbType}">
        </div>
        <div class="form-group">
            <label for="fbTitle">제목</label>
            <input type="text" class="form-control" id="fbTitle" placeholder="제목" name="fbTitle" value="${foodBlogger21VO.fbTitle}">
        </div>
        <div class="form-group">
            <label for="fbContent">내용</label>
            <input type="text" class="form-control" id="fbContent" placeholder="내용" name="fbContent" value="${foodBlogger21VO.fbContent}">
        </div>
        <c:if test="${foodBlogger21VO.fbIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${foodBlogger21VO.fbIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
