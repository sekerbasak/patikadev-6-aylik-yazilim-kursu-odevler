//!---------------- PROMISE=> asenkronları senkrona çevirmek. callbacklerin gelişmiş alternatifi
//1-Pending=>bekleme modu
//2-fullfilled-resolved=> başarılı =>.then(data)
//3-rejected=>başarısız=> başarısız =>.catch(error)

 let check=false;
// const promise1=new Promise((resoolve,reject)=>{
//    if (check) {
//     resoolve("Promise başarılı!");
//    } else {
//     reject("Promise başarısız");
//    }
// });
// console.log(promise1);
//!daha düzgün formatta yazacak olursak:
    // function createPromise(){
    //     return new Promise((resolve,reject)=>{
    //         if(check){
    //             resolve("Promise herhangi bir sıkıntı yok");
    //         }
    //         else{
    //             reject("Bir sıkıntı var");
    //         }
    //     })
    // }
    // createPromise()
    // .then((response)=>{
    //     console.log(response)
    // })
    // .catch((error)=>{
    //     console.log(error);
    // })
    // .finally(()=>console.log("finally bloğu her zaman çalışır"));


//! PROMISE+ XMLHTTPREQUEST

// function readStudents(url){
//     return new Promise((resolve,rejected)=>{
//         const xhr=new XMLHttpRequest();
//         try {
//             xhr.addEventListener("readystatechange",()=>{
//                 if(xhr.readyState===4 && xhr.status===200){
//                       resolve(JSON.parse(xhr.responseText))
//                 }
//             })
//         } catch (error) {
//             rejected(error);
//         }
//       xhr.open("GET",url);
//       xhr.send();
//     })
// }
//  readStudents("students.json")
//  .then((response)=>{
//      console.log(response)
//  })
//  .catch((error)=>{
//      console.log(error);
//  })
//  .finally(()=>console.log("finally bloğu her zaman çalışır"));


//! önceki derste yaptığımız gibi callbacklerle değil de promisela users çekelim:

    // function getUsers(url){
    //   return new Promise((resolve, rejected)=>{
    //     const xhr=new XMLHttpRequest();
    //     xhr.addEventListener("readystatechange",()=>{
        
    //             try {
    //                 if (xhr.readyState===4 && xhr.status===200) {
    //                     resolve(JSON.parse(xhr.responseText));
    //             }}
    //              catch (error) {
    //                 rejected(error);
    //             }
            
    //     })
    //     xhr.open("GET",url);
    //     xhr.send();
    //   })
    // }
    // getUsers("https://jsonplaceholder.typicode.com/users")
    // .then((data)=>console.log(data))
    // .catch((error)=>console.log(error))
    // .finally(()=>console.log("Ayarlar güncellendi"));



//!örnek2
function getCommentByUserID(url){
    return new Promise((resolve, rejected)=>{
        const xhr=new XMLHttpRequest();
        xhr.addEventListener("readystatechange",()=>{
           
                try {
                    if (xhr.readyState===4 && xhr.status===200) {
                        resolve(JSON.parse(xhr.responseText));
                }}
                 catch (error) {
                    rejected(error);
                }
            
        })
        xhr.open("GET",url);
        xhr.send();
      })
  }
function getUsers(url){
    return new Promise((resolve, rejected)=>{
      const xhr=new XMLHttpRequest();
      xhr.addEventListener("readystatechange",()=>{
         
              try {
                  if (xhr.readyState===4 && xhr.status===200) {
                      resolve(JSON.parse(xhr.responseText));
              }}
               catch (error) {
                  rejected(error);
              }
          
      })
      xhr.open("GET",url);
      xhr.send();
    })
  }
  getUsers("https://jsonplaceholder.typicode.com/users/3")
  .then((data)=>{
    console.log(data.id);
   return getCommentByUserID(`https://jsonplaceholder.typicode.com/comments/${data.id}`)
})
.then((res)=>console.log(res))
  .catch((error)=>console.log(error))
  .finally(()=>console.log("Ayarlar güncellendi"));
  
  
  