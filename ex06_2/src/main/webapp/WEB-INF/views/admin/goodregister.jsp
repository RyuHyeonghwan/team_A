<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page import="java.util.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
</head>
<body>

<%@include file="../includes/header2.jsp"%>
	<div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>상품등록페이지</span></div>
    </div>
    
      <div class="admin_content_main">
                    	<form action="/admin/goodregister" method="post" id="enrollForm">
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 이름</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="goodName">
                    			</div>
                    		</div>                            
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 카테고리</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="cateCode">
                    			</div>
                    		</div>          
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 가격</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="goodPrice" value="0">
                    			</div>
                    		</div>               
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 재고</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="goodStock" value="0">
                    			</div>
                    		</div>          
                    		      		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 소개</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="bookIntro">
                    			</div>
                    		</div>
                    		<input type="hidden" name="${_csrf.parameterName}" value="${_crsf.token}" />       		
                   		</form>
                   			<div class="btn_section">
                   				<button id="cancelBtn" class="btn">취 소</button>
	                    		<button id="enrollBtn" class="btn enroll_btn">등 록</button>
	                    		
	                    	</div> 
	                    	
                    </div>
                       


<%@include file="../includes/footer.jsp"%>

<script>

	let enrollForm = $("#enrollForm")
	
/* 취소 버튼 */
$("#cancelBtn").click(function(){
	
	location.href="/admin/goodregister"
	
});

/* 상품 등록 버튼 */
$("#enrollBtn").on("click",function(e){
	
	e.preventDefault();
	
	enrollForm.submit();
	
});
</script>
</body>
</html>