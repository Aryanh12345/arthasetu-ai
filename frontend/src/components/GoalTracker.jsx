export default function GoalTracker({ dashboard }) {

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

        <h2>Financial Goals</h2>

        <p>Loading...</p>

      </div>

    );

  }

  const trustProgress = Math.min(
    (dashboard.trustScore / dashboard.actionPlan.targetScore) * 100,
    100
  );

  const emergencyProgress =
    dashboard.trustScore >= 800 ? 85 :
    dashboard.trustScore >= 700 ? 65 :
    40;

  const sipProgress =
    dashboard.trustScore >= 800 ? 75 :
    dashboard.trustScore >= 700 ? 55 :
    30;

  return (

    <div
      style={{
        background: "#1f2937",
        borderRadius: "18px",
        padding: "30px",
        color: "white"
      }}
    >

      <h2>Financial Goals</h2>

      <br />

      <div>

        <strong>Emergency Fund</strong>

        <br />

        <progress
          value={emergencyProgress}
          max="100"
          style={{
            width: "100%"
          }}
        />

        <p>{emergencyProgress}%</p>

      </div>

      <br />

      <div>

        <strong>SIP Goal</strong>

        <br />

        <progress
          value={sipProgress}
          max="100"
          style={{
            width: "100%"
          }}
        />

        <p>{sipProgress}%</p>

      </div>

      <br />

      <div>

        <strong>Trust Score Goal</strong>

        <br />

        <progress
          value={trustProgress}
          max="100"
          style={{
            width: "100%"
          }}
        />

        <p>

          {dashboard.trustScore}

          {" / "}

          {dashboard.actionPlan.targetScore}

        </p>

      </div>

      <br />

      <p>

        <strong>Estimated Completion:</strong>

        {" "}

        {dashboard.actionPlan.estimatedMonths} Months

      </p>

    </div>

  );

}