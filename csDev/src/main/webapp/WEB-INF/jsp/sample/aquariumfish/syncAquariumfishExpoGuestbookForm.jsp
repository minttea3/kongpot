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


<h3>물고기 박람회 방명록 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishExpoGuestbookFormSave" method="post">
        <div class="form-group">
            <label for="aebIdx">작성번호</label>
            <input type="text" class="form-control" id="aebIdx" placeholder="작성번호" name="aebIdx" value="${aquariumfishExpoGuestbook40VO.aebIdx}" <c:if test="${aquariumfishExpoGuestbook40VO.aebIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="aebExpoName">박람회 이름</label><br>
            <input type="text" class="form-control" id="aebExpoName" placeholder="박람회 이름" name="aebExpoName" value="${aquariumfishExpoGuestbook40VO.aebExpoName}"/>
        </div>
        <div class="form-group">
            <label for="aebWriter">작성자 이름</label>
            <input type="text" class="form-control" id="aebWriter" placeholder="작성자 이름" name="aebWriter" value="${aquariumfishExpoGuestbook40VO.aebWriter}">
        </div>
        <div class="form-group">
            <label for="aebFeeling">후기</label>
            <input type="text" class="form-control" id="aebFeeling" placeholder="후기" name="aebFeeling" value="${aquariumfishExpoGuestbook40VO.aebFeeling}">
        </div>
        <div class="form-group">
            <label for="aebCount">별점</label><br>
        	<input type="radio" id="aebCount5" name="aebCount" value="5"<c:if test="${aquariumfishExpoGuestbook40VO.aebCount eq 5}"> checked="checked"</c:if>>
        	<label for="aebCount5" >⭐⭐⭐⭐⭐</label>
        	<input type="radio" id="aebCount4" name="aebCount" value="4" <c:if test="${aquariumfishExpoGuestbook40VO.aebCount eq 4}"> checked="checked"</c:if>>
        	<label for="aebCount4">⭐⭐⭐⭐</label>
        	<input type="radio" id="aebCount3" name="aebCount" value="3"<c:if test="${aquariumfishExpoGuestbook40VO.aebCount eq 3}"> checked="checked"</c:if>>
        	<label for="aebCoun3t" >⭐⭐⭐</label>
        	<input type="radio" id="aebCount2" name="aebCount"  value="2"<c:if test="${aquariumfishExpoGuestbook40VO.aebCount eq 2}"> checked="checked"</c:if>>
        	<label for="aebCount2">⭐⭐</label>
        	<input type="radio" id="aebCount1" name="aebCount" value="1"<c:if test="${aquariumfishExpoGuestbook40VO.aebCount eq 1}"> checked="checked"</c:if>>
        	<label for="aebCount1" >⭐</label>
        </div>
        <c:if test="${aquariumfishExpoGuestbook40VO.aebIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishExpoGuestbook40VO.aebIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
