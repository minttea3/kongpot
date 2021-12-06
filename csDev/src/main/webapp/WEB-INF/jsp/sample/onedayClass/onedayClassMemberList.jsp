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

<h3>원데이클리스 - 회원 리스트</h3>

<br />

<form:form action="/onedayClassMemberList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ocmId">아이디</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">아이디</div>
                </div>
                <input type="text" class="form-control" id="ocmId" placeholder="아이디" name="ocmId" value="${onedayClassMember50VO.ocmId}">
            </div>
        </div>
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="ocmGender">성별</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">성별</div>
                </div>
                <input type="text" class="form-control" id="ocmGender" placeholder="성별" name="ocmGender" value="${onedayClassMember50VO.ocmGender}">
            </div>
        </div>
        <div class="col-auto">
            <button name="action" class="btn btn-info" type="submit">조회</button>
            <button id="updateBt" class="btn btn-success" type="button">수정</button>
        </div>
    </div></div>
</form:form>
<br /><br />
<form:form name="frm" id="frm" action="onedayClassMemberUpdate" method="post">

    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
       <!--      <th scope="col">고유번호</th> -->
            <th scope="col">아이디</th>
            <th scope="col">비밀번호</th>
            <th scope="col">비밀번호 질문</th>
            <th scope="col">비밀번호 답변</th>
            <th scope="col">성별</th>
            <th scope="col">개인정보 동의</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${onedayClassMemberList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                   <input type="hidden" name="onedayClassMemberVO[${status.count }].ocmIdx" value="${map.ocmIdx}">
                    <td> <input type="text" name="onedayClassMemberVO[${status.count }].ocmId" value="${map.ocmId}"></td>
                    <td><input type="text" name="onedayClassMemberVO[${status.count }].ocmPw" value="${map.ocmPw}"></td>
                    <td>
                    	   <select name="onedayClassMemberVO[${status.count }].ocmPwQuestion" class="form-control"  value="${map.ocmPwQuestion}">
				            	<option value="기억에 남는 추억의 장소는?"<c:if test="${map.ocmPwQuestion eq '기억에 남는 추억의 장소는?'}"> selected="selected"</c:if>>기억에 남는 추억의 장소는?	</option>
				            	<option value="인생 깊게 읽은 책 이름은?"<c:if test="${map.ocmPwQuestion eq '인생 깊게 읽은 책 이름은?'}"> selected="selected"</c:if>>인생 깊게 읽은 책 이름은?</option>
				            	<option value="자신의 인생 좌우명은?"<c:if test="${map.ocmPwQuestion eq '자신의 인생 좌우명은?'}"> selected="selected"</c:if>>자신의 인생 좌우명은?</option>
				            	<option value="받았던 선물 중 기억에 남는 독특한 선물은?"<c:if test="${map.ocmPwQuestion eq '받았던 선물 중 기억에 남는 독특한 선물은?'}"> selected="selected"</c:if>>받았던 선물 중 기억에 남는 독특한 선물은?</option>
				            </select>
                    </td>
                   <%--  <td><a href="<c:url value='/syncOnedayClassInfoForm?ocmId=${map.ocmId}' />">${map.ocmGender}</a></td> --%>
                    <td><input type="text" name="onedayClassMemberVO[${status.count }].ocmPwAnswer" value="${map.ocmPwAnswer}"></td>
                    <td><%-- <input type="text" name="onedayClassMemberVO[${status.count }].ocmPw" value="${map.ocmGender}"> --%>
                    	
                    	<input type="radio" name="onedayClassMemberVO[${status.count }].ocmGender" id="ocmGender${status.count }1" value="M" <c:if test="${map.ocmGender eq 'M'}"> checked="checked"</c:if> >
			        	<label for="ocmGender${status.count }1"  >남자</label> &nbsp;&nbsp;
			        	<input type="radio" name="onedayClassMemberVO[${status.count }].ocmGender" id="ocmGender${status.count }2" value="W" <c:if test="${map.ocmGender eq 'W'}"> checked="checked"</c:if>>
			        	<label for="ocmGender${status.count }2" >여자</label>
                    </td>
                    <td><input type="checkbox" name="onedayClassMemberVO[${status.count }].ocmTermsinfoYn" value="Y" <c:if test="${map.ocmTermsinfoYn eq 'Y'}"> checked="checked"</c:if> >
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </form:form>
</body>
<script>

$(document).ready(function(){
	// 수정 버튼 눌렀을 떄
	$('#updateBt').click(function(){
		//alert("안녕");
		$('#frm').submit();
	});
});
</script>
</html>
