let targetForm = document.getElementById("settingForm");

let submitSetting = () => {
    targetForm.submit();
};

document.getElementById("btnBox").onclick = submitSetting;