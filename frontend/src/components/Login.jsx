import React from "react";
import Button from 'react-bootstrap/Button';
import { useAuth0 } from "@auth0/auth0-react";
import Spinner from 'react-bootstrap/Spinner'



const Login = () =>{
    const {loginWithRedirect} = useAuth0();

    const {user, isAuthenticated, isLoading} = useAuth0();

    if(isLoading){
      return (
      <div className="container">
                    <br/>
          <Spinner animation="grow" variant="info" />
          <Spinner animation="grow" variant="success" />
          <Spinner animation="grow" variant="warning" />
      </div>)

  }


  if(isAuthenticated) {
    return(
      <div>
        <h2>Welcome, {user.name}</h2>
        <br/>
            <img src={user.picture} alt={user.name}></img>
            <br/>
            <p>Email: {user.email}</p>
            <br />
            <Button href='./home' variant="info">Continue to App</Button>
      </div>) 
      } else{
        return(
          <div>
              <br/>
              <h1>Welcome, Login to Continue</h1>
              <br/>
          <img src='https://images.vexels.com/media/users/3/152018/isolated/preview/c728796e46fb111cce09ffd324a40949-icono-colorido-diente.png'></img>
          <br/>
          <br/>
          <Button onClick={() => loginWithRedirect()} size="lg">Login</Button>
          </div>
        )
      }

}

export default Login;