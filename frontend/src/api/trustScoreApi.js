import axios from "axios";

const BASE_URL = "http://localhost:8080/api";

export const getTrustScore = () =>
    axios.get(`${BASE_URL}/trust-score`);