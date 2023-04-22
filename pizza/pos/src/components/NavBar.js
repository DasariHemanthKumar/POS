import React,{Component} from 'react'
import "./NavbarStyles.css";
import pizza from "./../images/pizza.png";

import { Link } from 'react-router-dom'
export class NavBar extends Component
{
    state ={ clicked: false};
    handleclick =()=>{
        this.setState({clicked:
        !this.state.clicked})
    }
render(){
    return(
        <nav>
            <Link to="Main">
            <img src={pizza} alt="pizza" className="profile"/>
            
            </Link>
            <div>
                <ul id='navbar'className={this.state.clicked ? "#navbar active" : "#navbar"} >
                    {/* <li><a className='active' href='index.html' > Home</a></li> */}
                    <li>
                    <Link to="PizzaOrderingSystem">    <a href='Menu' > Menu</a>    </Link>
                        </li>
                  <Link to="Login">  <li><a href='login' > Login</a></li> </Link>
                    {/* <li><a href='Contact' > Contact</a></li> */}
                </ul>
            </div>
            <div id='mobile' onClick={this.handleclick}>
                <i id='bar' className={this.state.clicked ? 'fas fa-times':'fas fa-bars'}></i>
                
            </div>
      </nav>
    )
}
}
