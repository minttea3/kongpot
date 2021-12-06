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


<h3>원데이클래스 - 플라워 클래스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassFlowerFormSave" method="post">
        
       <c:if test="${onedayClassFlower52VO.ocfIdx ne null}">  <input type="hidden" class="form-control" id="ocfIdx" placeholder="작성번호" name="ocfIdx" value="${onedayClassFlower52VO.ocfIdx}"></c:if>
        <div class="form-group">
            <label for="ocfStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ocfStoreName" placeholder="상호명" name="ocfStoreName" value="${onedayClassFlower52VO.ocfStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ocfLoc">위치</label>
            <input type="text" class="form-control" id="ocfLoc" placeholder="위치" name="ocfLoc" value="${onedayClassFlower52VO.ocfLoc}">
        </div>
        <div class="form-group">
            <label for="ocfClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ocfClassInfo" placeholder="클래스 소개" name="ocfClassInfo"  value="${onedayClassFlower52VO.ocfClassInfo}">
        </div>
        <div class="form-group">
            <label for="ocfDetail">상세 정보</label>
            <input type="text" class="form-control" id="ocfDetail" placeholder="상세 정보" name="ocfDetail" value="${onedayClassFlower52VO.ocfDetail}">
        </div>
        <div class="form-group">
            <label for="ocfPrice">금액</label>

            <input type="text" class="form-control" id="ocfPrice" placeholder="금액" name="ocfPrice" value="${onedayClassFlower52VO.ocfPrice}">
        </div>
        <div class="form-group">
            <label for="ocfClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ocfClassStatus" placeholder="수업 진행 여부" name="ocfClassStatus" value="${onedayClassFlower52VO.ocfClassStatus}"> --%>
        	<input type="checkbox" name="ocfClassStatus" value="Y" <c:if test="${onedayClassFlower52VO.ocfClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassFlower52VO.ocfIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassFlower52VO.ocfIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
