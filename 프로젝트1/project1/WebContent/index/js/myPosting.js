window.onload = function() {
    document.getElementById("myPosting").style.color = 'white';
}

let target = document.getElementsByClassName("comment");

for(let i = 0; i < target.length; i++) {
    target[i].onclick = function() {
        if(document.getElementsByClassName("commentList")[i].style.display == 'none')
            document.getElementsByClassName("commentList")[i].style.display = 'block';

        else
            document.getElementsByClassName("commentList")[i].style.display = 'none';     
    }
}