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


<h3>식물 - 뉴스 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsNewsFormSave" method="post">
        <div class="form-group">
            <label for="pnIdx">작성번호</label>
            <input type="text" class="form-control" id="pnIdx" placeholder="작성번호" name="pnIdx" value="${plantsNews34VO.pnIdx}" <c:if test="${plantsNews34VO.pnIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="pnType">타입</label>
        	<select class="form-control"  id="pnType"  name="pnType">
        		<option value="다육이" <c:if test="${plantsNews34VO.pnType eq '다육이'}">selected="selected"</c:if>>다육이</option>
        		<option value="꽃" <c:if test="${plantsNews34VO.pnType eq '꽃'}">selected="selected"</c:if>>꽃</option>
        		<option value="야채" <c:if test="${plantsNews34VO.pnType eq '야채'}">selected="selected"</c:if>>야채</option>
        		<optio value="나무" <c:if test="${plantsNews34VO.pnType eq '나무'}">selected="selected"</c:if>>나무</option>
        		<option value="식물" <c:if test="${plantsNews34VO.pnType eq '식물'}">selected="selected"</c:if>>식물</option>
        	</select>
        </div>
        <div class="form-group">
            <label for="pnTitle">제목</label>
            <input type="text" class="form-control" id="pnTitle" placeholder="제목" name="pnTitle" value="${plantsNews34VO.pnTitle}">
        </div>
        <div class="form-group">
            <label for="pnContent">내용</label>
            <input type="text" class="form-control" id="pnContent" placeholder="내용" name="pnContent" value="${plantsNews34VO.pnContent}">
        </div>
        <div class="form-group">
            <label for="pnDay">작성일자</label>
            <input type="date" class="form-control" id="pnDay" placeholder="작성일자" name="pnDay" value="${plantsNews34VO.pnDay}">
        </div>
        <c:if test="${plantsNews34VO.pnIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsNews34VO.pnIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
