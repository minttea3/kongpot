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


<h3>물고기 수초 레이아웃 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishWaterCandleLayoutFormSave" method="post">
        <div class="form-group">
            <label for="awclIdx">작성번호</label>
            <input type="text" class="form-control" id="awclIdx" placeholder="작성번호" name="awclIdx" value="${aquariumfishWaterCandleLayout38VO.awclIdx}" <c:if test="${aquariumfishWaterCandleLayout38VO.awclIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="awclActivities">활동 사항</label><br>
        	<input type="radio" name="awclActivities" id="awclActivities1" value="입문" <c:if test="${aquariumfishWaterCandleLayout38VO.awclActivities eq '입문'}">checked="checked" </c:if>>
        	<label for="awclActivities1">입문</label>
        	<input type="radio" name="awclActivities" id="awclActivities2" value="1년이상" <c:if test="${aquariumfishWaterCandleLayout38VO.awclActivities eq '1년이상'}">checked="checked" </c:if>>
        	<label for="awclActivities2">1년이상</label>
        	<input type="radio" name="awclActivities" id="awclActivities3" value="고수" <c:if test="${aquariumfishWaterCandleLayout38VO.awclActivities eq '고수'}">checked="checked" </c:if>>
        	<label for="awclActivities3">고수</label>
        </div>
        <div class="form-group">
            <label for="awclTitle">제목</label>
            <input type="text" class="form-control" id="awclTitle" placeholder="제목" name="awclTitle" value="${aquariumfishWaterCandleLayout38VO.awclTitle}">
        </div>
        <div class="form-group">
            <label for="awclContent">내용</label>
            <input type="text" class="form-control" id="awclContent" placeholder="내용" name="awclContent" value="${aquariumfishWaterCandleLayout38VO.awclContent}">
        </div>
        <div class="form-group">
            <label for="awclDay">작성일자</label>
            <input type="date" class="form-control" id="awclDay" placeholder="작성일자" name="awclDay" value="${aquariumfishWaterCandleLayout38VO.awclDay}">
        </div>
        <c:if test="${aquariumfishWaterCandleLayout38VO.awclIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishWaterCandleLayout38VO.awclIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
