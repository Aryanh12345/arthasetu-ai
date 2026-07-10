export default function StrengthCard({ dashboard }) {

  if (!dashboard) {

    return (

      <div
        style={{
          background: "#1f2937",
          borderRadius: "18px",
          padding: "30px",
          color: "white"
        }}
      >
        Loading...
      </div>

    );

  }

  const strengths = [];

  if (dashboard.trustScore >= 800)
    strengths.push("Excellent Trust Score");

  if (
    dashboard.financialHealth === "Excellent" ||
    dashboard.financialHealth === "Good"
  )
    strengths.push("Strong Financial Health");

  dashboard.recommendation.recommendations
    .slice(0, 2)
    .forEach(item => strengths.push(item));

  return (

    <div
      style={{
        background: "#1f2937",
        borderRadius: "18px",
        padding: "30px",
        color: "white"
      }}
    >

      <h2>Top Financial Strengths</h2>

      <br />

      {

        strengths.map((item, index) => (

          <div
            key={index}
            style={{
              marginBottom: "15px"
            }}
          >

            ✅ {item}

          </div>

        ))

      }

    </div>

  );

}