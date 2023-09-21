
import './App.css';
//import Header from './components/Head';
import User from './components/User';
import React from 'react';

function App(){
  return(
    <>
    <User 
   // name ="Mehmet"
    surname="Şeker" 
    isLogin={true} 
    age={29}
    languages={["Turkish","English"]}
    address={
      {
        title:'Avcılar/İstanbul',
        zip:1234
      }
    }
     
     />
    
    </>
    );
}

export default App;