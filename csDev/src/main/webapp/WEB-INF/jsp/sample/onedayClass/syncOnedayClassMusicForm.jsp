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


<h3>원데이클래스 - 음악 클래스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassMusicFormSave" method="post">
        
       <c:if test="${onedayClassMusic55VO.ocmIdx ne null}">  <input type="hidden" class="form-control" id="ocmIdx" placeholder="작성번호" name="ocmIdx" value="${onedayClassMusic55VO.ocmIdx}"></c:if>
        <div class="form-group">
            <label for="ocmStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ocmStoreName" placeholder="상호명" name="ocmStoreName" value="${onedayClassMusic55VO.ocmStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ocmLoc">위치</label>
            <input type="text" class="form-control" id="ocmLoc" placeholder="위치" name="ocmLoc" value="${onedayClassMusic55VO.ocmLoc}">
        </div>
        <div class="form-group">
            <label for="ocmClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ocmClassInfo" placeholder="클래스 소개" name="ocmClassInfo"  value="${onedayClassMusic55VO.ocmClassInfo}">
        </div>
        <div class="form-group">
            <label for="ocmDetail">상세 정보</label>
            <input type="text" class="form-control" id="ocmDetail" placeholder="상세 정보" name="ocmDetail" value="${onedayClassMusic55VO.ocmDetail}">
        </div>
        <div class="form-group">
            <label for="ocmPrice">금액</label>

            <input type="text" class="form-control" id="ocmPrice" placeholder="금액" name="ocmPrice" value="${onedayClassMusic55VO.ocmPrice}">
        </div>
        <div class="form-group">
            <label for="ocmClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ocmClassStatus" placeholder="수업 진행 여부" name="ocmClassStatus" value="${onedayClassMusic55VO.ocmClassStatus}"> --%>
        	<input type="checkbox" name="ocmClassStatus" value="Y" <c:if test="${onedayClassMusic55VO.ocmClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassMusic55VO.ocmIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassMusic55VO.ocmIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
