export default function ActionPlanCard({ plan }) {

  if (!plan) return null;

  return (
    <div
      style={{
        background: "#1f2937",
        borderRadius: "18px",
        padding: "25px",
        color: "white"
      }}
    >
      <h2>AI Financial Action Plan</h2>

      <p>
        Current Score: <b>{plan.currentScore}</b>
      </p>

      <p>
        Target Score: <b>{plan.targetScore}</b>
      </p>

      <p>
        Estimated Time: <b>{plan.estimatedMonths} months</b>
      </p>

      <h3>Recommended Actions</h3>

      <ul>
        {plan.actionItems.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
  );
}