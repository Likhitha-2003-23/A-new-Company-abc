import React from "react";
import "./Features.css";

function Features({ features }) {
  return (
    <section className="features">
      {features.map((feature, index) => (
        <div key={index} className="feature-card">
          <h3>{feature.title}</h3>
          <p>{feature.description}</p>
        </div>
      ))}
    </section>
  );
}

export default Features;