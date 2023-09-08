
//const button=document.getElementById("todoAddButton");

//console.log(button);
//console.log(button.id);

//console.log(button.getAttribute("id"));
//console.log(button.getAttribute("class"));
//const listclass=button.classList[3];
//console.log(listclass);

// let buttonText=button.textContent;//string olarak metni alır
// let buttonText1=button.innerHTML;//

// console.log(buttonText);
// console.log(buttonText1);

// button.textContent="<b> todo ekleyin</b>";//string olarak direkt ne varsa onu yazar
// button.innerHTML="<b> todo ekleyin</b>";//html etiketlerini tanır mark şeklinde yazar.duyarlıdır.kod gibi.

// const todoList=Array.from(document.getElementsByClassName("card-title"));

// todoList.forEach(function(todo){
//     console.log(todo.textContent);
// })
// console.log(todoList);

////!querySelector=> classlar birden fazla olsa da sadece ilk buldğunu getirir
//querySelectorAll=> birden fazla tüm classları getirir
// const addButton=document.querySelector("#todoAddButton");//id seçme
// console.log(addButton);
// const cardtitle=document.querySelector(".card-title");//class seçme
// console.log(cardtitle);
// const getLi=document.querySelector("li:first-child");//etiket direkt ismiyle yazılır
// console.log(getLi);

//odd=> tek even=>çift


////!style özelliğini anlamak
// const todo=document.querySelectorAll(".card-title")[0];
// todo.style.color="white";
// todo.style.backgroundColor="purple";
// console.log(todo);



// const todo=document.querySelectorAll(".card-title")[0];
// todo.style.color="white";


const todo=document.querySelectorAll(".list-group-item");
const todoList=document.querySelector(".list-group");
const card=document.querySelector(".card");
let value;
// //!ebeveynden çocuklara erişmek

// value=todoList;
// value=todoList.children[0];//üst elementin classlarından(anneden) çocuk classlara erişmek
// value=todoList.children[todoList.children.length-1].textContent="TO DO4"//son çocuk

// value=Array.from(todoList.children); //çocukları foreachle ekrana yazdırma
// value.forEach(function(child){
//     console.log(child.textContent);
// })

// //!çocuktan anneye erişmek
// value=todo;
// let ul =todo.parentElement; //anne elementi getir
// console.log(value);

// //! kardeşler arası gezinmek

// value=todo;
// let sibling=todo.nextSibling;
// let previousSibling=todo.previousElementSibling;
// console.log(value);

////!dinamik olarak element oluşturma

// //Örnek1
// const link=document.createElement("a");
// link.id="goBlokgWebsite";
// link.className="btn btn-dark btn-sm ms-3";
// link.href="www.google.com";
// link.innerHTML="go to Google";
 const cardBody=document.querySelectorAll(".card-body")[1];
// cardBody.appendChild(link);//çocuğu ekleme yapar
// console.log(link);

// //Örnek2 
// const todo5=document.createElement("li");
// const todo5Link=document.createElement("a");
// const iLink=document.createElement("i");
// //li
// todo5.className="list-group-item d-flex justify-content-between";
// todo5.innerHTML="TO DO 5!";
// //a
// todo5Link.href="#";
// todo5Link.className="delete-item";
// //i
// iLink.className="fa fa-remove";

// todo5Link.appendChild(iLink);//i elementini a elementin içine koyduk
// todo5.appendChild(todo5Link);//a elementini de li elementin içine koyduk
// todoList.appendChild(todo5);

////!Element Silmek
// //direkt silme
// todo[0].remove();
// todo[todo.length-1].remove();
// console.log(todo);
// //anneden ulaşarak silme
// todoList.removeChild(todo[0]);

////!element yer değiştirme

const h2Element=document.createElement("h2");
h2Element.className="card-title";
h2Element.textContent="Todo Listesi-New";

cardBody.replaceChild(h2Element,cardBody.childNodes[1]);


