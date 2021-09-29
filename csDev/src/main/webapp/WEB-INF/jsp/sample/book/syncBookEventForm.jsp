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

<h3>국외 소설 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncBookEventFormSave" method="post">
        <div class="form-group">
            <label for="beIdx">작성번호</label>
            <input type="text" class="form-control" id="beIdx" placeholder="작성번호" name="beIdx" value="${bookEvent11VO.beIdx}" <c:if test="${bookEvent11VO.beIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="beName">작성자</label>
            <input type="text" class="form-control" id="beName" placeholder="작성자" name="beName" value="${bookEvent11VO.beName}">
        </div>
        <div class="form-group">
            <label for="beTitle">제목</label>
            <input type="text" class="form-control" id="beTitle" placeholder="제목" name="beTitle" value="${bookEvent11VO.beTitle}">
        </div>
        <div class="form-group">
            <label for="beContent">내용</label>
            <input type="text" class="form-control" id="beContent" placeholder="내용" name="beContent" value="${bookEvent11VO.beContent}">
        </div>
        <div class="form-group">
            <label for="beFreeGift">사은품</label>
             <input type="text" class="form-control" id="beFreeGift" placeholder="사은품" name="beFreeGift" value="${bookEvent11VO.beFreeGift}">
        </div>
        <div class="form-group">
            <label for="beDate">등록일</label>
             <input type="text" class="form-control" id="beDate" placeholder="등록일" name="beDate" value="${bookEvent11VO.beDate}">
        </div>
        
        <c:if test="${bookEvent11VO.beIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${bookEvent11VO.beIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
