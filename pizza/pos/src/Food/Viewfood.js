import React, { useState,useEffect } from "react";
import { Container ,Paper,Button} from '@material-ui/core';
import FormLabel from '@mui/joy/FormLabel';
import FormControl from '@mui/material/FormControl';
import axios from 'axios';
import AD003 from "../Header/AD003";

function ViewVehicle() {
  const [foodData, setfoodData] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/admin/viewall')
      .then(response => {
        setfoodData(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

 
const paperStyle={padding:'50px 20px', width:710,margin:"20px auto"}
  return (<div>
    <AD003/>
    <Container>
     <Paper elevation={4} style={paperStyle}>
     <div>
     <FormControl sx={{ m: 0, minWidth: 200 }} style={{marginLeft:"33%"}}>
        <FormLabel style={{fontSize:"25px"}}>Food Details</FormLabel>
        </FormControl>
      <table style={{ border: '1px solid black', borderCollapse: 'collapse' }}>
        <thead>
          <tr style={{ border: '1px solid black' }}>
            <th style={{ border: '1px solid black', padding: '8px' }}>foodID</th>
            <th style={{ border: '1px solid black', padding: '8px' }}>Name</th>
       
            <th style={{ border: '1px solid black', padding: '8px' }}>Quantity </th>
            <th style={{ border: '1px solid black', padding: '8px' }}>FoodSize</th>
            <th style={{ border: '1px solid black', padding: '8px' }}>Type</th>
            <th style={{ border: '1px solid black', padding: '8px' }}>Price</th>

          </tr>
        </thead>
        <tbody>
          {setfoodData.map(food => (
            <tr key={vehicle.vehicleId} style={{ border: '1px solid black' }}>
            <td style={{ border: '1px solid black', padding: '8px' }}>{food.foodID}</td>
            <td style={{ border: '1px solid black', padding: '8px' }}>{food.name}</td>
            <td style={{ border: '1px solid black', padding: '8px' }}>{food.quantity}</td>
            <td style={{ border: '1px solid black', padding: '8px' }}>{food.foodSize}</td>
            <td style={{ border: '1px solid black', padding: '8px' }}>{food.type}</td>
            <td style={{ border: '1px solid black', padding: '8px' }}>{food.price}</td>
          </tr>
        ))}
      </tbody>
    </table>
  </div>
        
     </Paper>
    </Container>
    </div>
  );
}

export default ViewVehicle;