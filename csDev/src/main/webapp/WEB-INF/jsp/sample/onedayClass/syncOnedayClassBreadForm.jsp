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


<h3>원데이클래스 - 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassBreadFormSave" method="post">
        
       <c:if test="${onedayClassBread51VO.ocbIdx ne null}">  <input type="hidden" class="form-control" id="ocbIdx" placeholder="작성번호" name="ocbIdx" value="${onedayClassBread51VO.ocbIdx}"></c:if>
        <div class="form-group">
            <label for="ocbStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ocbStoreName" placeholder="상호명" name="ocbStoreName" value="${onedayClassBread51VO.ocbStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ocbLoc">위치</label>
            <input type="text" class="form-control" id="ocbLoc" placeholder="위치" name="ocbLoc" value="${onedayClassBread51VO.ocbLoc}">
        </div>
        <div class="form-group">
            <label for="ocbClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ocbClassInfo" placeholder="클래스 소개" name="ocbClassInfo"  value="${onedayClassBread51VO.ocbClassInfo}">
        </div>
        <div class="form-group">
            <label for="ocbDetail">상세 정보</label>
            <input type="text" class="form-control" id="ocbDetail" placeholder="상세 정보" name="ocbDetail" value="${onedayClassBread51VO.ocbDetail}">
        </div>
        <div class="form-group">
            <label for="ocbPrice">금액</label>

            <input type="text" class="form-control" id="ocbPrice" placeholder="금액" name="ocbPrice" value="${onedayClassBread51VO.ocbPrice}">
        </div>
        <div class="form-group">
            <label for="ocbClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ocbClassStatus" placeholder="수업 진행 여부" name="ocbClassStatus" value="${onedayClassBread51VO.ocbClassStatus}"> --%>
        	<input type="checkbox" name="ocbClassStatus" value="Y" <c:if test="${onedayClassBread51VO.ocbClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassBread51VO.ocbIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassBread51VO.ocbIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
