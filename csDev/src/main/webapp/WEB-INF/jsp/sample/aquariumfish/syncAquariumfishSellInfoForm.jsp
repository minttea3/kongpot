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


<h3>물고기 판매 정보 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncAquariumfishSellInfoFormSave" method="post">
        <div class="form-group">
            <label for="asiiIdx">작성번호</label>
            <input type="text" class="form-control" id="asiiIdx" placeholder="작성번호" name="asiiIdx" value="${aquariumfishSellInfo43VO.asiiIdx}" <c:if test="${aquariumfishSellInfo43VO.asiiIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="asiiStoreName">상호명</label><br>
            <input type="text" class="form-control" id="asiiStoreName" placeholder="상호명" name="asiiStoreName" value="${aquariumfishSellInfo43VO.asiiStoreName}"/>
        </div>
        <div class="form-group">
            <label for="asiiProduct">판매 물품</label>
            <input type="text" class="form-control" id="asiiProduct" placeholder="판매 물품" name="asiiProduct" value="${aquariumfishSellInfo43VO.asiiProduct}">
        </div>
        <div class="form-group">
            <label for="asiiPrice">가격</label>
            <input type="text" class="form-control" id="asiiPrice" placeholder="가격" name="asiiPrice" value="${aquariumfishSellInfo43VO.asiiPrice}">
        </div>
        <div class="form-group">
            <label for="asiiDate">작성일자</label>
            <input type="date" class="form-control" id="asiiDate" placeholder="작성일자" name="asiiDate" value="${aquariumfishSellInfo43VO.asiiDate}">
        </div>
        <c:if test="${aquariumfishSellInfo43VO.asiiIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${aquariumfishSellInfo43VO.asiiIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>
