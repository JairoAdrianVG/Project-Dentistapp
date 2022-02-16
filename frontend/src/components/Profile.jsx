import React from "react";
import { useAuth0 } from "@auth0/auth0-react";
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const Profile = () =>{
    const {user, isAuthenticated} = useAuth0();
    const {logout} = useAuth0();

    console.log(user);

    return(
        isAuthenticated && (
            <div>
                <Card style={{ width: '30%' }}>
                        <Card.Header><h6>{user.name} </h6></Card.Header>
                        <Card.Body>

                        <Card.Text>
                        <img src={user.picture} alt={user.name}></img> <br /> Email: {user.email}
                        </Card.Text>
                        </Card.Body>
                    </Card>
                    <br />
                    <Button size="sm" variant="danger" onClick={() => logout({returnTo: window.location.origin})}>Logout</Button>
            </div>
        )
    );
};

export default Profile;