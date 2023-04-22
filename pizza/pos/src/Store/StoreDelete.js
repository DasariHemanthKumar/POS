import React, { useState,useEffect } from "react";
import { Container ,Paper,Button} from '@material-ui/core';
import FormLabel from '@mui/joy/FormLabel';
import FormControl from '@mui/material/FormControl';
import axios from 'axios';
import { Redirect } from 'react-router-dom'


function DeleteFood() {
  const [storeid, setstoreId] = useState('');
  const [sid, siderror] = useState('');
  const[id,setid]=useState('');
  const [redirect, setRedirect] = useState('');
 

  const handleDelete = () => {
    if (!sid) {
        siderror('Store Id is required.');
    } else {
        siderror('');
    }
  
    if (id) {
    alert('Data deleted successfully!');
    axios.delete(`http://localhost:8080/admin/deletestore/${id}`)
      .then(response => {
        console.log(response.data);
        setid(''); // clear input field after successful deletion
      })
      .catch(error => {
        console.log(error);
      });
    }
  };

  if (redirect) {
    return <Redirect to={redirect} />;
  }

 
const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
  return (<div>
 
    <Container>
        <Paper elevation={4} style={paperStyle}>

        
        <FormControl sx={{ m: 0, minWidth: 200 }} style={{marginLeft:"23%"}}>
        <FormLabel style={{fontSize:"25px"}}>DELETE pIZAHA STORE DETAILS...</FormLabel>
        </FormControl>
    <form onSubmit={handleDelete} style={{ 
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        marginTop: "20px"
      }}>
        <FormControl sx={{ m: 1, minWidth: 250 }}>
        <FormLabel style={{fontSize:"17px"}}>Store Id</FormLabel>
        <input type="text" value={storeid}
          onChange={(e)=>setstoreId(e.target.value)}/>
{sid && <span style={{color:'red'}}>{sid}</span>}
      </FormControl>
    

     <FormControl sx={{ m: 1, minWidth: 50 }}>
      <Button  variant="contained" color="primary" onClick={handleDelete}>Delete</Button>
      </FormControl>
      
    </form>
    </Paper>
    </Container>
    </div>
  );
}

export default DeleteFood;