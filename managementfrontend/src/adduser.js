import { Form } from 'react-router-dom';
import api from './api/axiosConfig';

function Adduser() {
    return (
        <div>
            <Form method="post">
                <label>name</label>
                <input name="name"></input>
                <label>language</label>
                <input name="language"></input>
                <button>submit</button>
            </Form>
        </div>
    );
}

export default Adduser;

export async function action(data){
    api.post("/api/add", {
        data
      })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
}