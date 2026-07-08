import axios from "axios";

const api = axios.create({

    baseURL:"http://localhost:8080/api"

});

export const getTrustScore = () =>

    api.get("/trust-score");