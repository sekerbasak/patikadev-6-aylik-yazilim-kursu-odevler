////! EVENTS
// const clearButton=document.querySelector("#todoClearButton");
// //1.yol
// clearButton.addEventListener("click",function(){
//     alert("Merhaba");
// });

// // ve en doğru yol=> fonskiyonu ayrı yerde tanımlayıp çağırmak

// clearButton.addEventListener("click",changetitle);//methoda eventı yazdık, sonra methodu çağırdık

// function changetitle(){
//     document.querySelectorAll('.card-title')[1].textContent="todo başlığı değiştrildi";
// }
//? type=>tetiklenen eventin tipini verir
//? target=> tetiklenen html etiketini verir


////! MOUSE EVENTS--------------------------------------------

//domcontentLoaded, Load, click, dbclick, mouseover, mouseout, mouseenter,mouseleave
//!domcontentLoaded
// document.addEventListener("DOMContentLoaded",run);//domcontentLoaded sayfa yüklendiğinde çalışan event
// function run(){
//     console.log("Sayfa DOMContentLoaded ile yüklendi!");
// }
//!Load
// window.addEventListener("load",run1);//domcontentLoaded sayfa yüklendiğinde çalışan event
// function run1(){
//     console.log("Sayfa load  ile yüklendi!");
// }

const cardtitle= document.querySelectorAll(".card-title")[0];
// cardtitle.addEventListener("dbclick",runTitle);

// function runTitle(e){
//     console.log(e.type);
//}
//! mouseover- mouseout
// const cardBody= document.querySelectorAll(".card-body")[1];
// cardBody.addEventListener("mouseover",run);
// function run(e){
//     console.log(e.type);
// }

//? mouseenter, mouseleave => sadece hedef html elementinde çalışır

////! KEY EVENTS

//document.addEventListener("keypress",run);//keypress sadece klavyedeki sayı ve harfleri tetiklenen bir event
//document.addEventListener("keydown",run); //Capslock, shift vs de algılar
//document.addEventListener("keyup",run);//tuştan elini çekince çalışan event
// function run(e){
//     console.log(e.key)//e.whick|| e.keyCode=> asci tablosundaki değerlerini yazdırır

// }
// //inputa klavyeden girilen değerler consola yazdırılsın
// const input=document.querySelector("#todoName");
// input.addEventListener("keyup",run);
// function run(e){
    
//     cardtitle.textContent=e.target.value;

// }


////! INPUT EVENTS=> focus, blur,copy,cut,select

const todo=document.querySelector("#todoName");

todo.addEventListener("focus",run);//inputun içine girince
todo.addEventListener("blur",run);//inputun içinden çıkınca
todo.addEventListener("copy",run);//inputun içinden bir değer kopyalanınca çalışan event
todo.addEventListener("paste",run);//inputun içinden bir değer yapıştırılınca çalışan event
todo.addEventListener("cut",run);//inputun içinden bir değer kesilince çalışan event
todo.addEventListener("select",run);//inputun içinden bir değer mousla seçilince seçilip bırakıldığı an event tetiklenşr

function run(e){
   console.log(e.type);
}




















