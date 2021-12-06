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


<h3>원데이클리스 - 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassInfoFormSave" method="post">
        <div class="form-group">
            <label for="ociIdx">작성번호</label>
            <input type="text" class="form-control" id="ociIdx" placeholder="작성번호" name="ociIdx" value="${onedayClassInfo49VO.ociIdx}" <c:if test="${onedayClassInfo49VO.ociIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="miMovieTitle">작성자</label><br>
            <input type="text" class="form-control" id="ociWriter" placeholder="작성자" name="ociWriter" value="${onedayClassInfo49VO.ociWriter}"/>
        </div>
        <div class="form-group">
            <label for="ociTitle">제목</label>
            <input type="text" class="form-control" id="ociTitle" placeholder="제목" name="ociTitle" value="${onedayClassInfo49VO.ociTitle}">
        </div>
        <div class="form-group">
            <label for="ociContent">내용</label>
            <input type="text" class="form-control" id="ociContent" placeholder="내용" name="ociContent" value="${onedayClassInfo49VO.ociContent}">
        </div>
        <div class="form-group">
            <label for="ociWriteDay">작성일자</label>
            <input type="date" class="form-control" id="ociWriteDay" placeholder="작성일자" name="ociWriteDay" value="${onedayClassInfo49VO.ociWriteDay}">
        </div>
        <c:if test="${onedayClassInfo49VO.ociIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassInfo49VO.ociIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
