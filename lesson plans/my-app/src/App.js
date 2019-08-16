import React from "react";
import "./App.css";
// import Form from './form.jsx'
import { Button, Icon, Card } from "antd";

const picture = "https://i.redd.it/eexdukzbxkg31.jpg";

function App() {
  return (
    <div className="App">
      <img className="dog" src={picture} height="175" width="175" />
      <h1>Helo my naem is dogo</h1>
      <a href={picture}>
        <Button className="cat" type="danger">
          Cat
        </Button>
      </a>
    </div>
  );
}

export default App;
