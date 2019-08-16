import React, { Component } from "react";
import "./form.css";

class Form extends Component {
    state = {
        counter: 1, 
        name: 'dog',
        color: 'white',
        size: 'fat'
    };


  render() {
    return <div>
        <h1>{this.state.size}</h1>
        <h1>{this.state.color}</h1>

    </div>;
  }
}

export default Form;

