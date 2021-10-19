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
    <form:form id="frm" name="frm" action="/syncPlantsEventFormSave" method="post">
        <div class="form-group">
            <label for="peIdx">작성번호</label>
            <input type="text" class="form-control" id="peIdx" placeholder="작성번호" name="peIdx" value="${plantsEvent35VO.peIdx}" <c:if test="${plantsEvent35VO.peIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="peType">타입</label>
        	<select class="form-control"  id="peType"  name="peType">
        		<option value="월 행사" <c:if test="${plantsEvent35VO.peType eq '월 행사'}">selected="selected"</c:if>>월 행사</option>
        		<option value="기념일" <c:if test="${plantsEvent35VO.peType eq '기념일'}">selected="selected"</c:if>>기념일</option>
        	</select>
        </div>
        <div class="form-group">
            <label for="peTitle">제목</label>
            <input type="text" class="form-control" id="peTitle" placeholder="제목" name="peTitle" value="${plantsEvent35VO.peTitle}">
        </div>
        <div class="form-group">
            <label for="peContent">내용</label>
            <input type="text" class="form-control" id="peContent" placeholder="내용" name="peContent" value="${plantsEvent35VO.peContent}">
        </div>
        <div class="form-group">
            <label for="peDay">작성일자</label>
            <input type="date" class="form-control" id="peDay" placeholder="작성일자" name="peDay" value="${plantsEvent35VO.peDay}">
        </div>
        <c:if test="${plantsEvent35VO.peIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsEvent35VO.peIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
