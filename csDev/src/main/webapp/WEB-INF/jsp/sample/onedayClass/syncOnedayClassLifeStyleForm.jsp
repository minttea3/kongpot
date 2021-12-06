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


<h3>원데이클래스 - 라이프스타일 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassLifeStyleFormSave" method="post">
        
       <c:if test="${onedayClassLifeStyle58VO.oclsIdx ne null}">  <input type="hidden" class="form-control" id="oclsIdx" placeholder="작성번호" name="oclsIdx" value="${onedayClassLifeStyle58VO.oclsIdx}"></c:if>
        <div class="form-group">
            <label for="oclsStoreName">상호명</label><br>
            <input type="text" class="form-control" id="oclsStoreName" placeholder="상호명" name="oclsStoreName" value="${onedayClassLifeStyle58VO.oclsStoreName}"/>
        </div>
        <div class="form-group">
            <label for="oclsLoc">위치</label>
            <input type="text" class="form-control" id="oclsLoc" placeholder="위치" name="oclsLoc" value="${onedayClassLifeStyle58VO.oclsLoc}">
        </div>
        <div class="form-group">
            <label for="oclsClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="oclsClassInfo" placeholder="클래스 소개" name="oclsClassInfo"  value="${onedayClassLifeStyle58VO.oclsClassInfo}">
        </div>
        <div class="form-group">
            <label for="oclsDetail">상세 정보</label>
            <input type="text" class="form-control" id="oclsDetail" placeholder="상세 정보" name="oclsDetail" value="${onedayClassLifeStyle58VO.oclsDetail}">
        </div>
        <div class="form-group">
            <label for="oclsPrice">금액</label>

            <input type="text" class="form-control" id="oclsPrice" placeholder="금액" name="oclsPrice" value="${onedayClassLifeStyle58VO.oclsPrice}">
        </div>
        <div class="form-group">
            <label for="oclsClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="oclsClassStatus" placeholder="수업 진행 여부" name="oclsClassStatus" value="${onedayClassLifeStyle58VO.oclsClassStatus}"> --%>
        	<input type="checkbox" name="oclsClassStatus" value="Y" <c:if test="${onedayClassLifeStyle58VO.oclsClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassLifeStyle58VO.oclsIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassLifeStyle58VO.oclsIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
