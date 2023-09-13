/* js senkron çalışan bir dildir(işlemler sırayla)

1- Timing
2- Event(olay)
3- http isteklerinde


*/

// console.log("Başak");

// setTimeout(()=>{
//  console.log("Süre doldu") 
// },1000);

// console.log("Şeker");
// setTimeout(()=>{
//     console.log("yarım saniye Süre doldu") 
//    },5);
   

//! ASENKRON PROBLEMLERİ
//http istekleri

const users=[
    {
        userID:5,
    post:"B5 post"
},  {
    userID:6,
post:"B6 post"
} , {
    userID:7,
post:"B7 post"
} , {
    userID:8,
post:"B8 post"
}
]
//aşağıda iki fonsksiyon asenkron çalıştığı için aynı getPostUserIDdeki userID daha belli eğil bu yüzden senkron hatası alıyoruz

//bunu senkron haline getirmemiz lazım
//callback, promise, async await yönetmleriyle çözülebilir
//callback ile çözümü 
function getUserID(callback){ //fonksiyonu parametre olarak aldık
    setTimeout(()=>{
       let userId=5;
     callback(userId);
    },1000);
}
function getPostUserID(userID)
{
    setTimeout(()=>{
       users.forEach((user)=>{
        if (user.userID==userID) {
            console.log(user.post);
        }
        
       })
    },500);
}
let userid=getUserID(getPostUserID);














