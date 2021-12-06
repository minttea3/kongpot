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


<h3>원데이클래스 - 수공예 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassHandcraftFormSave" method="post">
        
       <c:if test="${onedayClassHandcraft59VO.ochIdx ne null}">  <input type="hidden" class="form-control" id="ochIdx" placeholder="작성번호" name="ochIdx" value="${onedayClassHandcraft59VO.ochIdx}"></c:if>
        <div class="form-group">
            <label for="ochStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ochStoreName" placeholder="상호명" name="ochStoreName" value="${onedayClassHandcraft59VO.ochStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ochLoc">위치</label>
            <input type="text" class="form-control" id="ochLoc" placeholder="위치" name="ochLoc" value="${onedayClassHandcraft59VO.ochLoc}">
        </div>
        <div class="form-group">
            <label for="ochClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ochClassInfo" placeholder="클래스 소개" name="ochClassInfo"  value="${onedayClassHandcraft59VO.ochClassInfo}">
        </div>
        <div class="form-group">
            <label for="ochDetail">상세 정보</label>
            <input type="text" class="form-control" id="ochDetail" placeholder="상세 정보" name="ochDetail" value="${onedayClassHandcraft59VO.ochDetail}">
        </div>
        <div class="form-group">
            <label for="ochPrice">금액</label>

            <input type="text" class="form-control" id="ochPrice" placeholder="금액" name="ochPrice" value="${onedayClassHandcraft59VO.ochPrice}">
        </div>
        <div class="form-group">
            <label for="ochClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ochClassStatus" placeholder="수업 진행 여부" name="ochClassStatus" value="${onedayClassHandcraft59VO.ochClassStatus}"> --%>
        	<input type="checkbox" name="ochClassStatus" value="Y" <c:if test="${onedayClassHandcraft59VO.ochClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassHandcraft59VO.ochIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassHandcraft59VO.ochIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
