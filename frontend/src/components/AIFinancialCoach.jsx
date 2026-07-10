export default function AIFinancialCoach({ dashboard }) {

  if (!dashboard) {

    return (

      <div
        style={{
          background:"#1f2937",
          borderRadius:"18px",
          padding:"30px",
          color:"white"
        }}
      >
        Loading...
      </div>

    );

  }

  const user = dashboard.user;

  const action = dashboard.actionPlan.actionItems[0];

  return (

    <div
      style={{
        background:"#1f2937",
        borderRadius:"18px",
        padding:"30px",
        color:"white"
      }}
    >

      <h2
        style={{
          fontSize:"30px",
          marginBottom:"25px"
        }}
      >
        🤖 AI Financial Coach
      </h2>

      <p
        style={{
          fontSize:"18px",
          lineHeight:"2"
        }}
      >

        Hello,

        <strong> {user.fullName}</strong>

        <br/><br/>

        Your current Trust Score is

        <strong> {dashboard.trustScore}</strong>.

        <br/><br/>

        Your financial health is

        <strong> {dashboard.financialHealth}</strong>.

        <br/><br/>

        Today's highest priority:

        <br/>

        ✔ {action}

        <br/><br/>

        Target Trust Score:

        <strong> {dashboard.actionPlan.targetScore}</strong>

        <br/>

        Estimated Time:

        <strong> {dashboard.actionPlan.estimatedMonths} Months</strong>

      </p>

    </div>

  );

}