<%--
  Created by eclipseIDE
  User: kong
  Date: 2021. 9. 23.
  Time: 오후 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>회원 목록 리스트</h3>
<br />

<form:form action="/memberList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="mIdx"></label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">회원번호</div>
                </div>
                <input type="text" class="form-control" id="mIdx" placeholder="회원번호" name="mIdx" value="${member1VO.mIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="mName">회원명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">회원명</div>
                </div>
                <input type="text" class="form-control" id="mName" placeholder="회원명" name="mName" value="${member1VO.mName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="mRegistration">등록일</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">등록일</div>
                </div>
                <input type="text" class="form-control" id="mRegistration" placeholder="등록일자를 입력하세요." name="mRegistration" value="${member1VO.mRegistration}">
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
            <th scope="col">No.</th>
            <th scope="col">회원번호</th>
            <th scope="col">회원명</th>
            <th scope="col">성별</th>
            <th scope="col">연령대</th>
            <th scope="col">주소</th>
            <th scope="col">이메일</th>
            <th scope="col">등록일자</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${memberList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.mIdx}</td>
                    <td><a href="<c:url value='/syncMemberForm?mIdx=${map.mIdx}' />">${map.mName}</a></td>
                    <td>${map.mGender}</td>
                    <td>${map.mAge}</td>
                    <td>${map.mAddr}</td>
                    <td>${map.mEmail}</td>
                    <td>${map.mRegistration}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>
