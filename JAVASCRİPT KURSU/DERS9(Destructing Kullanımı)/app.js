let langs=["c#","java","c++"];
//let lang1,lang2,lang3;
// lang1=lang[0]; //vs
// lang2=lang[1];
// lang3=lang[2];
// console.log(lang1,lang2,lang3);  =>its so long

let[lang1,lang2,lang3]=langs; //diziyi sırayla içine aktarıyor
console.log(lang1,lang2,lang3);

const calc=(a,b)=>{
    const plus=a+b;
    const substract=a-b;
    const multiplication=a*b;
    const divide=a/b;
    const calcArray=[plus,substract,multiplication,divide];
    return calcArray;
}
let[a,b,c,d]= calc(10,2);
console.log(a,b,c,d);


const person={
    firstName:"Enes",
    surname:"Bayram",
    salary:17000,
    age:25

}

//let Username,Usersurname,Usersalary,Userage;

// Username=person.name;
// Usersurname=person.surname;    //so long
// Usersalary=person.salary;
// Userage=person.age;
let { firstName:Username,Usersurname,Usersalary,Userage}=person //persondaki sırayla değişkenleri süslünün içine atar

console.log(Username,Usersurname,Usersalary,Userage);

