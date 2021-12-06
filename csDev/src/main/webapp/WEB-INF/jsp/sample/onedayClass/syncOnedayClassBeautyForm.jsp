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


<h3>원데이클래스 - 뷰티 클래스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassBeautyFormSave" method="post">
        
       <c:if test="${onedayClassBeauty54VO.ocbeIdx ne null}">  <input type="hidden" class="form-control" id="ocbeIdx" placeholder="작성번호" name="ocbeIdx" value="${onedayClassBeauty54VO.ocbeIdx}"></c:if>
        <div class="form-group">
            <label for="ocbeStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ocbeStoreName" placeholder="상호명" name="ocbeStoreName" value="${onedayClassBeauty54VO.ocbeStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ocbeLoc">위치</label>
            <input type="text" class="form-control" id="ocbeLoc" placeholder="위치" name="ocbeLoc" value="${onedayClassBeauty54VO.ocbeLoc}">
        </div>
        <div class="form-group">
            <label for="ocbeClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ocbeClassInfo" placeholder="클래스 소개" name="ocbeClassInfo"  value="${onedayClassBeauty54VO.ocbeClassInfo}">
        </div>
        <div class="form-group">
            <label for="ocbeDetail">상세 정보</label>
            <input type="text" class="form-control" id="ocbeDetail" placeholder="상세 정보" name="ocbeDetail" value="${onedayClassBeauty54VO.ocbeDetail}">
        </div>
        <div class="form-group">
            <label for="ocbePrice">금액</label>

            <input type="text" class="form-control" id="ocbePrice" placeholder="금액" name="ocbePrice" value="${onedayClassBeauty54VO.ocbePrice}">
        </div>
        <div class="form-group">
            <label for="ocbeClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ocbeClassStatus" placeholder="수업 진행 여부" name="ocbeClassStatus" value="${onedayClassBeauty54VO.ocbeClassStatus}"> --%>
        	<input type="checkbox" name="ocbeClassStatus" value="Y" <c:if test="${onedayClassBeauty54VO.ocbeClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassBeauty54VO.ocbeIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassBeauty54VO.ocbeIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
