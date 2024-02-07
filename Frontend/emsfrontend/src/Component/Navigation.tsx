import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import {faHouse } from '@fortawesome/free-solid-svg-icons' 
const Navigation:React.FC=()=>{
    return(
        
        <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="/home"><FontAwesomeIcon icon={faHouse} />&nbsp;Home</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/listemployee">Employee</Nav.Link>
            <Nav.Link href="/listdepartment">Department</Nav.Link>
            
          </Nav>
        </Container>
      </Navbar>
    );
}
        
    

export default Navigation;