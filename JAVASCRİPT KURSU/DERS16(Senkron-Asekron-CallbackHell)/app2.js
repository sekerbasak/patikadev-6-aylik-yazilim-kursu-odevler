//CALLBACK=> dezavantajı süresi. senkrona yani sırayla çağrılmaya döndürdüğü için tüm işlemlerin süresi boyunca zaman geçecek
//callback hell=> kod okunabiliriliği çok çok düşük iç içe onlarca fonksiyon!
function getName(callback){
    setTimeout(()=>{
        //servisten ismini getir
        console.log("başak")
        callback();// getname adlı metot bittikten sonra önceden getsurnamei atadğımız callback aflı metodu çağırıyoruz

    },1000)
}

function getSurname(){
    setTimeout(()=>{
        //servisten ismini getir
        console.log("şeker")

    },500)
}
//  getName()
//  getSurname(); //getsurname daha kısada süreceği için ekrana önce surname yazılır

 getName(getSurname)//=> callback yaptık şimdiönce name sonra surname çalışacak
