import React,{Component} from "react";
import "./Footer.css";
export class Footer extends Component{
render(){
    return(<div className="footer">
        <div className="sub-footer">
        <div className="top">
            <div>
                <h1>PIZZA</h1>
                <p>Choose your favourite destination.</p>
            </div>
            <div>
                <a href="/">
                    <i className="fa-brands fa-facebook-square"></i>
                </a>
                <a href="/">
                    <i className="fa-brands fa-instagram-square"></i>
                </a>
                <a href="/">
                    <i className="fa-brands fa-whatsapp-square"></i>
                </a>
                <a href="/">
                    <i className="fa-brands fa-twitter-square"></i>
                </a> 
               
            </div>
            
        </div>
        <div className="bottom">
            <div>
                <h4>Communitity</h4>
                <a href="/">GitHub</a>
                <a href="/">Issues</a>
                <a href="/">Twitter</a>
                <a href="/"></a>
            </div>
            <div>
                <h4>Help</h4>
                <a href="/">Support</a>
                <a href="/">Troubleshouting</a>
                <a href="/">Contact Us</a>
                <a href="/"></a>
            </div>
            <div>
                <h4>Others</h4>
                <a href="/">Terms of Service</a>
                <a href="/">Privacy Policy</a>
                <a href="/">License</a>
                
            </div>
        </div>
        </div>

    </div>)
}
}
export default Footer