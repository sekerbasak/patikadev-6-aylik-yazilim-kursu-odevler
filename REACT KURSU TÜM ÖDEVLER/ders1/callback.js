//! setTimeout(() => {
//    console.log("setTimeout  fonksiyon parametresinin yaznına yazılan saniye kadar bekletilip sonra çalışacak") 
// }, 2000);//1 saniye sonra fonksiyon çalışacak
//! setInterval(() => {
//     console.log("setInterval ise değişken olarak verilen değeri periyot olarak alır 1000 yazılırsa her saniye ekrana basar!!!durdurulmazsa sonsuz döngüye girebilir ")
// }, 2000);


// const bye=(cb)=>{
//     cb();
// }
//  bye(()=>console.log("bye dostum benden bu kadar"));

import axios from "axios";
import fetch from "node-fetch";


// fetch("https://jsonplaceholder.typicode.com/albums/1")
//     .then((data) => data.json())
//     .then((albums) => {
//         console.log(albums)
//         console.log("ALBÜMLER YÜKLENDİ ŞİMDİ SIAR POSTLARDAA********************************************************");
//         fetch("https://jsonplaceholder.typicode.com/posts/1")
//             .then((data) => data.json())
//             .then((posts) => {
//                 console.log(posts)
//                 console.log(" YÜKLENDİ ŞİMDİ SIAR userslardaaa********************************************************");

//                 fetch("https://jsonplaceholder.typicode.com/users/2")
//                     .then((data) => data.json())
//                     .then((users) => console.log(users))
//             });
//     });

// async function getData(url, url2) {
//     const users = await (await fetch(url)).json()
//     console.log(`Kullanıcılar:${users}`);
//     const post = await (await fetch(url2)).json()
//     console.log(`Postlar:${post}`);

// }
//  getData("https://jsonplaceholder.typicode.com/users/2", "https://jsonplaceholder.typicode.com/posts/2")


// import fetch from "axios";
// import axios from "axios";
// async function getData(url, url2) {
//     const users = await axios(await fetch(url))
//     console.log(`Kullanıcılar:${users}`);
//     const post = await axios (await fetch(url2))
//     console.log(`Postlar:${post}`);

// }




const getComments=(number)=>{
return new Promise(async(resolve,reject)=>{
 const {data}=await axios("https://jsonplaceholder.typicode.com/comments/2");
 resolve(data)
});
};
getComments(2).then((data)=> console.log(data)).catch((err)=>console.log(err))
