import {useState} from "react";


function Counter(){
    const [count, setCount]=useState(0);
    function Increase(){
        setCount(count+1);
     }
     function Decrease(){
        setCount(count-1);
     }
    return(
        <div>
            <h1>{count}</h1>
            <button onClick={Increase}>Increase</button>
            <button onClick={Decrease}>Decrease</button>
        </div>
    )
}
export default Counter;