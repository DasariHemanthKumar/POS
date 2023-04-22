import React, { useState,useEffect } from "react";
import { Container ,Paper,Button} from '@material-ui/core';
import FormLabel from '@mui/joy/FormLabel';
import FormControl from '@mui/material/FormControl';
import axios from 'axios';
import './Login.css';
import 'bootstrap';
import { Redirect } from 'react-router-dom';
import profile from "./../images/profile.jpg";
import email from "./../images/email.png";
import pass from "./../images/pass.png";


function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [redirect, setRedirect] = useState('');
  const [error, setError] = useState("");

  function handleUserIdChange(event) {
    setUsername(event.target.value);
  }

  function handlePasswordChange(event) {
    setPassword(event.target.value);
  }

  function handleSubmit(event) {
    console.log('Welcome')
    event.preventDefault();
    console.log(username+' '+password)
    axios.get(`http://localhost:8080/admin/selectUser/${username}/${password}`)
      .then(response => {
        console.log(username+' '+password)
        const data = response.data;
        if (username === 'AD-001' && password === 'AD-001') {
          setRedirect('/FoodBean');
        } else if (username === 'AD-002' && password === 'AD-002') {
          setRedirect('/Viewfood');
        } else if (username === 'AD-003' && password === 'AD-003') {
          setRedirect('/Modify');
        } else if (username === 'AD-004' && password === 'AD-004') {
          setRedirect('/Deletefood');
        } else if (username === 'AD-005' && password === 'AD-005') {
          setRedirect('/StoreAdd');
        } else if (username === 'AD-006' && password === 'AD-006') {
          setRedirect('/StoreView');
        } else if (username === 'AD-007' && password === 'AD-007') {
          setRedirect('/UpdateStore');
        } else if (username === 'AD-008' && password === 'AD-008') {
          setRedirect('/StoreDelete');
        } else {
          setError('Invalid credentials');
        }
      })
      .catch(error => console.error('Error:', error));
  }
  

  const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" };


  return ( 
<>
    {redirect && <Redirect to={redirect} />}
  
    <div className="main">
<div className="sub-main">
  <div>
    <div className="imgs">
      <div className="container-image">
        <img src={profile} alt="profile" className="profile"/>

      </div>


    </div>
    <div className='head'>
      <h1>Login Page</h1>
      {/* <form onSubmit={handleSubmit}> */}
      <form onSubmit={handleSubmit} style={{ 
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        marginTop: "20px"
      }}>
      <FormControl sx={{ m: 1, minWidth: 250 }}>
      {/* <FormLabel style={{fontSize:"15px"}}></FormLabel> */}
        <select style={{height:"40px",fontSize:"15px"}}  >
        <option value="select">-Select-</option>
          <option >Admin</option>
          <option >User</option>
         
        </select>
        </FormControl>
  
         <br/> 
      
      <div>
        <img src={email} alt="email" className="email"/>
        <input type="text" value={username} placeholder="user name" className="name" onChange={(e)=>{setUsername(e.target.value)}}/>
      </div>
      <div className="second-input">
        <img src={pass} alt="pass" className="email"/>
        <input type="password" placeholder="Password" className="name" value={password} onChange={(e)=>{setPassword(e.target.value)}}/>
      </div>
     
     <div className="login-button">
     <button onClick={handleSubmit}>Login</button>
     </div>
     

  
      
       <p className="link">
         <a href="#">Forgot password?</a>  Or  <a href="#">Sign Up</a>
       </p>
      
       </form>
    </div>
  </div>
  

</div>
</div>

  </>

);
}

export default Login;


//     <div>
      
//     <Container>
      
//         <Paper elevation={4} style={paperStyle} variant="outlined">
        


        
//         <FormControl sx={{ m: 0, minWidth: 200 }} style={{marginLeft:"45%"}}>
//         <FormLabel style={{fontSize:"25px"}}>Login</FormLabel>
//         </FormControl>
    // <form onSubmit={handleSubmit} style={{ 
    //     display: "flex",
    //     flexDirection: "column",
    //     alignItems: "center",
    //     marginTop: "20px"
    //   }}>

// {error && <div style={{ color: 'red' }}>{error}</div>}

  //  <FormControl sx={{ m: 1, minWidth: 250 }}>
  //     <FormLabel style={{fontSize:"15px"}}>User Type</FormLabel>
  //       <select style={{height:"40px",fontSize:"15px"}}  >
  //       <option value="select">Select</option>
  //         <option >Admin</option>
  //         <option >user</option>
         
  //       </select>
  //       </FormControl>

//         <FormControl sx={{ m: 1, minWidth: 250 }}>
//         <FormLabel style={{fontSize:"17px"}}>Username</FormLabel>
//         <input type="text" value={username}
//           onChange={handleUserIdChange}/>

//       </FormControl>
    
//       <FormControl sx={{ m: 1, minWidth: 250 }}>
//         <FormLabel style={{fontSize:"17px"}}>Password</FormLabel>
//         <input
//           type="password"
//           value={password}
//           onChange={handlePasswordChange}
//         />
//      </FormControl>

//      <FormControl sx={{ m: 1, minWidth: 50 }}>
//       <Button  variant="contained" color="primary" onClick={handleSubmit}>Login</Button>
//       </FormControl>
      
//     </form>
//     </Paper>
//     </Container>
//     </div>
