//!Map=> key-value mantığında çalışır. dizilerin alternatifidir

const map1=new Map();
//SET
map1.set(1,"Başak");
map1.set(2,"Ayşe");
map1.set(3,"Başak");
map1.set(4,"Ayşe");
map1.set(5,"Başak");
map1.set(6,"Ayşe");

//?map1.set([1,23,4],true);=> istediğiniz tüm türde değerler verilebilir

//GET=>key'in valuesu döner.
console.log(map1.get(2));


//SIZE
let size=map1.size;

//DELETE
let deleteKey=map1.delete(1);

//HAS=> mapteki keyin varlığını sorgulama//boolean
console.log(map1.has(2));

//For of metoduyla map üzerinde dolaşma

//!1. yöntem=>hem key hem value yazdırma
for (let [key,value] of map1) { //Destructing
    console.log(key,value);
}
console.log("---------------------");
//!2. yöntem=>hem key hem value yazdırma
const keys=Array.from( map1.keys());
console.log(keys);
keys.forEach(key => {
    console.log(key,map1.get(key))
});
//!3.yöntem=>key'leri yazdırma
for (let key of map1.keys()) {
    console.log(key);
}
//!4.yöntem=>value'leri yazdırma
for (let value of map1.values()) {
    console.log(value);
}

///MAPTEN ARRAYE ÇEVİRME

const array=Array.from(map1);
console.log(array);