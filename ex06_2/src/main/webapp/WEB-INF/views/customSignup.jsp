<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="includes/header.jsp"%>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>뭐지</title>

<!-- Bootstrap Core CSS -->
<link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/resources/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="/resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">
						<h3 class="panel-title">회원가입</h3>
					</div>
					<div class="panel-body">
						<form role="form" method='post' action="/customSignup">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="사용자 아이디" id="user_id" name="userid" type="text" autofocus="autofocus" required="required" >
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="비밀번호"
										name="userpw" id="userpw" type="password"  value="" required="required">
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="사용자 명" name="userName" id="user_name"  type="text" value="" required="required">
								</div>
								<!-- Change this to a button or input when using this as a form -->
								<a href="#" class="btn btn-lg btn-primary btn-block" id="sign-up-btn">회원가입하기</a>
							</fieldset>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
						</div>
					</div>
				</div>
			</div>
		</div>	

	<!-- jQuery -->
	<script src="/sbms/resources/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/sbms/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="/sbms/resources/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="/sbms/resources/dist/js/sb-admin-2.js"></script>
	
  <script>
  $("#sign-up-btn").on("click", function(e){
	  
		/* 폼 유효성 검사 */
		if($("#user_id").val() === ""){
			alert("아이디를 입력해주세요.");
			$("#user_id").focus();
			return;
		}else if($("#userpw").val() === ""){
			alert("패스워드를 입력해주세요.");
			$("#userpw").focus();
			return;
		}else if($("#user_name").val() === ""){
	  		alert("사용자 명을 입력해주세요.");
	  		$("#user_name").focus();
			return;
  		}
		
	  
	  
    e.preventDefault();
    $("form").submit();
    alert("회원가입을 축하드립니다.");
  });
  
  </script>

</body>

</html>