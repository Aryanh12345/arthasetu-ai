export default function FinancialHealthCard({ health }) {

  const getColor = () => {

    switch (health) {

      case "Excellent":
        return "#22c55e";

      case "Good":
        return "#3b82f6";

      case "Fair":
        return "#f59e0b";

      default:
        return "#ef4444";

    }

  };

  const getPercentage = () => {

    switch (health) {

      case "Excellent":
        return 95;

      case "Good":
        return 82;

      case "Fair":
        return 65;

      default:
        return 40;

    }

  };

  const percentage = getPercentage();

  return (

    <div
      style={{
        background: "#1f2937",
        borderRadius: "18px",
        padding: "30px",
      }}
    >

      <h2>Financial Health</h2>

      <br />

      <progress
        value={percentage}
        max="100"
        style={{
          width: "100%",
          height: "20px",
        }}
      />

      <br />
      <br />

      <h3>Status</h3>

      <h1
        style={{
          color: getColor()
        }}
      >
        {health}
      </h1>

      <br />

      <h3>Overall Health Score</h3>

      <h2>{percentage}%</h2>

    </div>

  );

}