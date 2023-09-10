let nameArray=["Ali","Veli","Hasan"];

// names.forEach((name)=>console.log(name));

//For in Loop
for(let name in nameArray){ //for in index verir

    console.log(name,nameArray[name]);//ilk parametre bize indexi veriri diğeri de o indexteki değeri verir
}
for(let name of nameArray){ //for of değerleri verir

    console.log(name,nameArray.indexOf(name));//ilk parametre değeri veriri, ikincisi indeksini verir
}

