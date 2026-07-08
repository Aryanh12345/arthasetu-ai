import axios from "axios";

const api = axios.create({

    baseURL: "http://localhost:8080/api"

});

export const predictScenario = (data) =>

    api.post("/scenario", data);