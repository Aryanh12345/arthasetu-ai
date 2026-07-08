import Sidebar from "../components/Sidebar";
import Header from "../components/Header";

import ScoreCard from "../components/ScoreCard";
import FinancialHealthCard from "../components/FinancialHealthCard";
import StrengthCard from "../components/StrengthCard";
import RecommendationCard from "../components/RecommendationCard";
import AIInsightCard from "../components/AIInsightCard";
import RoadmapCard from "../components/RoadmapCard";

export default function Dashboard() {
  return (
    <div
      style={{
        display: "flex",
        background: "#111827",
        color: "white",
        minHeight: "100vh",
      }}
    >
      <Sidebar />

      <div
        style={{
          flex: 1,
          padding: "40px",
        }}
      >
        <Header />

        <div
          style={{
            display: "grid",
            gridTemplateColumns: "repeat(2,1fr)",
            gap: "25px",
          }}
        >
          <ScoreCard score={785} />

          <FinancialHealthCard />

          <StrengthCard />

          <RecommendationCard />

          <AIInsightCard />

          <RoadmapCard />
        </div>
      </div>
    </div>
  );
}