<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	html, body {
		margin: 0;
		padding: 0;
	}
	
	header {
		width: 100vw;
		
		text-align: center;
	}
	
	header h2 {
		display: inline-block;
	}
	
	section {
		text-align: center;
	}
	
	section form {
		
		margin: auto;
	}
	
	section form button{
		display: inline-block;
		float: right;
	}
	
	.tb{
		width: 65%;
		height: 30px;
	}
	
	#file {
		display: inline-block;
		float: right;
	}
	
	.textbox{
		border: 1px solid #CCCCCC; border-radius: 4px; margin-top: 10px;
		width: 65%;
		height: 200px;
	}
	
	input {
		border: 1px solid #CCCCCC; border-radius: 4px; margin-top: 10px;
		width: 60%;
	}
	
	.buttonC {
		display: inline-block;
		float: right;
		margin-right: 100px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#list").on("click", function(){
			location.href="/";
		});
	})
	function goPage(title, name = 0) {
		var f = document.paging;
		f.title.value = title;
		f.name.value = name;
		f.action = "/main"
		f.method = "post"
		f.submit();
	};
	
</script>
</head>
<body>
	<header>
		<h2>작성</h2>
	</header>
	<section>
		<form id="" action="/create">
			<p>
			<label>제목</label>
			<input type="text" placeholder="제목을 입력하세요" name="title" id="title" class="tb" required="required"></p>
			<p>
			<label>내용</label>
			<input type="text" name="name" id="name" class="textbox">
			
			</p>
			<div class="buttonC">
				<button type="submlt">등록</button>
				
				<a href="">뒤로</a>
			</div>
		</form>
	</section>
</body>
</html>