window.onload=function () {
    var v=document.getElementsByTagName("h2");
    var left=document.getElementsByClassName("left")[0];
    var html="";
    for(var a=0;a<v.length;a++){
        html+="<span><a href=\"#"+v[a].id+"\">"+v[a].id+"</a></span>";
    }
    left.innerHTML=html;
}