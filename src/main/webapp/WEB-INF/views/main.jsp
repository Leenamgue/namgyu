<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<style>
	html, body {
		margin: 0;
		padding: 0;
	}
	
	section {
	text-align: center;
	
	}
	
	table {
		width: 100%;
		border:1px solid black;
		border-collapse:collapse;
		border-spacing:0;
		text 
	}
	
	table thead td {
		background-color: #FFFF00;
		border:1px solid black;
	}
	
	#edit {
		float: right;
	}
	
	tbody tr {
		background-color: #f7f7ff;
		border:1px solid black;
	}
	tbody tr td {
		border:1px solid black;
	
	}
</style>
<body>


<header>
		<h1> 게시판 </h1>
		<button type="button">login</button>
		
	</header>
	<section>
		<form id="edit" action="/create">
			<button type="submit">글작성</button>
			<button type="submit">삭제</button>
			<button type="submit">수정</button>
		</form>
		<table>
			<thead>
				<tr>
					<td>선택</td>
					<td>번호</td>
					<td>제목</td>
					<td>작성자</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="checkbox"></td>
					<td>1</td>
					<td>이거 어렵다</td>
					<td>누구게</td>
				</tr>
				<tr>
					<td><input type="checkbox"></td>
					<td>2</td>
					<td>그치</td>
					<td>몰라</td>
				</tr>
			</tbody>
		</table>
	</section>
</body>
</html>