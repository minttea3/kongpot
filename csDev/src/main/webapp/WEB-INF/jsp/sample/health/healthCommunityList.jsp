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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>건강 커뮤니티 리스트</h3>

<br />

<form:form action="/healthCommunityList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="hcIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="hcIdx" placeholder="고유번호" name="hcIdx" value="${healthCommunity27VO.hcIdx}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="hcName">글쓴이</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">글쓴이</div>
                </div>
                <input type="text" class="form-control" id="hcName" placeholder="글쓴이" name="hcName" value="${healthCommunity27VO.hcName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="hcTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="hcTitle" placeholder="제목" name="hcTitle" value="${healthCommunity27VO.hcTitle}">
            </div>
        </div>
        <div class="col-auto">
            <button name="action" class="btn btn-info" type="submit">조회</button>
        </div>
    </div>
</form:form>
<br /><br />
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">작성번호</th>
            <th scope="col">글쓴이</th>
            <th scope="col">제목</th>
            <th scope="col">내용</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${healthCommunityList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.hcIdx}</td>
                    <td>${map.hcName}</td>
                    <td><a href="<c:url value='/syncHealthCommunityForm?hcIdx=${map.hcIdx}' />">${map.hcTitle}</a></td>
                    <td>${map.hcContent}</td>
                </tr>
                <c:forEach var="map2" items="${healthCommunityCommentList}">
                	<c:if test="${map2.hcIdx eq map.hcIdx}">
                	<tr>
                		<td>ㄴ></td>
                		<td>${map2.hccIdx}</td>
                		<td>${map2.hccName}</td>
                		<td></td>
                		<td>${map2.hccContent}</td>
                	</tr>
                	</c:if>
                </c:forEach>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
