import {useState} from 'react';

function InputExamples() {
    const [form, setForm]=useState({name:"",surname:""})
    // const [name,setName]=useState("");
    // const [surname,setSurname]=useState("");
    // const onNameChange=(e)=>{
    //     setName(e.target.value)
    // }
    // const onSurnameChange=(e)=>{
    //     setSurname(e.target.value)
    
     const onChangeInput=(e)=>{
       
        setForm({...form,[e.target.name]:e.target.value});
    }
  return (
    // <div>
    //     Please enter a name <br/>
    //     <input value={name} onChange={onNameChange}/><br/><br/>
    //     Please enter a surname <br/>
    //     <input value={surname} onChange={onSurnameChange}/>
     
       
    // </div>
  <>
   <div>
        Please enter a name <br/>
        <input name="name" value={form.name} onChange={onChangeInput}/><br/><br/>
        Please enter a surname <br/>
        <input name="surname" value={form.surname} onChange={onChangeInput}/>
        <br/><br/><br/><br/>
         {form.name}{form.surname}
    </div>
    </>
    )
  }

export default InputExamples;