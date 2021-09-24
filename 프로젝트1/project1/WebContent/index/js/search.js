let searchBar = document.getElementById("searchBar");
let searchInput = document.getElementById("searchInput");
let searchResultList = document.getElementById("searchResultList");
let list = document.getElementsByClassName("member");
let nameList = document.getElementsByClassName("memberName");
let picList = document.getElementsByClassName("memberProfile");
let membersId = new Array();

for(let i = 0; i < list.length; i++) {
	membersId[i] = list[i].value;
}

let targetSearchBtn = document.getElementById("searchBtn");

let searchSubmit = () => {
	document.getElementById("searchForm").submit();
}

targetSearchBtn.onclick = searchSubmit;

let showList = () => {
	let cnt = 0;
	let filterList = membersId.filter(id => id.indexOf(searchBar.value) != -1);
	
	if(searchBar.value != '') {
		searchResultList.style.display = 'block';
		searchResultList.style.borderTopLeftRadius = '0';
		searchResultList.style.borderTopRightRadius = '0';
		searchInput.style.borderBottomLeftRadius = '0';
		searchInput.style.borderBottomRightRadius = '0';
		
		if(filterList.length == 0) {
			document.getElementById("noResult").style.display = 'flex';
			for(let i = 0; i < list.length; i++) {
				document.getElementsByClassName('searchResult')[i].style.display = 'none';
				document.getElementById("moreSearchResult").style.display = 'none';
			}
		} 
		else {
			document.getElementById("noResult").style.display = 'none';
			for(let i = 0; i < list.length; i++) {
				if(cnt >= 5) {
					document.getElementById("moreSearchResult").style.display = 'flex';
					break;
				}
				else {
					document.getElementById("moreSearchResult").style.display = 'none';
				}
				for(let j = 0; j < filterList.length; j++) {
					if(list[i].value == filterList[j]) {
						document.getElementsByClassName('searchResult')[i].style.display = 'flex';
						cnt++;
					}
				}
			}
			cnt = 0;
		}
	}
	else {
		for(let i = 0; i < list.length; i++) {
			document.getElementsByClassName('searchResult')[i].style.display = 'none';
		}
		searchResultList.style.display = 'none';
		searchInput.style.borderRadius = '15px';
	}
}

function enterkey() { 
	if (window.event.keyCode == 13) {
		console.log(1);
	}	
}
searchBar.onfocus = enterkey;
searchBar.onkeyup = showList;
document.getElementById("moreSearchResult").onclick = function() {
	document.getElementById("searchForm").submit();
}

