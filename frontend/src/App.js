import React, { useEffect, useState } from "react";
import axios from "axios";
import Header from "./components/Header";
import Features from "./components/Features";
import "./App.css";

function App() {
  const [data, setData] = useState(null);

  useEffect(() => {
    axios.get("http://localhost:8080/api/content")
      .then(res => setData(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div className="App">
      {data && (
        <>
          <Header heading={data.heading} subheading={data.subheading} ctaText={data.ctaText} />
          <Features features={data.features} />
        </>
      )}
    </div>
  );
}

export default App;