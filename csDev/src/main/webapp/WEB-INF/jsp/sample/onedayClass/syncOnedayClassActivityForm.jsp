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


<h3>원데이클래스 - 액티비티 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassActivityFormSave" method="post">
        
       <c:if test="${onedayClassActivity57VO.ocacIdx ne null}">  <input type="hidden" class="form-control" id="ocacIdx" placeholder="작성번호" name="ocacIdx" value="${onedayClassActivity57VO.ocacIdx}"></c:if>
        <div class="form-group">
            <label for="ocacStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ocacStoreName" placeholder="상호명" name="ocacStoreName" value="${onedayClassActivity57VO.ocacStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ocacLoc">위치</label>
            <input type="text" class="form-control" id="ocacLoc" placeholder="위치" name="ocacLoc" value="${onedayClassActivity57VO.ocacLoc}">
        </div>
        <div class="form-group">
            <label for="ocacClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ocacClassInfo" placeholder="클래스 소개" name="ocacClassInfo"  value="${onedayClassActivity57VO.ocacClassInfo}">
        </div>
        <div class="form-group">
            <label for="ocacDetail">상세 정보</label>
            <input type="text" class="form-control" id="ocacDetail" placeholder="상세 정보" name="ocacDetail" value="${onedayClassActivity57VO.ocacDetail}">
        </div>
        <div class="form-group">
            <label for="ocacPrice">금액</label>

            <input type="text" class="form-control" id="ocacPrice" placeholder="금액" name="ocacPrice" value="${onedayClassActivity57VO.ocacPrice}">
        </div>
        <div class="form-group">
            <label for="ocacClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ocacClassStatus" placeholder="수업 진행 여부" name="ocacClassStatus" value="${onedayClassActivity57VO.ocacClassStatus}"> --%>
        	<input type="checkbox" name="ocacClassStatus" value="Y" <c:if test="${onedayClassActivity57VO.ocacClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassActivity57VO.ocacIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassActivity57VO.ocacIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
