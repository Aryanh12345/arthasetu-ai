import axios from "axios";

const api = axios.create({
    baseURL: "http://localhost:8080/api"
});

export const getActionPlan = (score) =>
    api.get(`/action-plan/${score}`);