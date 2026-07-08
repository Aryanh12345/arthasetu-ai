import axios from "axios";

const api = axios.create({

    baseURL:"http://localhost:8080/api"

});

export const getAIRecommendation = (score)=>

    api.get(`/ai-recommendation/${score}`);