import react, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import './index.css'

const App = () => {

  const [cookies, updateCookies] = useState(0);

  useEffect(() => {
    document.title = `Cookies: ${cookies}`
  })

  return (
    <div className="wrapper">
      <img id="cookie" src="/cookie.png" alt="cookie.png" onClick={() => updateCookies(cookies + 1)} />
      <p id="counter">Cookies: {cookies}</p>
    </div>
  )

}

ReactDOM.render(<App />, document.getElementById("root"));