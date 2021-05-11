let targetId = document.getElementById("id");
let targetPw = document.getElementById("pw");
let targetRePw = document.getElementById("rePw");
let targetName = document.getElementById("name");
let targetAge = document.getElementById("age");
let targetBirth = document.getElementById("birth");
let targetEmailSelect = document.getElementById("emailSelect");
let targetEmail = document.getElementById("email");
let targetUserInput = document.getElementById("userInput");
let emailExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

let cnt = 0;

let checkId = () => {
    if(targetId.value == '') {
        document.getElementById("noticeId").innerHTML = '아이디를 입력해주세요';
        cnt--;
    }
        
    
    else {
        document.getElementById("noticeId").innerHTML = '';
        cnt++;
    }
    
}

let checkPw = () => {
    if(targetPw.value == '') {
        document.getElementById("noticePw").innerHTML = '비밀번호를 입력해주세요';
        cnt--;
    }
        
    
    else {
        document.getElementById("noticePw").innerHTML = '';
        cnt++;
    }
}

let checkRepw = () => {
    if(targetRePw.value == '') {
        document.getElementById("noticeRePw").innerHTML = '비밀번호를 확인해주세요';
        cnt--;
    }
    else {
        document.getElementById("noticeRePw").innerHTML = '';
        cnt++;
    }
}

let checkName = () => {
    if(targetName.value == '') {
        document.getElementById("noticeName").innerHTML = '이름을 입력해주세요';
        cnt--;
    }
    else {
        document.getElementById("noticeName").innerHTML = '';
        cnt++;
    }
}

let checkAge = () => {
    if(targetAge.value == '') {
        document.getElementById("noticeAge").innerHTML = '이름을 입력해주세요';
        cnt--;
    }
    else {
        document.getElementById("noticeAge").innerHTML = '';
        cnt++;
    }
}

let checkBirth = () => {
    if(targetBirth.value == '') {
        document.getElementById("noticeBirth").innerHTML = '생년월일을 입력해주세요';
        cnt--;
    }
    else {
        document.getElementById("noticeBirth").innerHTML = '';
        cnt++;

    }
}

let showInput = () => {
    targetEmail.value = '';
    if(targetEmailSelect.value == 'userInput') {    
        document.getElementById("atSign").style.display = 'none';
    }
}

let checkEmail = () => {
    if(targetEmailSelect.value == 'userInput') {
        if(!emailExp.test(targetEmail.value)) {
            document.getElementById("noticeEmail").innerHTML = '이메일형식이 아닙니다.';
            cnt--;
        }
        else {
            document.getElementById("noticeEmail").innerHTML = '';
            cnt++;
        }
    }
    else {
        if(targetEmail.value == '') {
            document.getElementById("noticeEmail").innerHTML = '이메일을 입력해주세요';
            cnt--;
        }
        else {
            document.getElementById("noticeEmail").innerHTML = '';
            cnt++;
        }
    }
}

targetId.onblur = checkId;
targetPw.onblur = checkPw;
targetRePw.onblur = checkRepw;
targetName.onblur = checkName;
targetBirth.onblur = checkBirth;
targetEmailSelect.onchange = showInput;
targetEmail.onblur = checkEmail;
targetAge.onblur = checkAge;

let flagPw = false;

let isSame = () => {
    if(targetPw.value == targetRePw.value) {
        document.getElementById("noticeRePw").innerHTML = '';
        flagPw = true;
    }

    else {
        document.getElementById("noticeRePw").innerHTML = '비밀번호가 일치하지 않습니다.';
    }
    
}

let join = () => {
    checkId();
    checkPw();
    checkRepw();
    checkName();
    checkAge();
    checkBirth();
    checkEmail();
    isSame();
    
    console.log(cnt);
    console.log(flagPw);
    
    if(cnt > 10 && flagPw) {
        document.getElementById("joinForm").submit();
    }
}

document.getElementById("joinBtn").onclick = join;