import react, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import Article from './Article';
import './index.css';

const App = () => {

  const [articles, setArticles] = useState([
    { title: "a", body: "Lorem a", author: "Opicka 1", id: 0 },
    { title: "b", body: "Lorem b", author: "Opicka 2", id: 2 },
    { title: "c", body: "Lorem c", author: "Opicka 3", id: 3 },
  ]);

  const handleDelete = (id) => {
    const newArticles = articles.filter(article => article.id !== id);
    setArticles(newArticles);
  }

  useEffect(()=> {
    console.log("article deleted or dom loaded")
  })

  return (
    <div className="wrapper">
      <Article articles={articles} handleDelete={handleDelete} />
    </div>
  )
}

ReactDOM.render(<App />, document.getElementById("root"));