<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
 src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="icon" href="data:;base64,iVBORw0KGgo=">
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="/resources/css/main.css" rel="stylesheet">
</head>

<script type="text/javascript">

	$(document).ready(function() {
		$("#idCheck").click(function(event) {
			event.preventDefault();
			var inputId = $("#inputId").val(); 
			
			$.ajax({
				
				type : 'post',
				url : '/user/idCheck',
				data : {
					userId : inputId
				},
				dataType : 'text',
				success : function(result) {
					
					if (result == 1) {
						var span = $("#idCheck").next();
						span.html("중복된 ID 입니다.");
						$("#inputId").focus();
					} else {
						var span = $("#idCheck").next();
						span.html("사용 가능한 ID 입니다.");
					}
				}
			});
			
		});
	});

</script>


<body>
	<div class="container text-right" id="gnb">
		<div>
			<a class="btn btn-primary" href="/user/loginPage">로그인</a>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<h1>회원 가입 화면</h1>
		</div>
		<div class="row">
			<form class="form-horizontal" action="/user/signUp" method="post">
				<div class="form-group">
					<label for="inputId" class="col-sm-2 control-label">ID</label>
					<div class="col-sm-10">
						<input class="form-control" id="inputId" placeholder="ID" name="userId">
						<button class="btn btn-default btn-sm" id="idCheck">ID 중복체크</button>
						<span></span>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="col-sm-2 control-label">Password</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputPassword" placeholder="Password" name="userpw">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword2" class="col-sm-2 control-label">Confirm Password</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputPassword2" placeholder="Password">
					</div>
				</div>				
				<div class="form-group">
					<label for="inputName" class="col-sm-2 control-label">Name</label>
					<div class="col-sm-10">
						<input class="form-control" id="inputName" placeholder="Name" name="username">
					</div>
				</div>				
				<div class="form-group">
					<label for="inputAdd" class="col-sm-2 control-label">Address</label>
					<div class="col-sm-10">
						<input class="form-control" id="inputAdd" placeholder="Address" name="address">
					</div>
				</div>				
				<div class="form-group">
					<label for="inputEmail" class="col-sm-2 control-label">Email</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="inputEmail" placeholder="Email" name="email">
					</div>
				</div>
				<!-- <div class="form-group">
					<label for="inputTel" class="col-sm-2 control-label">Tel</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="inputEmail" placeholder="Tel" name="tel">
					</div>
				</div> -->
				<div class="form-group">
					<label for="inputBirth" class="col-sm-2 control-label">Bitrh</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="inputBirth" placeholder="Birth" name="birth">
					</div>
				</div>				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">회원 가입</button>
					</div>
				</div>
			</form>
		</div><!-- class=row -->
	</div><!-- class=container -->

</body>
</html>