import React from 'react';
import Navigation from './Component/Navigation';
import { Route, Switch } from 'react-router-dom';
import ListDepartment from './Component/ListDepartment';
import ListEmployee from './Component/ListEmployee';
import Department from './Component/Department';
import Employee from './Component/Employee';


const Home=()=>{
  return(
    <>
    <h4>Employee Management System</h4>
    <p>Employee Management System (EMS) is a software application or system designed to streamline and automate various aspects of managing employees within an organization. It helps businesses effectively handle tasks related to human resource management, employee information, payroll, attendance tracking, performance evaluation, and more.</p>
    </>
  )
}
function App() {
  return (
  <>
  <Navigation/>
  <h1 className="text-danger text-center">Employee Management System</h1>
  <hr/>
  
  <Switch>
    <Route exact path = "/home"><Home/></Route>
    <Route exact path = "/listdepartment"><ListDepartment/></Route>
    <Route exact path = "/listemployee"><ListEmployee/></Route>
    <Route exact path = "/edit-department/:id"><Department/></Route>
    <Route exact path = "/departments"><ListDepartment/></Route>
    <Route exact path = "/add-department"><Department/></Route>
    <Route exact path = "/add-employee"><Employee/></Route>
    <Route exact path = "/edit-employee/:id"><Employee/></Route>
    <Route exact path = "/employee"><ListEmployee/></Route>
  </Switch>
  </>
  );
}

export default App;
