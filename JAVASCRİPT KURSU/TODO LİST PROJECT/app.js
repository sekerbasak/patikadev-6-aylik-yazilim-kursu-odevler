//html elemantlerini seçmek

const form=document.querySelector("#todoAddForm");
const addInput=document.querySelector("#todoName");
const todoList=document.querySelector(".list-group");
const firstCardbody=document.querySelectorAll(".card-body")[0];
const secondCardbody=document.querySelectorAll(".card-body")[1];
const clearButton=document.querySelector("#clearButton");
const filterInput=document.querySelector("#todoSearch");
let todos=[];

runEvents(); //fonsksiyonları çalıştıran metodu çağırdık

function runEvents(){
    form.addEventListener("submit",addTodo);
    document.addEventListener("DOMContentLoaded",getTodoFromStorage)
    secondCardbody.addEventListener("click",removeTodoUI);
    clearButton.addEventListener("click",removeAll);
    filterInput.addEventListener("keyup",filterSearch);
}
function addTodo(e){
    const inputText=addInput.value.trim();//trim sağdaki ve soldaki tüm boşlukları temizleyerek alır
  
    if (inputText == null || inputText == "") {
        
        showAlert("danger","Lütfen bir değer giriniz");
    } else {
        //Arayüze ekleme
        addTodoUI(inputText);
        addTodoStorage(inputText);
        showAlert("success","Todo başarıyla eklendi!");
    }
 
   //storeage ekleme
   
    e.preventDefault();//farklı sayfaya yönlenmesini önledik

}
function addTodoUI(newTodo){

    const li=document.createElement("li");
    li.className="list-group-item d-flex justify-content-between";
    li.textContent=newTodo;

    const a=document.createElement("a");
    a.href="#";                             
    a.className="delete-item";

    const i=document.createElement("i");
    i.className="fa fa-remove";
  //elementleri oluşturduk şimdi bunları birbirine ekleyeceğiz
    a.appendChild(i);
    li.appendChild(a);
    todoList.appendChild(li);
    addInput.value="";
}
function addTodoStorage(newTodo){
   checkTodosFromstorage();
   todos.push(newTodo);//yenisiini de yazdır
   localStorage.setItem("todos",JSON.stringify(todos)); //todosu string olarak ekle

    
}
function checkTodosFromstorage(){

    if (localStorage.getItem("todos")===null) {
        todos=[];
    }else{
        todos=JSON.parse(localStorage.getItem("todos"));//eğer değer önceden varsa onları getir ve todosa koy
    }
}
function showAlert(type,message){
    
    const div=document.createElement("div");
    div.className= `alert alert-${type}`;
    div.role="alert";
    div.textContent=message;
    firstCardbody.appendChild(div);

    setTimeout(function() {//verilen uyarı 2,5 sanite sonra kladırılsın
        div.remove();
    }, 2500);
}
function getTodoFromStorage(){

    checkTodosFromstorage();
    todos.forEach(function(todo){
        addTodoUI(todo);
    });

}
function removeTodoUI(e){
    //UI'dan silmek
   if (e.target.className==="fa fa-remove") {//target o html etiketini verir
      const todo=e.target.parentElement.parentElement; //i'nin 2 üstü li liyi siliyoruz
      todo.remove();
      //Storagedan silmek
      removeTodoFromStorage(todo.textContent);

      showAlert("warning","Todo başarıyla silindi!");
   }
}
function removeTodoFromStorage(removeTodo){
    checkTodosFromstorage();
        todos.forEach(function(todo,index){
            if(removeTodo===todo){
                todos.splice(index,1);//spice diziden eleman silmek için kullanılır
            }
         });
        localStorage.setItem("todo",JSON.stringify(todos));
}
function removeAll(){
    const todolist=document.querySelectorAll(".list-group-item");
    
    if (todolist.length>0) {
        todolist.forEach(function(todo){
            todo.remove();
        })
      //  todos=[];
        localStorage.clear();
     //   localStorage.setItem("todos",JSON.stringify(todos));
        showAlert("success","Görevler başarıyla silindi");
    }else{
        showAlert("warning","Silmek için en az 1 görev olmalı!");
    }
    
}
function filterSearch(e){
    const filterValue=e.target.value.toLowerCase().trim();
    const todoLists=document.querySelectorAll(".list-group-item");
    if (todoLists.length>0) {
        todoLists.forEach(function(todo){
            if(todo.textContent.toLowerCase().trim().includes(filterValue)){
                todo.setAttribute("style", "display : block"); //görünür  
            }
            else{
                todo.setAttribute("style", "display : none !important");   //görünmez
            }

        });
    }else{
        showAlert("warning","Arama yapmak için en az 1 görevin kayıtlı olması gerekiyor");


    }

}


