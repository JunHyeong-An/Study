let targetId = document.getElementById("id");
let targetPw = document.getElementById("pw");
let targetRePw = document.getElementById("rePw");
let targetName = document.getElementById("name");
let targetBirth = document.getElementById("birth");

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

let checkRepw = () => {
    if(targetRePw.value == '') {
        document.getElementById("noticeRePw").innerHTML = '비밀번호를 확인해주세요';
        flag = false;
    }
    else {
        document.getElementById("noticeRePw").innerHTML = '';
        flag = true;
    }
}

let checkName = () => {
    if(targetName.value == '') {
        document.getElementById("noticeName").innerHTML = '이름을 입력해주세요';
        flag = false;
    }
    else {
        document.getElementById("noticeName").innerHTML = '';
        flag = true;
    }
}

let checkBirth = () => {
    if(targetBirth.value == '') {
        document.getElementById("noticeBirth").innerHTML = '생년월일을 입력해주세요';
        flag = false;
    }
    else {
        document.getElementById("noticeBirth").innerHTML = '';
        flag = true;

    }
}

targetId.onblur = checkId;
targetPw.onblur = checkPw;
targetRePw.onblur = checkRepw;
targetName.onblur = checkName;
targetBirth.onblur = checkBirth;

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
    checkBirth();
    isSame();

    if(flagPw && flag) {
        document.getElementById("joinForm").submit();
    }
}

document.getElementById("joinBtn").onclick = join;