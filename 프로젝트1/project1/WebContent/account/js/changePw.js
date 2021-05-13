let targetPw = document.getElementById("pw");
let targetNewPw = document.getElementById("newPw");
let targetReNewPw = document.getElementById("reNewPw");

let pwCheck = false;
let newCheck = false;
let reNewCheck = false;

let checkPw = () => {
    if(targetPw.value == '') {
        document.getElementById("pwNotice").innerHTML = '현재 비밀번호를 입력해주세요';
        pwCheck = false;
    }
        
    
    else {
        document.getElementById("pwNotice").innerHTML = '';
        pwCheck = true;
    }
}

let checkNewPw = () => {
    if(targetNewPw.value == '') {
        document.getElementById("newPwNotice").innerHTML = '변경할 비밀번호를 입력해주세요';
        newCheck = false;
    }
        
    
    else {
        document.getElementById("newPwNotice").innerHTML = '';
        newCheck = true;
    }
}

let checkReNewPw = () => {
    if(targetReNewPw.value == '') {
        document.getElementById("ReNewPwNotice").innerHTML = '변경할 비밀번호를 동일하게 입력해주세요';
        reNewCheck = false;
    }
        
    
    else {
        document.getElementById("ReNewPwNotice").innerHTML = '';
        reNewCheck = true;
    }
}

let formSubmit = () => {
	if(pwCheck && newCheck && reNewCheck) {
		document.getElementById("changePwForm").submit();
	}
	else {
		checkPw();
		checkNewPw();
		checkReNewPw();
	}
}


targetPw.onblur = checkPw;
targetNewPw.onblur = checkNewPw;
targetReNewPw.onblur = checkReNewPw;
document.getElementById("changePwFormSubmit").onclick = formSubmit; 