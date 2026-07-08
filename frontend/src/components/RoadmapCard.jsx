export default function RoadmapCard() {
  return (
    <div
      style={{
        background: "#1f2937",
        borderRadius: "15px",
        padding: "20px",
        color: "white",
        minHeight: "260px",
      }}
    >
      <h2
        style={{
          marginBottom: "20px",
          fontSize: "28px",
        }}
      >
        Financial Roadmap
      </h2>

      <div
        style={{
          display: "flex",
          flexDirection: "column",
          gap: "18px",
          fontSize: "18px",
        }}
      >
        <span>✅ Build Emergency Fund</span>

        <span>✅ Maintain Savings</span>

        <span>➡ Increase SIP Investment</span>

        <span>➡ Diversify Investments</span>

        <span>🏆 Target Trust Score : 900+</span>
      </div>
    </div>
  );
}