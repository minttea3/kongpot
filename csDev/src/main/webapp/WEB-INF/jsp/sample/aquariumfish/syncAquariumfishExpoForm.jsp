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


<h3>물고기 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishExpoFormSave" method="post">
        <div class="form-group">
            <label for="aeIdx">작성번호</label>
            <input type="text" class="form-control" id="aeIdx" placeholder="작성번호" name="aeIdx" value="${aquariumfishExpo39VO.aeIdx}" <c:if test="${aquariumfishExpo39VO.aeIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="aeExpoName">박람회 이름</label><br>
            <input type="text" class="form-control" id="aeExpoName" placeholder="박람회 이름" name="aeExpoName" value="${aquariumfishExpo39VO.aeExpoName}"/>
        </div>
        <div class="form-group">
            <label for="aeTitle">제목</label>
            <input type="text" class="form-control" id="aeTitle" placeholder="제목" name="aeTitle" value="${aquariumfishExpo39VO.aeTitle}">
        </div>
        <div class="form-group">
            <label for="aeContent">내용</label>
            <input type="text" class="form-control" id="aeContent" placeholder="내용" name="aeContent" value="${aquariumfishExpo39VO.aeContent}">
        </div>
        <div class="form-group">
            <label for="aeStatus">개최여부</label>
       		<select class="form-control" id="aeStatus">
       			<option value="Y" <c:if test="${aquariumfishExpo39VO.aeStatus eq 'Y'}">selected="selected"</c:if>>Y</option>
       			<option value="N" <c:if test="${aquariumfishExpo39VO.aeStatus eq 'N'}">selected="selected"</c:if>>N</option>
       		</select>
        </div>
        <c:if test="${aquariumfishExpo39VO.aeIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishExpo39VO.aeIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
