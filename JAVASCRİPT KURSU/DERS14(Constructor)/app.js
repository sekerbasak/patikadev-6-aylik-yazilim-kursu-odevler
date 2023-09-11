class Human{
    
    constructor(name){
        this.name=name;

    }
    ShowInfo() {
        console.log(`Ad:${this.name}`);
    }
}
const man=new Human("Tuçe");
man.ShowInfo();

//!STATIC

 class Math{
    add(a,b){
        return(a+b);
    }
  static extract(a,b){
        return(a-b);
    }

}
const math1=new Math();
console.log(math1.add(4,5));
Math.extract(4-5);// sınıf üzerinden direkt erişilebilir. nesne türetmeye gerek yok

//!INHERITANCE

class Person{

    firstName="Başak";

        write(){
            console.log(this.firstName);
        }
 
}
//    const person1=new Person();
//    person1.write();

class students extends Person{
     class_name="üni-3";

     className(){
        console.log(this.class_name);
     }
   }
const s1=new students();
s1.className();











