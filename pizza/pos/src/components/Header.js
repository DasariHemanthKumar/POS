import React,{Component} from "react";
import { Link } from "react-router-dom";
import './Header.css';

export class Header extends Component{
render(){
    return(<div id="main">
        <div className="header-heading">
            <h3>It's Great Time For A Good Taste Of Pizza</h3>
            <h1><span>PIZZA</span> FOR<br/> WEEK</h1>

            <div className='header-btns'>
            <Link to="PizzaOrderingSystem">  <a href='order' className="header-btn">Order Now</a> </Link>
            </div>
{/* <div className="header-btn">
    <Link to="Login"><button>Login</button></Link>
</div> */}
        </div>
    </div>)
}
}
export default Header