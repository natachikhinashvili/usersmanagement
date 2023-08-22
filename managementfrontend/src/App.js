import './App.css';
import api from './api/axiosConfig';
import {useState, useEffect} from 'react';

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
      <div>
        <h1>All users</h1>
        {users && users.map(user => <p key={user.id}>{user.name}</p>)}
      </div>
      <h2>Add user</h2>
      <div id='formcontainer'>
        <form>
          <label>name</label>
          <input></input>
          <label>language</label>
          <input></input>
          <button>submit</button>
        </form>
      </div>
    </div>
  );
}

export default App;
