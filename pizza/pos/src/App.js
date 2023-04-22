import './App.css';
import FoodBean from './Food/FoodBean';
import React from 'react';
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register';
import ProfileBean from './components/ProfileBean';
import PizzaOrderingSystem from './components/PizzaOrderingSystem';
import DeleteFood from './Food/Deletefood';
import StoreAdd from './Store/StoreAdd';
import Creditcardbean from './components/Creditcardbean';
import Main from './components/Main';
import First from './components/First';
    function App() {
        return (
         
            <Router>
                <First/>
                <Switch>
                <Route exact path="/"><Main/> </Route>

                    {/* <Route exact path="/main"  element={<Main />}/> */}
                    <Route path="/login"><Login/></Route>
                   

                    {/* AddFoodBean AD001-AD004 */}
                    <Route path="/FoodBean"> <FoodBean/>
                    </Route>
                    
                    <Route path="/DeleteFood">
                        <DeleteFood/>
                    </Route>
                    <Route path="/Login">
                    <Login/>
                    </Route>
                    <Route path="/Register">
                        <Register/>
                    </Route>
                    
                    {/* pizzahaStoreAdd AD005-AD008*/}

                    <Route path="/StoreAdd">
                        <StoreAdd/>
                    </Route>
                     

                    <Route path="/Creditcardbean">
                        <Creditcardbean/>
                    </Route>
                    








                    <Route path="/ProfileBean">
                        <ProfileBean/>
                    </Route>
                    <Route path="/PizzaOrderingSystem">
                    <PizzaOrderingSystem/>
                    </Route>
                </Switch>
            </Router>
    
   
        )
    }
export default App;
