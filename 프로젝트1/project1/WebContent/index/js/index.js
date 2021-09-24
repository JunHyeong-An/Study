window.onload = function() {
    document.getElementById("main").style.color = 'white';
}

let target = document.getElementsByClassName("comment");

for(let i = 0; i < target.length; i++) {
    target[i].onclick = function() {
        if(document.getElementsByClassName("commentList")[i].style.display == 'none')
            document.getElementsByClassName("commentList")[i].style.display = 'block';

        else
            document.getElementsByClassName("commentList")[i].style.display = 'none';     
    }
}

let targetContent = document.getElementById("writeContent");
let contentFlag = false;
let checkContent = () => {
	if(targetContent.value == '') {
		document.getElementById("contentNotice").innerHTML = '글 내용을 작성해주세요';
		contentFlag = false;
	}
	else {
		document.getElementById("contentNotice").innerHTML = '';
		contentFlag = true;
	}
}

let insertContentSubmit = () => {
	if(contentFlag) document.getElementById("writeForm").submit();
	else checkContent();
}

document.getElementById("writeContent").onblur = checkContent;
document.getElementById("attachment").onclick = insertContentSubmit;

let commentBtns = document.getElementsByClassName("commentBtn");
let commentTexts = document.getElementsByClassName("commentText");
let commentForms = document.getElementsByClassName("commentForm");

for(let i = 0; i < commentBtns.length; i++) {
	commentBtns[i].onclick = function() {
		if(commentTexts[i].value != '') {
			commentForms[i].submit();
		} 
	}
}

for(let i = 0; i < document.getElementsByClassName("delete").length; i++) {
	document.getElementsByClassName("delete")[i].onclick = function() {
	let idxes = document.getElementsByClassName("idx");
		if(confirm('정말 삭제하시겠습니까?')) {
			location.href = '../board/delete.jsp?idx=' + idxes[i].value;
		}
	}
}

for(let i = 0; i < document.getElementsByClassName("commentDelete").length; i++) {
	document.getElementsByClassName("commentDelete")[i].onclick = function() {
	let idxes = document.getElementsByClassName("commentIdx");
		if(confirm('정말 삭제하시겠습니까?')) {
			location.href = '../board/commentDelete.jsp?idx=' + idxes[i].value;
		}
	}
}



