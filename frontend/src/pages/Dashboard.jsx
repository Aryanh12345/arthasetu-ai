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

import { getDashboard } from "../api/dashboardApi";

export default function Dashboard() {

    const [dashboard, setDashboard] = useState(null);

    const userId = localStorage.getItem("userId");

    useEffect(() => {

        if (!userId) return;

        getDashboard(userId)

            .then((res) => {

                setDashboard(res.data);

            })

            .catch((err) => {

                console.log(err);

            });

    }, [userId]);

    if (!dashboard) {

        return (

            <div
                style={{
                    background: "#111827",
                    color: "white",
                    height: "100vh",
                    display: "flex",
                    justifyContent: "center",
                    alignItems: "center",
                    fontSize: "30px"
                }}
            >

                Loading Dashboard...

            </div>

        );

    }

    return (

        <div
            style={{
                display: "flex",
                background: "#111827",
                color: "white",
                minHeight: "100vh"
            }}
        >

            <Sidebar />

            <div
                style={{
                    flex: 1,
                    padding: "35px"
                }}
            >

                <Header />

                <h2>

                    Welcome,

                    {" "}

                    {dashboard.user.fullName}

                </h2>

                <br />

                <div
                    style={{
                        display: "grid",
                        gridTemplateColumns: "repeat(2,1fr)",
                        gap: "25px"
                    }}
                >

                    <ScoreCard
                        score={dashboard.trustScore}
                    />

                    <FinancialHealthCard
                        health={dashboard.financialHealth}
                    />

                    <RecommendationCard
                        data={dashboard.recommendation}
                    />

                    <RoadmapCard
                        data={dashboard.actionPlan}
                    />

                    <StrengthCard />

                    <TrustScoreTrend />

                    <AIInsightCard />

                    <GoalTracker />

                    <AIFinancialCoach />

                </div>

            </div>

        </div>

    );

}