//AJAX => tarayıcıyla server arasındaki köprü
const xhr=new XMLHttpRequest();
console.log(xhr.statusText);

/*
200= OK
403= FORBIDDEN
404= PAGE NOT FOUND

*/
// //!readystate=:
// 0: serverla daha iletişim kurmadı
// 1: server connection established servera isteği attığı an
// 2: request received= istek servera ulaştı
// 3: istek işleniyor
// 4: istek işlenmesi bitti cevap hazır RESPONSE IS READY

//  if (this.readyState==4 %% this.status==200) {
    
//  }
//!response.text=> serverın cevabı
//!onreadystatechange=< readystate değiştiğindeki event


//!AJAX ÖRNEK

function preparerURL(url,id){
   if (id==null) {
    return url;
   }
   return `${url}?postId=${id}`;
}

function getComments(url,id){
   let newURL= preparerURL(url,id);
   const xhr=new XMLHttpRequest();
   xhr.addEventListener("readystatechange",()=>{
    if(xhr.readyState==4 && xhr.status==200){
        console.log(JSON.parse(xhr.responseText));//default string formatında gelir
    }
   })
   xhr.open("GET",newURL);
   xhr.send();
}
function getUsers(url){
   
    const xhr=new XMLHttpRequest();
    xhr.addEventListener("readystatechange",()=>{
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);
        }
    })
    xhr.open("GET",url);
    xhr.send();
}

 getComments("https://jsonplaceholder.typicode.com/comments",5);
console.log("------------------------")
getUsers("https://jsonplaceholder.typicode.com/users")