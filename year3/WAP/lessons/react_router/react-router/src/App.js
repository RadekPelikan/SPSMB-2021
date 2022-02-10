import "./App.css";
import Nav from "./Nav";
import About from "./pages/About";
import Shop from "./pages/Shop";
import Home from "./pages/Home";
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Nav />
        <Routes>
          <Route exact index element={<Home />} />
          <Route path="about" element={<About />} />
          <Route path="shop" element={<Shop />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
