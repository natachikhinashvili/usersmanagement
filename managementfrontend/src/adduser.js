import api from './api/axiosConfig';

function Adduser() {

  function handleSubmit(event){
    event.preventDefault();
  }

    return (
        <div id="postcontainer">
            <form method="post">
                <label>name</label>
                <input name="name"></input>
                <label>language</label>
                <input name="language"></input>
                <button onClick={handleSubmit}>submit</button>
            </form>
        </div>
    );
}

export default Adduser;