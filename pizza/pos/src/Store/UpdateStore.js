import axios from 'axios';
import React, { useState,useEffect } from "react";
import { Container,Paper,Button} from '@material-ui/core';
import FormLabel from '@mui/joy/FormLabel';
import FormControl from '@mui/material/FormControl';
//import AD004 from "../Header/AD004";

function UpdateStore() {
  const[storeid, setstoreid] = useState('')
  const[name, setName] = useState('')
  const[mobileno, setmobileno] = useState('')
  const[city, setcity] = useState('')
  const[street, setstreet] = useState('')
  const[state, setstate] = useState('')
  const[pincode,setpincode] = useState('')
  const [pizzastorids, setpizzastorids] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/admin/updatestore')
      .then(response => {
        const pizzastorids = response.data.map(pizzastore => pizzastore.storeid);
        setpizzastorids(pizzastorids);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  
  const handleClick=(e)=>{
    alert('Data updated successfully!');
    const pizastoreData={name,mobileno,city,street,state,pincode}
  axios.put("http://localhost:8080/admin/updateStore", pizastoreData)
  .then(response => {
    console.log(response);
  })
  .catch(error => {
    console.log(error);
    
  });
}

const paperStyle={padding:'50px 20px', width:600,margin:"20px auto"}
  return (<div >
    <AD004/>
    <Container >
    <Paper elevation={9} style={ paperStyle} >

    <FormControl sx={{ m: 0, minWidth: 200 }} style={{marginLeft:"24%"}}>
    <FormLabel style={{fontSize:"25px"}}>UPDATE Pizaa Store DETAILS...</FormLabel>
    </FormControl>
<form onSubmit={handleClick} style={{ 
    display: "flex",flexDirection: "column",alignItems: "center",marginTop: "20px"}}>


<FormControl sx={{ m: 1, minWidth: 250 }}>
<FormLabel style={{fontSize:"17px"}}>StoreId</FormLabel>
  <select name="storeid" style={{height:'30px'}} value={storeid} onChange={(e)=>setstoreid(e.target.value)}>
     <option value="" disabled selected>Select</option>
        {pizzastorids.map(id => (
          <option key={id} value={id}>{id}</option>))}
      </select>
      </FormControl> 

    <FormControl sx={{ m: 1, minWidth: 250 }}>
    <FormLabel style={{fontSize:"17px"}}>Name</FormLabel>
    <input type="text" name="name" value={name} onChange={(e)=>setName(e.target.value)}/>
  </FormControl>
   

  <FormControl sx={{ m: 1, minWidth: 250 }}>
    <FormLabel style={{fontSize:"17px"}}>Mobile Number</FormLabel>
    <input type="number" name="mobileno" value={mobileno} 
    onChange={(e)=>setmobileno(e.target.value)}/>
 </FormControl>

  <FormControl sx={{ m: 1, minWidth: 250 }}>
    <FormLabel style={{fontSize:"17px"}}>City</FormLabel>
    <input type="text" name="city" value={city} onChange={(e)=>setcity(e.target.value)}/>
 </FormControl>

 

 <FormControl sx={{ m: 1, minWidth: 250 }}>
    <FormLabel style={{fontSize:"17px"}}>Street</FormLabel>
    <input type="text" name="street" value={street} 
    onChange={(e)=>setstreet(e.target.value)}/>
 </FormControl>

 <FormControl sx={{ m: 1, minWidth: 250 }}>
    <FormLabel style={{fontSize:"17px"}}>Pincode</FormLabel>
    <input type="number" name="pincode" value={pincode} 
    onChange={(e)=>setpincode(e.target.value)} />
 </FormControl>

 <FormControl sx={{ m: 1, minWidth: 50 }}>
  <Button  variant="contained" color="primary" type="submit">Update</Button>
  </FormControl>
  
</form>
</Paper>
</Container>
</div>
  )
}

export default UpdateStore;