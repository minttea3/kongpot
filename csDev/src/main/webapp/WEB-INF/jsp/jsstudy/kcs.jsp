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

<h3>JavaScript | jQuery</h3>
<br />
<div class="container">
    <div class="row align-items-start">
        <div class="col">
            <div class="form-group">
                <label for="input01">Input01</label>
                <input type="text" class="form-control" id="input01" name="input01" />
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="input02">Input02</label>
                <input type="text" class="form-control" id="input02" name="input02" />
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="input03">Input03</label>
                <input type="text" class="form-control" id="input03" name="input03" />
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <div class="form-group">
                <label for="selSports">SelectBox</label>
                <select class="form-control" id="selSports" name="selSports">
                    <option value="">전체</option>
                    <option value="baseball">야구</option>
                    <option value="basketball">농구</option>
                    <option value="soccer">축구</option>
                    <option value="tennis">테니스</option>
                </select>
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="">Radio</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="baseball" name="rdoSports" id="rdoBaseball">
                    <label class="form-check-label" for="rdoBaseball">
                        야구
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="basketball" name="rdoSports" id="rdoBasketball">
                    <label class="form-check-label" for="rdoBasketball">
                        농구
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="soccer" name="rdoSports" id="rdoSoccer">
                    <label class="form-check-label" for="rdoSoccer">
                        축구
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="tennis" name="rdoSports" id="rdoTennis">
                    <label class="form-check-label" for="rdoTennis">
                        테니스
                    </label>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="">Check</label>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="baseball" name="chkSports" id="chkBaseball">
	                <label class="form-check-label" for="chkBaseball">
	                    야구
	                </label>
	            </div>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="basketball" name="chkSports" id="chkBasketball">
	                <label class="form-check-label" for="chkBasketball">
	                    농구
	                </label>
	            </div>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="soccer" name="chkSports" id="chkSoccer">
	                <label class="form-check-label" for="chkSoccer">
	                    축구
	                </label>
	            </div>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="tennis" name="chkSports" id="chkTennis">
	                <label class="form-check-label" for="chkTennis">
	                    테니스
	                </label>
	            </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <button name="btnInsert" id="btnInsert" class="btn btn-info">Input</button>
        </div>
        <div class="col">
            <button name="btnUpdate" id="btnUpdate"  class="btn btn-success">Select&Radio</button>
        </div>
        <div class="col">
            <button name="btnDelete" id="btnDelete"  class="btn btn-danger">Check</button>
        </div>
    </div>
</div>

<br />
<hr />
    <h5>요기에 뿌리기</h5>
<div class="container">
    <div class="row align-items-start">
        <div class="col">
            <div class="form-group">
                <label for="resultInput01">Input01</label>
                <input type="text" class="form-control" id="resultInput01"/>
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="resultInput02">Input02</label>
                <input type="text" class="form-control" id="resultInput02"/>
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="resultInput03">Input03</label>
                <input type="text" class="form-control" id="resultInput03"/>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <div class="form-group">
                <label for="selSports">SelectBox</label>
                <select class="form-control" id="resultSelSports" name="resultSelSports">
                    <option value="">전체</option>
                    <option value="baseball">야구</option>
                    <option value="basketball">농구</option>
                    <option value="soccer">축구</option>
                    <option value="tennis">테니스</option>
                </select>
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="">Radio</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="baseball" name="resultRdoSports" id="resultRdoBaseball">
                    <label class="form-check-label" for="resultRdoBaseball">
                        야구
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="basketball" name="resultRdoSports" id="resultRdoBasketball">
                    <label class="form-check-label" for="resultRdoBasketball">
                        농구
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="soccer" name="resultRdoSports" id="resultRdoSoccer">
                    <label class="form-check-label" for="resultRdoSoccer">
                        축구
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="tennis" name="resultRdoSports" id="resultRdoTennis">
                    <label class="form-check-label" for="resultRdoTennis">
                        테니스
                    </label>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="form-group">
                <label for="">Check</label>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="baseball" name="resultChkSports" id="resultChkBaseball">
	                <label class="form-check-label" for="resultChkBaseball">
	                    야구
	                </label>
	            </div>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="basketball" name="resultChkSports" id="resultChkBasketball">
	                <label class="form-check-label" for="resultChkBasketball">
	                    농구
	                </label>
	            </div>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="soccer" name="resultChkSports" id="resultChkSoccer">
	                <label class="form-check-label" for="resultChkSoccer">
	                    축구
	                </label>
	            </div>
	            <div class="form-check">
	                <input class="form-check-input" type="checkbox" value="tennis" name="resultChkSports" id="resultChkTennis">
	                <label class="form-check-label" for="resultChkTennis">
	                    테니스
	                </label>
	            </div>
            </div>
        </div>
    </div>
</div>
</body>

<script>

    $(document).ready(function(){

        $('#btnInsert').click(function (){
        	getInputData();
        });

        $('#btnUpdate').click(function (){
        	getSelectData();
        });

        $('#btnDelete').click(function (){
        	getCheckData();
        });
    });
    
    function getInputData(){
    	// 1. 위 Input01 값을 가져온다.
    	var upInput01 = $('#input01').val();
    	// 2. 아래 Input01 값을 뿌린다.
    	$('#resultInput01').val( upInput01 );

        // 1. 위 Input02 값을 가져온다.
    	// 2. 아래 Input02 값을 뿌린다.

        // 1. 위 Input03 값을 가져온다.
    	// 2. 아래 Input03 값을 뿌린다.
    }

    function getSelectData(){
    	// 1. 위 Select Box 의 "선택 된" 데이터를 Value 가져온다.
    	var upSelectBoxVal = $('#selSports').val();
    	// 1. 위 Select Box 의 "선택 된" 데이터를 Text 가져온다.
    	var upSelectBoxText = $("#selSports option:selected").text();

        // 2. 아래 Select Box 값을 선택한다.


    	// 1. 위 Radio의 "선택 된" 데이터를 Value 가져온다.
    	var upRdoVal = $('input[name=rdoSports]:checked').val();
    	// 2. 아래 Radio의 값을 선택한다.
    }
    
    function getCheckData(){
    	// 1. 위 체크박스에 "선택 된 모든" 데이터를 가져온다
    	var chkVals = '';
    	$('input[name=chkSports]:checked').each(function(){
    		chkVals += $(this).val() + ' / ';
    	});
    	// alert에 보여준다( ' / ' 구분으로 )
   		// alert( chkVals );

        // 2. 아래 체크박스에 선택 된 모든 데이터를 체크한다.
    }

</script>
</html>
