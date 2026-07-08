import axios from "axios";

const BASE_URL = "http://localhost:8080/api";

export const registerUser = (data) =>
    axios.post(`${BASE_URL}/users`, data);

export const getUsers = () =>
    axios.get(`${BASE_URL}/users`);