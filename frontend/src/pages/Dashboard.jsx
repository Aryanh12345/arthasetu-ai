import { useEffect, useState } from "react";

import Sidebar from "../components/Sidebar";
import Header from "../components/Header";

import ScoreCard from "../components/ScoreCard";
import FinancialHealthCard from "../components/FinancialHealthCard";
import StrengthCard from "../components/StrengthCard";
import RecommendationCard from "../components/RecommendationCard";
import AIInsightCard from "../components/AIInsightCard";
import RoadmapCard from "../components/RoadmapCard";
import TrustScoreTrend from "../components/TrustScoreTrend";
import AIFinancialCoach from "../components/AIFinancialCoach";
import GoalTracker from "../components/GoalTracker";

import { getTrustScore } from "../api/trustScoreApi";

export default function Dashboard() {

    const [score, setScore] = useState(785);

    useEffect(() => {

        getTrustScore()
            .then((res) => setScore(res.data.score))
            .catch(() => console.log("Backend unavailable"));

    }, []);

    return (

        <div
            style={{
                display: "flex",
                background: "#111827",
                color: "white",
                minHeight: "100vh"
            }}
        >

            <Sidebar/>

            <div
                style={{
                    flex: 1,
                    padding: "35px"
                }}
            >

                <Header/>

                <div
                    style={{
                        display: "grid",
                        gridTemplateColumns: "repeat(2,1fr)",
                        gap: "25px"
                    }}
                >

                    <ScoreCard score={score}/>

                    <FinancialHealthCard/>

                    <StrengthCard/>

                    <RecommendationCard/>

                    <TrustScoreTrend/>

                    <AIInsightCard/>

                    <RoadmapCard/>

                    <GoalTracker/>

                    <AIFinancialCoach/>

                </div>

            </div>

        </div>

    );

}