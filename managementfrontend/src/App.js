import './App.css';
import {useState, useEffect} from 'react';
import api from './api/axiosConfig';
import Adduser from './adduser';

function App() {
  const [users, setUsers] = useState();

  const getUsers = async() => {
    try {
      const response = await api.get("api/users")
      setUsers(response.data);
    } catch(err) {
      console.log(err);
    }
  }
  useEffect(() => {
    getUsers();
  }, [])
  return (
    <div className="App">
      <h1>All users</h1>
      {users && users.map(user => <p key={user.id}>{user.name}</p>)}
      <Adduser/>
    </div>
  );
}

export default App;