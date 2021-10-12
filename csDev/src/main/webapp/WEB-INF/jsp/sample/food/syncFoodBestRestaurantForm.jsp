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


<h3>맛집 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncFoodBestRestaurantFormSave" method="post">
        <div class="form-group">
            <label for="fbrIdx">작성번호</label>
            <input type="text" class="form-control" id="fbrIdx" placeholder="작성번호" name="fbrIdx" value="${foodBestRestaurant22VO.fbrIdx}" <c:if test="${foodBestRestaurant22VO.fbrIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="fbrName">작성자</label>
            <input type="text" class="form-control" id="fbrName" placeholder="작성자" name="fbrName" value="${foodBestRestaurant22VO.fbrName}">
        </div>
        <div class="form-group">
            <label for="fbrType">분류</label>
            <input type="text" class="form-control" id="fbrType" placeholder="분류" name="fbrType" value="${foodBestRestaurant22VO.fbrType}">
        </div>
        <div class="form-group">
            <label for="fbrTitle">제목</label>
            <input type="text" class="form-control" id="fbrTitle" placeholder="제목" name="fbrTitle" value="${foodBestRestaurant22VO.fbrTitle}">
        </div>
        <div class="form-group">
            <label for="fbrContent">내용</label>
            <input type="text" class="form-control" id="fbrContent" placeholder="내용" name="fbrContent" value="${foodBestRestaurant22VO.fbrContent}">
        </div>
        <c:if test="${foodBestRestaurant22VO.fbrIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${foodBestRestaurant22VO.fbrIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
