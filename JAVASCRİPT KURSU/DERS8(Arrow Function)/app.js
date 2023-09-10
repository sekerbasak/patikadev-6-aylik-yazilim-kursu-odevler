//arrow function
const yazdir1=()=>{
    console.log("Merhaba");
}
yazdir1()

//! Arrow Functionun en önemli özelliklerinden biri: tek satırda yazılabilmesi:::

//parametreli arrow function
const yazdir2=(firstName)=> console.log(`Adın :${firstName}`);
 yazdir2("Başak");

 //!1 parametreden oluşuyorsa parantezleri de yazmaya gerek yoktur!
 const yazdir3=surname=> console.log("Hoş geldin "+surname);


 //örnekler=>

 const getCube=(x)=>{return x*x*x};
 console.log("Değer",getCube(6));


 document.addEventListener("click",()=>{

 })






