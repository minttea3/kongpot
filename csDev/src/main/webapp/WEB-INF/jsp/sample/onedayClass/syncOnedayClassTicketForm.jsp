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


<h3>원데이클래스 - 티켓 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassTicketFormSave" method="post">
        
       <c:if test="${OnedayClassTicket56VO.octIdx ne null}">  <input type="hidden" class="form-control" id="octIdx" placeholder="작성번호" name="octIdx" value="${OnedayClassTicket56VO.octIdx}"></c:if>
        <div class="form-group">
            <label for="octStoreName">상호명</label><br>
            <input type="text" class="form-control" id="octStoreName" placeholder="상호명" name="octStoreName" value="${OnedayClassTicket56VO.octStoreName}"/>
        </div>
        <div class="form-group">
            <label for="octLoc">위치</label>
            <input type="text" class="form-control" id="octLoc" placeholder="위치" name="octLoc" value="${OnedayClassTicket56VO.octLoc}">
        </div>
        <div class="form-group">
            <label for="octClassInfo">클래스 소개</label>
            <input type="text" class="form-control" id="octClassInfo" placeholder="클래스 소개" name="octClassInfo"  value="${OnedayClassTicket56VO.octClassInfo}">
        </div>
        <div class="form-group">
            <label for="octDetail">상세 정보</label>
            <input type="text" class="form-control" id="octDetail" placeholder="상세 정보" name="octDetail" value="${OnedayClassTicket56VO.octDetail}">
        </div>
        <div class="form-group">
            <label for="octPrice">금액</label>

            <input type="text" class="form-control" id="octPrice" placeholder="금액" name="octPrice" value="${OnedayClassTicket56VO.octPrice}">
        </div>
        <div class="form-group">
            <label for="octClassStatus">수업 진행 여부</label>
          <%--   <input type="text" class="form-control" id="octClassStatus" placeholder="수업 진행 여부" name="octClassStatus" value="${OnedayClassTicket56VO.octClassStatus}"> --%>
        	<input type="checkbox" name="octClassStatus" value="Y" <c:if test="${OnedayClassTicket56VO.octClassStatus eq 'Y'}"> checked="checked"</c:if>>
        </div>
        <c:if test="${OnedayClassTicket56VO.octIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${OnedayClassTicket56VO.octIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
