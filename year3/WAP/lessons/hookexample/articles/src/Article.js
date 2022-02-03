import react, { useState, useEffect } from 'react';

const Article = (props) => {
  const articles = props.articles.map((article, index) => {
    return (
      <div key={index} className="block">
        <h1>{article.title}</h1>
        <p>{article.body}</p>
        <p>{article.author}</p>
        <button onClick={() => props.handleDelete(article.id)}>Delete article {article.id}</button>
      </div>
    )
  })
  return <div className="article-wrapper">{articles}</div>;
}

export default Article;