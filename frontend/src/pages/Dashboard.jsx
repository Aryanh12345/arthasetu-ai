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
        background: "#111827",
        minHeight: "100vh",
        color: "white",
        padding: "30px",
      }}
    >
      <Header />

      <div
        style={{
          display: "grid",
          gridTemplateColumns: "repeat(2,1fr)",
          gap: "25px",
          marginTop: "40px",
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
  );
}