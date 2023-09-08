//!SessionStoreage=>tarayıcı kapandığı anda değerler silinir
//Değer Ekleme
sessionStorage.setItem("350","Başak");
sessionStorage.setItem("150","Başak");
sessionStorage.setItem("250","Başak");
sessionStorage.setItem("550","Başak");
//Değer Silme
sessionStorage.removeItem(250);
//Değer çekme
let value=sessionStorage.getItem("850");
console.log(value);
if(value==null){
   console.log("Değer bulunamadı");
}
//hepsini silme
sessionStorage.clear();

//alınna verileri arrayleme !!ÖNEMLİ
let names=["tuçe","simge","aşko","babay"];
sessionStorage.setItem("names",JSON.stringify(names));//arraymiş gibi storage koy
let value1=JSON.parse(sessionStorage.getItem("names"));//arraya çevir

console.log(value1);

//! LocalStoreage=> bilgisayar kapansa bile silinmeyecek web veri tabanı denebilir
//kullanımı sessionstoreage ile aynı