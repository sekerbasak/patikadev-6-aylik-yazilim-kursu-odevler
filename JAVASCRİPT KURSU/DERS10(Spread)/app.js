//Spread operatörü=> mostly using in arrays. integration arrays

let number=[10,20,30,40];

function add(a,b,c,d){
    console.log(a+b+c+d);
}
//add(number[0],number[1]...vs]; old way

//Spread
add(...number); //Has the same functionality as assigns the array as a function parameter in the old way


//!başka kullanım alanları::
//!1
//?integrate two arrays
// const langs=["java","python"];
// const integrationLangs=["php","js","boostrap",...langs];
//let array2=[...langs]; //bir dizinin içeriğini diğer boş diziye aktardık

// console.log(integrationLangs);
//console.log(array2);
// const numbers=[1,2,3,4,5,6];
// let[a,b,...otherNumbers]=numbers;
// console.log(a,b,otherNumbers);






