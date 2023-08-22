import axios from 'axios';

export default axios.create({
    baseURL: 'http://localhost:8080/',
    headers: {
    'ngrok-skip-browser-warning': true,
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE'}
});