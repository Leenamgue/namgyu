<%@page import="java.util.List"%>
<%@page import="com.java.web.ListBean"%>
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
<script type="">
	$(document).ready(function(){
		$("#checkbox").on("click",function(e){
			e.
		
	})


});

	$("#checkbox").click(function(){
		alert("hello");
});

</script>
<body>


<header>
		<h1> 게시판 </h1>
		<button type="button">login</button>
		
	</header>
	<section>
		<form id="edit" action="" >
			<a href="tr">등록</a>
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
<%--
	ListBean[] list = (ListBean[]) request.getAttribute("list");
			if(list == null){
			System.out.println("없다");
		} else {
			System.out.println(list.length);
			for(int i = 0; i < list.length; i++){ 
				System.out.println(list[i]);
				if(list[i] != null){
--%>

<%
	List<ListBean> list = (List<ListBean>) request.getAttribute("list");
		if(list == null || list.size() == 0) {
			System.out.println("리스트에 내용이 없습니다");
		}else{
			for(int i = 0; i < list.size(); i++){

%>
	 			<tr>
	 			  <td><input type="checkbox" onclick="checkEvent(<%=i %>)" name="checkbox"></td>				      
			      <td><%=list.get(i).getN_no() %></td>
			      <td><%=list.get(i).getTitle() %></td>
			      <td><%=list.get(i).getName() %></td>
			    </tr> 
<%--
			}
 		}
	}
--%>
<% 
		}
	}
		
			


%>
			</tbody>
		</table>
	</section>
</body>
</html>