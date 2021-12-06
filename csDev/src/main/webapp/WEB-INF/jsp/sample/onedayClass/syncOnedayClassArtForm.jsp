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


<h3>원데이클래스 - 미술 클래스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassArtFormSave" method="post">
        
       <c:if test="${onedayClassArt53VO.ocaIdx ne null}">  <input type="hidden" class="form-control" id="ocaIdx" placeholder="작성번호" name="ocaIdx" value="${onedayClassArt53VO.ocaIdx}"></c:if>
        <div class="form-group">
            <label for="ocaStoreName">상호명</label><br>
            <input type="text" class="form-control" id="ocaStoreName" placeholder="상호명" name="ocaStoreName" value="${onedayClassArt53VO.ocaStoreName}"/>
        </div>
        <div class="form-group">
            <label for="ocaLoc">위치</label>
            <input type="text" class="form-control" id="ocaLoc" placeholder="위치" name="ocaLoc" value="${onedayClassArt53VO.ocaLoc}">
        </div>
        <div class="form-group">
            <label for="ocaClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="ocaClassInfo" placeholder="클래스 소개" name="ocaClassInfo"  value="${onedayClassArt53VO.ocaClassInfo}">
        </div>
        <div class="form-group">
            <label for="ocaDetail">상세 정보</label>
            <input type="text" class="form-control" id="ocaDetail" placeholder="상세 정보" name="ocaDetail" value="${onedayClassArt53VO.ocaDetail}">
        </div>
        <div class="form-group">
            <label for="ocaPrice">금액</label>

            <input type="text" class="form-control" id="ocaPrice" placeholder="금액" name="ocaPrice" value="${onedayClassArt53VO.ocaPrice}">
        </div>
        <div class="form-group">
            <label for="ocaClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="ocaClassStatus" placeholder="수업 진행 여부" name="ocaClassStatus" value="${onedayClassArt53VO.ocaClassStatus}"> --%>
        	<input type="checkbox" name="ocaClassStatus" value="Y" <c:if test="${onedayClassArt53VO.ocaClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${onedayClassArt53VO.ocaIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${onedayClassArt53VO.ocaIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
