<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../common.css">
    <link rel="stylesheet" href="css/join.css">
    <link rel="stylesheet" href="css/settingAccount.css">
    <title>Document</title>
</head>
<body>
    <div id="wrap">
        <div id="joinTitle">Join Page</div>
        <div id="joinBox">
            <form action="settingProc.jsp" id="settingForm" enctype="multipart/form-data">
                <div class="settingDiv">
                    <p class="title">프로필 사진</p>
                    <input type="file" class="inputs" id="profilePic" name="profilePic">
                </div>

                <div class="settingDiv">
                    <p class="title">간단한 소개</p>
                    <textarea id="introduce" placeholder="intro...100자이내" maxlength="100"></textarea>
                </div>
                <div id="btnDiv">
                    <div id="btnBox">
                        <div id="joinBtn">Join!</div>
                    </div>
                    <div id="skipBox">
                        <div id="skipBtn">Skip!</div>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <script src="js/settingAccount.js"></script>
</body>
</html>