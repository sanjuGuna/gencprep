import React from "react";
function Form(){
    const [user,setUser]=React.useState({
        name:"",
        age:""
    });

    const handleChange=(e)=>{
        const {name, value}=e.target;
        setUser((prev)=>({
            ...prev,
            [name]:value
        }));
    }

    const handleSubmit=(e)=>{
        e.preventDefault();
        console.log(user);
        alert(`Name: ${user.name}\nAge: ${user.age}`);
    }
    return(
        <form onSubmit={handleSubmit}>
            <label>Name</label>
            <input type="text" name="name" value={user.name} onChange={handleChange}></input>
            <label>Age</label>
            <input type="number" name="age" value={user.age} onChange={handleChange}></input>
            <button type="submit">Submit</button>
        </form>
    )
}
export default Form;