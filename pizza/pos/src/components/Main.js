// import React from 'react'

// const Main = () => {
//   return (
//     <div>Main

        
//     </div>
//   )
// }

// export default Main
import React, { Component } from "react";
import { Route, Routes } from "react-router-dom";
import Login from "./Login";
import Header from "./Header";
import First from "./First";
import Footer from "./Footer";
export class Main extends Component {
    render() {
      return (
        <div>

    {/* <First />  */}
    <Header/>
    <Footer/>
          {/* <Routes>
            <Route path="/" element={<First />} />
            <Route path="/" element={<Header />} />
            <Route path="/Footer" element={<Footer />} />

          </Routes> */}
        </div>
      );
    }
  }

  export default Main;