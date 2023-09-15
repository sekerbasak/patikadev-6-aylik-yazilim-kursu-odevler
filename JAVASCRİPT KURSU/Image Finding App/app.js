
 const formWrapper=document.querySelector(".form-wrapper");
 const form=document.querySelector("#form");
 const input=document.querySelector("#searchInput");
 const buttonWrapper=document.querySelector(".button-wrapper")
 const searchButton=document.querySelector("#searchButton");
 const ClearButton=document.querySelector("#clearButton");
 const imageList=document.querySelector(".imageList");

 runeventListener();
function runeventListener(){
    form.addEventListener("submit",search);
    ClearButton.addEventListener("click",clearAll);
}
function search(e){
    const value=input.value.trim(); //ekrandan girilen değeri tuttuk
    fetch(`https://api.unsplash.com/search/photos?query=${value}`,{
        method:"GET",
        headers:{
            Authorization : "Client-ID oQoIWCdy86rL-s_OtTrifBcjFZAz8zeY3z7TOUYLdmc"
        }
    })
    .then((res)=>res.json())
    .then((data)=>{
        Array.from(data.results);
       data.results.forEach((img) => {
        let imgURL=img.urls.small;
        addImageToUI(imgURL);
       });
    })
    .catch((err)=>console.log(err))

     e.preventDefault();
}
function addImageToUI(imgURL){
    const div=document.createElement("div");
    div.className="card";
    const img=document.createElement("img");
    img.setAttribute("src",imgURL);
    img.height="200";
    img.width="200";
    div.append(img);
    imageList.append(div);

}
function clearAll(){
   input.value="";
    //imageListteki çocukları arraye atadık ve her bir çocuğu sildik
   Array.from(imageList.children).forEach((child)=>child.remove())
    // imageList.innerHTML="";  böyle de olabilirdi
   
}
