export default function AIInsightCard({ dashboard }) {

    if (!dashboard) {

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

                <h2>AI Insights</h2>

                <p>No insights available.</p>

            </div>

        );

    }

    const nextScore = Math.min(
        dashboard.trustScore + 25,
        900
    );

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

                <li>

                    Current Trust Score:

                    <b> {dashboard.trustScore}</b>

                </li>

                <li>

                    Financial Health:

                    <b> {dashboard.financialHealth}</b>

                </li>

                <li>

                    Predicted Next Score:

                    <b> {nextScore}</b>

                </li>

                <li>

                    Target Score:

                    <b> {dashboard.actionPlan.targetScore}</b>

                </li>

                <li>

                    Estimated Time:

                    <b> {dashboard.actionPlan.estimatedMonths} Months</b>

                </li>

            </ul>

        </div>

    );

}