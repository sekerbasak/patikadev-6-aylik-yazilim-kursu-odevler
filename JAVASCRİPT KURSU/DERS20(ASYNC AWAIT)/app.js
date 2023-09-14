//! ASYNC AWAIT=> Promise-then zincirinden kurataran yapı!

//async functionın başına gelirse dönüş tipi PROMISE OLUR!

//? önce fetch-then yapısıyla yazalım:
    // document.querySelector("#button").addEventListener(click,()=>{
    //     fetch("https://jsonplaceholder.typicode.com/posts/1")
    //         .then((response)=>response.json())
    //         .then((post)=>{
    //    //  console.log(post.id)
    //    fetch(`https://jsonplaceholder.typicode.com/comments?postId=${post.id}`)
    //         .then((response)=>response.json())
    //         .then((comments)=> console.log(comments))
    //     } )
    // })

//? async await ile yapalım:

document.querySelector("#button").addEventListener("click", async()=>{
 const responsePost=await(await fetch("https://jsonplaceholder.typicode.com/posts/1")).json() //isteği at bekle
 const responseComments=await (await fetch(`https://jsonplaceholder.typicode.com/comments?postId=${post.id}`)).json()
 console.log(comments);
     
})







