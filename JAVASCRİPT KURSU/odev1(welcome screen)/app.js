let myclockDiv=document.querySelector("#myClock");
let mynameSpan=document.querySelector("#myName");

var name = prompt("Adınızı Girin:");
// Eğer kullanıcı iptal tuşuna basarsa veya boş bir değer girerse işlem yapma
    if (name === null || name === "") {
        prompt("Lütfen boş geçmeyiniz!")
        name = prompt("Adınızı Tekrar Girin:");
    }

    // Sonucu HTML içindeki span içine yazdır
    mynameSpan.textContent = name ;

  /*  myclockDiv.addEventListener("onload",showTime);*/

function showTime() {

// Bugünün tarihini ve saatini al
var today = new Date();
 // Locale (yerel) seçeneğini Türkçe olarak ayarla
 var localeOptions = { weekday: "long" };
  
 // Tarih nesnesini Türkçe olarak biçimlendir ve sonucu döndür
 var day = today.toLocaleDateString("tr-TR", localeOptions);
var clock = today.toLocaleTimeString(); // Saat bilgisini al
myclockDiv.textContent=clock +" "+ day;

}

