import './css/App.css';
import React, { useState } from 'react';

const App = () => {
  const [text, setText] = useState("");

  const handleForm = (event) => {
    event.preventDefault();
    const {text} = event.target;
    setText(text.value)
  }

  return (
    <div className="App">
      <form onSubmit={handleForm}>
        <label>
          Name:
        </label>
        <input type="text" name="text"/>
        <input type="submit" value="Submit" />
      </form>
      <p>{text}</p>
    </div>
  );
}

export default App;
