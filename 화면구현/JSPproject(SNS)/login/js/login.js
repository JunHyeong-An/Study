let targetId = document.getElementById("id");
let targetPw = document.getElementById("pw");
let targetForm = document.getElementById("loginForm");
let flag = false;


let checkId = () => {
    if(targetId.value == '') {
        document.getElementById("noticeId").innerHTML = '아이디를 입력해주세요';
        flag = false;
    }
        
    
    else {
        document.getElementById("noticeId").innerHTML = '';
        flag = true;
    }
    
}

let checkPw = () => {
    if(targetPw.value == '') {
        document.getElementById("noticePw").innerHTML = '비밀번호를 입력해주세요';
        flag = false;
    }
        
    
    else {
        document.getElementById("noticePw").innerHTML = '';
        flag = true;
    }
}

targetId.onblur = checkId;
targetPw.onblur = checkPw;

let login = () => {
    checkId();
    checkPw();

    if(flag) {
        targetForm.submit();
    }
}

document.getElementById("loginBtn").onclick = login;

document.getElementById("joinBtn").onclick = function() {
    location.href = '../join/join.html';
}