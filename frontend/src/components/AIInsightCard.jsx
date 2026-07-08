export default function AIInsightCard() {
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
        AI Insights
      </h2>

      <ul
        style={{
          lineHeight: "2",
          fontSize: "18px",
        }}
      >
        <li>✅ Savings behaviour improved this month.</li>

        <li>✅ Utility payments are always on time.</li>

        <li>📈 Predicted Trust Score next month: <b>807</b></li>

        <li>💰 Investing ₹500/month can increase your score to <b>830+</b></li>

        <li>🎯 Financial discipline is above average.</li>
      </ul>
    </div>
  );
}