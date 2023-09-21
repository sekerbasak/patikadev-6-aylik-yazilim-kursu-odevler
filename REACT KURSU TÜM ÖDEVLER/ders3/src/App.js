import {useState} from "react";//değerin değişebileceği değişkenleri state ile tanımlamalıyız kimi zaman
import './App.css';

function App() {
  const[name,setName]=useState("Bayram");
  const[age,setAge]=useState(21);
  const[languages,setLanguages]=useState(["türkçe","inglizce","farsa","kürtçe"]);
  const[address,setAdress]=useState( //object states
    {
      title:'İstanbul',
      zip:1234
    }
  )


  return ( //herhangi bir state güncellendiği anda render işlemi baştan yapılır
    <div className="App">
      <h1>merhaba {name}! Ben {age} yaşındayım!</h1>
      <button onClick={()=>setName("Başak")}>Change Name</button>
      <button onClick={()=>setAge(22)}>Change Age</button>
      <hr/><hr/>
      <br></br><br></br>
      <h2>Languages</h2>
      {
        languages.map((lang,index)=>(
          <div key={index}>
            {lang}
          </div>
        ))
      }
      <br></br><br></br>
      <h2>Address {address.title} {address.zip}</h2>
      <br></br><br></br>
      <button onClick={()=>setLanguages([...languages,"İtalyanca"])}>Add New Languages</button>
      <button onClick={()=>setAdress({...address ,title:"Ankara"})}>Change the Address</button>
     


    </div>
  );
}

export default App;
