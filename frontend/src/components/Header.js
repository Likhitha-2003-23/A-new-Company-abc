import React from "react";
import "./Header.css";

function Header({ heading, subheading, ctaText }) {
  const [part1, part2] = heading.split("with");

  return (
    <section className="header">
      <nav className="navbar">
        <div>About</div>
        <div>Services ▼</div>
      </nav>
      <div className="hero">
        <h1>
          {part1}
          <br />
          <span className="highlight">with {part2}</span>
        </h1>
        <p>{subheading}</p>
        <button>{ctaText}</button>
      </div>
    </section>
  );
}

export default Header;