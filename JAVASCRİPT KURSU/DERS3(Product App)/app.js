let product1={
    ID:1,
    name:"Acer Swift",
    category:"Teknoloji",
    price:15000
}
let product2={
    ID:2,
    name:"Asus Tuf",
    category:"Teknoloji",
    price:30000
}
let product3={
    ID:3,
    name:"MSI",
    category:"Teknoloji",
    price:28000
}
let product4={
    ID:4,
    name:"MacBook",
    category:"Teknoloji",
    price:50000
}
let products=[product1,product2,product3,product4];
let filterProducts=[];
let inputProductName=prompt("Bir ürün ismi giriniz");
getFilterProducts(products);
writeFilterProducts(filterProducts);

function getFilterProducts(products){
    products.forEach(function(product){
        if(product.name.toUpperCase().includes(inputProductName.toLocaleUpperCase(),0)){
        filterProducts.push(product);
        }
    })
}

function writeFilterProducts(products){
    products.forEach(function(product){
        console.log("-----------------------------------");
       console.log(product.ID+"|"+ product.name+ "|"+product.category+ "|"+product.price)
       console.log("-----------------------------------");
    })
}