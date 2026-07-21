import React from "react";
class About extends React.Component{
    constructor(props){
        super(props);
        this.state={count:0};
    }
    handleClick=()=>{
        this.setState({count:this.state.count+1});
    }
    render(){
        return(
            <>
            <h1>This about page using class component</h1>
            <h3>count : {this.state.count}</h3>
            <button onClick={this.handleClick}>click me</button>
            </>
        )
    }
}

export default About;