let getIndexArr = document.getElementsByClassName("index");
let indexArr = new Array();
let targets = document.getElementsByClassName("contentBox");

for(let i = 0; i < getIndexArr.length; i++) {
	indexArr[i] = getIndexArr[i].value;
}

let start = 0;
let perPage = 5;
let end;
let totalListCount = indexArr.length;

let showContentList = () => {
	end = (start + perPage <= totalListCount) ? start + perPage : totalListCount;
	for(let i = start; i < end; i++) {
		targets[i].style.display = 'flex';
	}
}

let loading =() => {
	let documentHeight = document.getElementById("contentList").clientHeight;
	let scrollLocation = document.getElementById("contentList").scrollTop; // 현재 스크롤바 위치
	let fullHeight = document.getElementById("contentList").scrollHeight; //  margin 값은 포함 x

	if(documentHeight + scrollLocation == fullHeight) {	
		start += perPage;
		showContentList();
	}
}

document.getElementById("contentList").onscroll = loading;
showContentList();