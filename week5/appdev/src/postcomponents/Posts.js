import React from "react";
import Post from './Post';
class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state={
            posts:[]
        };
    }
    componentDidMount(){
        this.loadPost();
    }

    loadPost(){
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(res=>res.json())
        .then(data=>{
            const postss=data.map(item=> new Post(item.id,item.title,item.body))
            this.setState(
            {
                posts:postss
            });
        })
        .catch(err=>console.log(err));
    }
    render(){
        return(
            <>
                <h2>Post</h2>
                {this.state.posts.map((post)=>(
                    <div key={post.id}><h4>title: {post.title} <br></br> Body : {post.body}</h4></div>
                ))}
            </>
        )
    }
    componentWillUnmount(){
        
    }
}

export default Posts;