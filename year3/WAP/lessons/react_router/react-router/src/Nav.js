import React from "react";
import "./App.css";
import { Link } from "react-router-dom";

function About() {
  const navStyle = {
    color: "white",
  };

  return (
    <nav>
      <Link style={navStyle} to="/">
        <h3>Logo</h3>
      </Link>

      <ul className="nav-links">
        <Link style={navStyle} to="/about">
          <li>About</li>
        </Link>
        <Link style={navStyle} to="/shop">
          <li>Shop</li>
        </Link>
      </ul>
    </nav>
  );
}

export default About;
