/*
------SCOPE KAVRAMI-----
->GLOBAL SCOPE
->FUNCTİON SCOPE
->BLOCK SCOPE

*/
//  var=> function scope--ram bellkete çok yer kaplar aynı isimde değişken tanumlanabilir
//  let=> block scope -- aynı isimde değişkSen tamınlanamaz
//  const=> block scope -- aynı isimde değişken tamınlanamaz
/*

    DİYALOG KUTULARI
    -AlertS
    -Prompt
    -Confirm

 */
// //ALERT
// alert("Yanlış numaray bastınız!")

// //PROMPT
// //prompt kullanıcıdan değer alabilir
// //kullanıcıdan alınna değerler her zaman stringtir
// let isim= prompt("İsminizi giriniz: ")
// let age=prompt("Yaşınızı giriniz: ");

// //CONFIRM
// let result= confirm("Silmek istediğinize emin misiniz?")
// console.log( result)


  //KOŞUL YAPILARI-if else

//   let no=65;
//   if (no>50) {
//     console.log("Tebrikler geçtniz! "+ no)
//   } else {
//     console.log("Kaldınız! "+ no)
//   }

//   let yas=Number(prompt("Yaşınız: ")) ;
//   let para=prompt("Bütçeniz: ");
//   if(yas>=18 && para>3000){
//     alert("Ehliyet sınavına kabul edildiniz");
//   }else{
//     alert("Ehiyet sınavına katılma hakkınız yoktur!");
//   }

//ASAL MI
// let number=Number(prompt("Bir sayi Giriniz:" ));
// let result=true;
// for(let i=2 ; i<=number/2;i++){
//   if(number%i==0){
//     result=false
//     break;
//   }

// }if(result){
//   alert("Girdiğiniz sayı asaldı"); 
// }else{
//   alert("Giridğiniz sayı asal değildir!");
// }

// //FAKTÖRİYEL
// let number=Number(prompt("Bir sayi Giriniz:" ));
// let sonuc=1;
// for(let i=number; i>=1;i--){
//    sonuc*=i;
// }
// alert(sonuc);

//ARMSTRONG SAYISI BULMA=> bir sayını rakamlarının küp toplamı sayıyı veriyorsa
let number=prompt("Bir sayi Giriniz:" );
let toplam=0;
for(let i=0;i<number.length;i++){
   let index=number.charAt(i);
   let kup=index*index*index;
   toplam+=kup;
}
if(toplam==number){
  alert("Girdiğiniz sayı bir Amstrong sayıdır!");
}
else{
  alert("Girdiğiniz sayı Armstrong sayısı değildir!")
}
