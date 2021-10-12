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
    <form:form id="frm" name="frm" action="/syncHealthNewsFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="hnIdx" placeholder="작성번호" name="hnIdx" value="${healthNews25VO.hnIdx}" <c:if test="${healthNews25VO.hnIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="hnName">작성자</label>
            <input type="text" class="form-control" id="hnName" placeholder="작성자" name="hnName" value="${healthNews25VO.hnName}">
        </div>
        <div class="form-group">
            <label for="hnTitle">제목</label>
            <input type="text" class="form-control" id="hnTitle" placeholder="제목" name="hnTitle" value="${healthNews25VO.hnTitle}">
        </div>
        <div class="form-group">
            <label for="hnContent">내용</label>
            <input type="text" class="form-control" id="hnContent" placeholder="내용" name="hnContent" value="${healthNews25VO.hnContent}">
        </div>
        <div class="form-group">
            <label for="hnDate">날짜</label>
            <input type="date" class="form-control" id="hnDate" placeholder="날짜" name="hnDate" value="${healthNews25VO.hnDate}">
        </div>
        <c:if test="${healthNews25VO.hnIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${healthNews25VO.hnIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
