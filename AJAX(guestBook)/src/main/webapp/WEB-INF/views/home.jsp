<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input {
		outline: none;
	}

	#wrap {
		width: 500px;
		margin: 0 auto;
	}
	
	#writeForm {
		padding: 10px;
		background-color: rgb(245, 246, 248);
	}
	
	#writerInput {
		font-size: 13pt;
		border: none;
		border-bottom: 2px solid black;
		background-color: rgb(245, 246, 248);
	}
	
	#contentArea {
		border: 2px solid black;
		width: 470px;
		height: 80px;
		resize: none;
	}
	
	#contents {
		margin-top: 30px;
		background-color: rgb(245, 246, 248);
	}
	
	.content {
		position: relative;
		display: flex;
		flex-flow: column;
		padding: 5px;
		margin-bottom: 5px;
		
		background-color: rgb(245, 246, 248);
	}
	
	.content > p {
		height: 100px;
		padding: 5px;
		border: 1px solid lightgray;
	}
	
	.writerSpan {
		font-size: 13pt;
	}
	
	.dateSpan {
		position: absolute;
		right: 5px;
		font-size: 13pt;
	}
	
</style>
</head>
<body>
	<h1>GuestBook</h1>
	<hr>
	<div id="wrap">
		<form id="writeForm" onSubmit="return false;">
			<p><input type="text" id="writerInput" name="writer" placeholder="작성자" required>
			<p><textarea id="contentArea" name="content" required></textarea>
			<p><input type="submit" id="sumitBtn" value="작성">
		</form>
		
		<div id="contents"></div>
	</div>
	
	<script>
		const writeForm = document.querySelector("#writeForm")
		const sumitBtn = document.querySelector("#sumitBtn")
		const writer = document.querySelector("#writerInput")
		const content = document.querySelector("#contentArea")
		const contents = document.querySelector("#contents")
		
// 		writeForm.onsubmit = function(event) {
// 			event.preventDefault()
// 		}
		
		window.onload = selectAll()
		
		function selectAll() {
			var html = ""
			const url = "${path}/select"
			const opt = {
				method : 'GET'
			}

			fetch(url, opt)
			.then(function(list) {
				return list.json()
			})
			.then(function(json) {
				for (let i = 0; i < json.length; i++) {
					const writerText = json[i]["writer"]
					const writeDate = json[i]["writeDate"]
					const contentText = json[i]["content"]
					
					html += '<div class="content">' 
								 + '<div>'
									+ '<span class="writerSpan">' + writerText + '</span>'
									+ '<span class="dateSpan">' + writeDate + '</span>'
								 + '</div>'
								 + '<p>' + contentText + '</p>'
								 +'</div>'
				}
				contents.innerHTML = html
			})
		}

		// insert
		sumitBtn.onclick = function() {
			
			if(writer.value != "" && content.value != "") {
				let ob = {}
				ob["writer"] = writer.value
				ob["content"] = content.value

				const url = "${path}/insert"
				const opt = {
					method : 'POST',
					body : JSON.stringify(ob),
					headers : {
						"Content-Type" : "application/json; charset=utf-8"
					}
				}

				fetch(url, opt)
				.then(function(reps) {
					return reps.text()
				})
				.then(function(text) {
					if (text == 1) {
						writer.value = ""
						content.value = ""
						selectAll()
					}
				})
			}
		}
		// insert end
	</script>
</body>
</html>