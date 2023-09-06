//// parametresiz ve gerye değer döndürmeyen method

// function yazdir(){
//     console.log("güle güle dünya");
// }
// yazdir();

// //parametreli geriye değer döndürmeyen metot
// function printName( name,surname){
// alert("İsim: "+name+" Soyisim: "+surname);
// }

// printName("Başak", "Şeker");

// //parametreli geriye değer döndüren method
// let number=Number(prompt("Bi sayi giriniz: "))
// alert(kupAlma(number));
// function kupAlma(sayi){
//     return(sayi*sayi*sayi);
// }


////metinde geçen istenen harfi bulan metot
// let text="Başak Allah size dünyada da ahirette de mutluluk versin amin..";
// let char=prompt("Armak istediğiniz harfi giriniz: ");
// let charcounter=0;
// function charCounter(char){
// for(let i=0; i<text.length;i++){
//     if(text.charAt(i).toLowerCase==char.toLowerCase){
//         charcounter++;

//     }
  
// }
// alert(charcounter);

// }
// charCounter(char);

////Mükemmel sayı uygulaması

// let total=0;
// let number=Number(prompt("Bir sayı giriniz: "));

// if (isPerfectNumber(number)==number*2) {
//     alert("Tebrikler Muheteşem Sayı!")
// } else {
//     alert("Girdiğiniz sayı muhteşem sayı değil!");
// }
// function isPerfectNumber(number){
//     for(let i=1;i<=number;i++){
//         if(number%i==0){
//             total+=i;

//         }
//     }
//     return total;
// }


//// onluk tabanlı sayıyı ikilik tabanlı sayıya çeviren program

//  let decimalNumber=(prompt("Lütfen onluk tabandaki sayınızı giriniz: "));
// decimalToBinary(decimalNumber);

// function decimalToBinary(number){
//     let binary="";
//     while (true) {
//         binary+=(number%2).toString();
//         number=Math.floor(number/2);
//         if(number==1){
//             binary+=1;
         
//             break;
//         }
//     }
//   reverseString(binary);
    
// }
// function reverseString(binary){
//     let reverseBinary="";
//     for(let i=binary.length-1;i>=0;i--){
//         reverseBinary+=binary.charAt(i);
//     }
//     alert(reverseBinary);
// }

// 1001
////Decimal to Binary
// let binaryNumber=(prompt("Lütfen ikilik tabandaki sayınızı giriniz: "));
// binaryToDecimal(binaryNumber);
// function binaryToDecimal(binaryNumber){
    
//     let BinaryString="";
//     let total=0;
//     let counter=0;
//     for(let i=binaryNumber.length-1;i>=0;i--){
//       total+=Number(binaryNumber.charAt(i))*(Math.pow(2,counter));
//         counter++;
//   }
//   BinaryString+=total;
//   alert(BinaryString);
// }


 let dizi=[1,2,3,"Başak",54];

 dizi.push("Bayram");  //push=> dizinin sonuna eleman ekler
 dizi.unshift(0);      //unshift=> dizinin başına eleman ekler

 dizi.pop();           //pop=> dizinin sonundaki elemanı siler
 dizi.shift();         //shift=> dizinin başındaki elemanı siler

dizi.splice(0,0,"hundai"); // splice=> dizinin istediğin idksine diğer elemanları silmeden ekle
//(başlangıç index, silinecek değer, güncel değer)
dizi.splice(2,3,"Bayram"); //bayram da yazılmayabilirdi.sadece s ilme işlemi gerçekledşirdi
 
//join=> her bir indexi(arasına) seçtiğiniz işaretle birleştirir== 1-2-3-4-5-6 vs
//concat=> iki diziyi birleştirmek için kullanılır
//slice=> bir diziyi ikiye bölmek için kullanılır. ayırdığı kısımdan sonraki ayrı bir dizi olarak yakalanır


dizi.forEach(function(isim){
  console.log(isim);

});

















