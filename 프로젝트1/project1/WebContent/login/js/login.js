let targetId = document.getElementById("id");
let targetPw = document.getElementById("pw");
let targetForm = document.getElementById("loginForm");
let idFlag = false;
let pwFlag = false;


let checkId = () => {
    if(targetId.value == '') {
        document.getElementById("noticeId").innerHTML = '아이디를 입력해주세요';
        idFlag = false;
    }
        
    
    else {
        document.getElementById("noticeId").innerHTML = '';
        idFlag = true;
    }
    
}

let checkPw = () => {
    if(targetPw.value == '') {
        document.getElementById("noticePw").innerHTML = '비밀번호를 입력해주세요';
        pwFlag = false;
    }
        
    
    else {
        document.getElementById("noticePw").innerHTML = '';
        pwFlag = true;
    }
}

targetId.onblur = checkId;
targetPw.onblur = checkPw;

let login = () => {
    checkId();
    checkPw();
    if(idFlag && pwFlag) {
        targetForm.submit();
    }
}

function enterkey() { 
	if (window.event.keyCode == 13) {
		console.log(1);
		login();
	}	
}
window.onkeyup = enterkey;

document.getElementById("loginBtn").onclick = login;

document.getElementById("joinBtn").onclick = function() {
    location.href = '../join/join.html';
}