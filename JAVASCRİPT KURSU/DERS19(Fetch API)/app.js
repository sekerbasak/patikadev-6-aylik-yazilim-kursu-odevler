//!-------- FETCH API---------

// Callback => promise
// Ajax     => Fetch Api

    // function getStudents(url){ 
    //     fetch(url) //=> promise tipinde bir promise döner
    //     .then((response)=>{
    //       return  response.json();
    //     })
    //     .then((data)=> console.log(data))
    //     .catch((err)=>consolelog(err));
    
    // }
    // getStudents("students.json");

    function getData(url){
        fetch(url)
        .then((response)=> response.json())
        .then((data)=> console.log(data))
        .catch((err)=> console.log(err))
    }
    getData("https://jsonplaceholder.typicode.com/albums");

    //!karşıya veri yüklemek
    function saveStudents(){
        fetch("https://jsonplaceholder.typicode.com/albums",{
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body: JSON.stringify(data)
        })
    }