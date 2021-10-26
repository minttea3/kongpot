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


<h3>물고기 수족관 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishStoreInfoFormSave" method="post">
        <div class="form-group">
            <label for="asiIdx">작성번호</label>
            <input type="text" class="form-control" id="asiIdx" placeholder="작성번호" name="asiIdx" value="${aquariumfishStoreInfo42VO.asiIdx}" <c:if test="${aquariumfishStoreInfo42VO.asiIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="asiStoreName">상호명</label><br>
            <input type="text" class="form-control" id="asiStoreName" placeholder="상호명" name="asiStoreName" value="${aquariumfishStoreInfo42VO.asiStoreName}" />
        	
        </div>
        <div class="form-group">
            <label for="asiLoc">위치</label>
            <input type="text" class="form-control" id="asiLoc" placeholder="위치" name="asiLoc" value="${aquariumfishStoreInfo42VO.asiLoc}">
        </div>
        <div class="form-group">
            <label for="asiTel">연락처</label>
            <input type="text" class="form-control" id="asiTel" placeholder="연락처" name="asiTel" value="${aquariumfishStoreInfo42VO.asiTel}">
        </div>
        <div class="form-group">
            <label for="asiStatus">운영 여부</label><br>
            &nbsp;&nbsp;&nbsp;<input type="checkbox"  id="asiStatus" name="asiStatus" value="Y" <c:if test="${aquariumfishStoreInfo42VO.asiStatus eq 'Y'}">checked="checked"</c:if>>
        </div>
        <c:if test="${aquariumfishStoreInfo42VO.asiIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishStoreInfo42VO.asiIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
