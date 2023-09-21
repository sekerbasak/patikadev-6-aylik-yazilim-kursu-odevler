import PropTypes from "prop-types";

function User({name,surname,age,languages,isLogin,address}){
   
  if(!isLogin){
    return(<div>Giriş yapılamadı</div>)
  }
    return(
       <> 
            <h1> 
                { `${name} ${surname} (${age})
                 Diller: ${languages}`}
            </h1><br></br>
            <h2>{address.title}{address.zip}</h2>
       { languages.map((lang,index)=>(
            <div key="index">{index}-{lang}</div>
       ))}
  
</>

    );
}
User.propTypes={
    name:PropTypes.string.isRequired,//isrequired onu girilmesi zorunlu kılar
    surname:PropTypes.string,
    isLogin:PropTypes.bool,
    age:PropTypes.oneOfType([PropTypes.string,PropTypes.number]),
    languages:PropTypes.array,
    address:PropTypes.shape({
        title:PropTypes.string,
        zip:PropTypes.number
    })
}

User.defaultProps={ //varsayılan değeri atamaya yarar
    name:"İsimsiz",
    isLogin:false
}

export default User;