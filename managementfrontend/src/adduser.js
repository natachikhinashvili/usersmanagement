import api from './api/axiosConfig';
import React, { useState } from 'react';

function Adduser() {

  const [formData, setFormData] = useState({});

  async function handleSubmit(event){
    event.preventDefault();        
    try {
            const response = await api.post('/api/add', formData);
            console.log('Server response:', response.data);
            // You can handle the response data here
        } catch (error) {
            console.error('Error:', error);
        }
  }

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

    return (
        <div id="postcontainer">
            <form method="post">
                <label>name</label>
                <input name="name" onChange={handleChange}></input>
                <label>language</label>
                <input name="language" onChange={handleChange}></input>
                <button onClick={handleSubmit}>submit</button>
            </form>
        </div>
    );
}

export default Adduser;