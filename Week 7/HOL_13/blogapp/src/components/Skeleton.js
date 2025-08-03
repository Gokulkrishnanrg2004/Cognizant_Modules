import React from "react";

function Skeleton({ title, children }) {
  return (
    <div className="box">
      <h1 className="section-title">{title}</h1>
      {children}
    </div>
  );
}

export default Skeleton;
