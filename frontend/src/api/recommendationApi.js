import axios from "axios";

const BASE_URL = "http://localhost:8080/api";

export const getRecommendation = (score) =>
    axios.get(`${BASE_URL}/recommendation/${score}`);