import Header from "../components/Header";
import ScoreCard from "../components/ScoreCard";
import FinancialHealthCard from "../components/FinancialHealthCard";
import StrengthCard from "../components/StrengthCard";
import RecommendationCard from "../components/RecommendationCard";

export default function Dashboard() {
  return (
    <div className="min-h-screen bg-[#111827] text-white p-8">

      <Header />

      <div
        style={{
          display: "grid",
          gridTemplateColumns: "repeat(2,1fr)",
          gap: "20px",
          marginTop: "40px"
        }}
      >
        <ScoreCard score={785} />

        <FinancialHealthCard />

        <StrengthCard />

        <RecommendationCard />
      </div>

    </div>
  );
}