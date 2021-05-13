/**
 * 
 */
let targetForm = document.getElementById("postForm");
let formSubmitBtn = document.getElementById("postBtn");
let targetText = document.getElementById("postText");
let check = false;

targetText.onblur = function() {
	if(targetText.value == '') {
		document.getElementById("textNotice").innerHTML = '내용을 입력해주세요';
		check = false;
	}
	else check = true;
}

formSubmitBtn.onclick = function() {
	if(check)
		targetForm.submit();
	else
		document.getElementById("textNotice").innerHTML = '내용을 입력해주세요';
}