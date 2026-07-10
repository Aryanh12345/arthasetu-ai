import axios from "axios";

const api = axios.create({
    baseURL: "http://localhost:8080/api"
});

export const registerUser = (user) => {
    return api.post("/users", user);
};