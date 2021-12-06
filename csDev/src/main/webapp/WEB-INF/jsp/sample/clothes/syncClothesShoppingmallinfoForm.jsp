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


<h3>의류 쇼핑몰 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncClothesShoppingmallinfoFormSave" method="post">
        
       <c:if test="${clothesShoppingmallinfo60VO.csiIdx ne null}">  <input type="hidden" class="form-control" id="csiIdx" placeholder="작성번호" name="csiIdx" value="${clothesShoppingmallinfo60VO.csiIdx}"></c:if>
        <div class="form-group">
            <label for="csiStoreName">쇼핑몰 이름</label><br>
            <input type="text" class="form-control" id="csiStoreName" placeholder="쇼핑몰 이름" name="csiStoreName" value="${clothesShoppingmallinfo60VO.csiStoreName}"/>
        </div>
        <div class="form-group">
            <label for="csiStyle">스타일</label>
            <input type="text" class="form-control" id="csiStyle" placeholder="스타일" name="csiStyle" value="${clothesShoppingmallinfo60VO.csiStyle}">
        </div>
        <div class="form-group">
            <label for="csiStoreStatus">매장 여부</label>
            <input type="text" class="form-control" id="csiStoreStatus" placeholder="매장 여부" name="csiStoreStatus"  value="${clothesShoppingmallinfo60VO.csiStoreStatus}">
        </div>
        <div class="form-group">
            <label for="csiCount">평점</label>
            <input type="text" class="form-control" id="csiCount" placeholder="평점" name="csiCount" value="${clothesShoppingmallinfo60VO.csiCount}">
        </div>
        <c:if test="${clothesShoppingmallinfo60VO.csiIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${clothesShoppingmallinfo60VO.csiIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
