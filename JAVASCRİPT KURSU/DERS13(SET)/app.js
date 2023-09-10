//SET=> setlerle mapin farklı setlerde tek bir değer yalnızca 1 kez tutulur

const set=new Set();
const plaka=3;
const value="Afyon";
set.add("Adana");
set.add("Adıyaman");
set.add(value);
//Size
console.log(set.size);

//Delete
set.delete(plaka);

//Has
console.log(set.has("Adıyaman"));

//Sette forla dolaşmak

for(let value of set){
    console.log(value);
}
console.log("------------------");
