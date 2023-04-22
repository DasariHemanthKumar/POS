import React,{Component} from "react";
import { Route, Routes } from "react-router-dom";

import { NavBar } from "./NavBar";
export class First extends Component
{
    render(){
        return(
            <div>
                <NavBar>
                {/* <Routes>
                    <Route path='/' element={<Home/>}/>
                    <Route path='about' element={<About/>}/>
                    <Route path='contact' element={<Contact/>}/>
                </Routes> */}
                </NavBar>
            </div>
        )
    }
}
export default First