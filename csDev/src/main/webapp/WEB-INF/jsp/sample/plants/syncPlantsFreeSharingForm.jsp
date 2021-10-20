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


<h3>식물 - 무료 나눔 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsFreeSharingFormSave" method="post">
        <div class="form-group">
            <label for="pfsIdx">작성번호</label>
            <input type="text" class="form-control" id="pfsIdx" placeholder="작성번호" name="pfsIdx" value="${plantsFreeSharing36VO.pfsIdx}" <c:if test="${plantsFreeSharing36VO.pfsIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="pfsType">식물 종류</label><br>
        	<input type="radio" name="pfsType" id="pfsType1" value="꽃" <c:if test="${plantsFreeSharing36VO.pfsType eq '꽃'}"> checked="checked"</c:if>>
     		<label for="pfsType1">꽃</label>
        	<input type="radio" name="pfsType" id="pfsType2" value="씨앗" <c:if test="${plantsFreeSharing36VO.pfsType eq '씨앗'}"> checked="checked"</c:if>>
     		<label for="pfsType2">씨앗</label>
        	<input type="radio" name="pfsType" id="pfsType3" value="다육이" <c:if test="${plantsFreeSharing36VO.pfsType eq '다육이'}"> checked="checked"</c:if>>
     		<label for="pfsType3">다육이</label>
        </div>
        <div class="form-group">
            <label for="pfsTitle">제목</label>
            <input type="text" class="form-control" id="pfsTitle" placeholder="제목" name="pfsTitle" value="${plantsFreeSharing36VO.pfsTitle}">
        </div>
        <div class="form-group">
            <label for="pfsContent">내용</label>
            <input type="text" class="form-control" id="pfsContent" placeholder="내용" name="pfsContent" value="${plantsFreeSharing36VO.pfsContent}">
        </div>
        <div class="form-group">
            <label for="pfsDay">작성일자</label>
            <input type="date" class="form-control" id="pfsDay" placeholder="작성일자" name="pfsDay" value="${plantsFreeSharing36VO.pfsDay}">
        </div>
        <c:if test="${plantsFreeSharing36VO.pfsIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsFreeSharing36VO.pfsIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
