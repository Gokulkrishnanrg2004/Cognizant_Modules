
import React from "react";
import "./App.css";
import Skeleton from "./components/Skeleton";
import { samples } from "./data/samples";

function App() {
  const showBooks = true;
  const showBlog = true;
  const showCourse = true;

  return (
    <div className="App">
      <div className="container">
        {showBooks && (
          <Skeleton title="Book Details">
            <ul>
              {samples.books.map((book) => (
                <div key={book.id}>
                  <h3>{book.bname}</h3>
                  <h4>{book.price}</h4>
                </div>
              ))}
            </ul>
          </Skeleton>
        )}

        {showBlog && (
          <Skeleton title="Blog Details">
            <div>
              <h3>{samples.blog.title}</h3>
              <p>{samples.blog.author}</p>
              {samples.blog.content.map((line, index) => (
                <p key={index}>{line}</p>
              ))}
            </div>
          </Skeleton>
        )}

        {showCourse && (
          <Skeleton title="Course Details">
            <div>
              {samples.courses.map((course, index) => (
                <p key={index}>{course}</p>
              ))}
            </div>
          </Skeleton>
        )}
      </div>
    </div>
  );
}

export default App;
