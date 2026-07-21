import { useState } from "react"
import Car from './Car'
function Engine(){
    const [engine_name, setEnginename]=useState("Toyota Engine")
    return(
        <>
            <Car engine_name={engine_name}/>
        </>
    )
}

export default Engine;