let result=confirm("Migros'a hoş geldniz! \n Money kartınız var mı?\n 1-Evet\n2-Hayır");
let amountToBePaid;
const products=[
   {
    productName:"Süt",
    price:20
   },
   {
    productName:"Kahve",
    price:45
   },
   {
    productName:"Çikolata",
    price:243
   },
]
if (result) {
    //money kartı var
    let name=prompt("Adınzı giriniz: ");
    let surname=prompt("Soyadınızı giriniz: ");

    const customer=new Customer(name,surname,result,products);
    amountToBePaid= customer.calcPrice();
    alert(`Müşteri bilgileri:${name} Soyisim:${surname}
    Ödenecek tutar:${amountToBePaid}`);
}
else{
    const customer= new Customer(null,null,result,products);
    amountToBePaid=customer.calcPrice();
    alert(`
    Ödenecek tutar:${amountToBePaid}`);
}
