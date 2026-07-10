export default function RoadmapCard({ data }) {

  if (!data) {

    return (
      <div
        style={{
          background: "#1f2937",
          borderRadius: "15px",
          padding: "20px",
          color: "white",
        }}
      >
        <h2>Financial Roadmap</h2>
        <p>No roadmap available.</p>
      </div>
    );

  }

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

      <p>

        <strong>Current Score:</strong>

        {" "}

        {data.currentScore}

      </p>

      <br />

      <p>

        <strong>Target Score:</strong>

        {" "}

        {data.targetScore}

      </p>

      <br />

      <p>

        <strong>Estimated Time:</strong>

        {" "}

        {data.estimatedMonths} Months

      </p>

      <br />

      <h3>Action Plan</h3>

      <ul>

        {

          data.actionItems.map((item, index) => (

            <li
              key={index}
              style={{
                marginBottom: "10px",
              }}
            >
              {item}
            </li>

          ))

        }

      </ul>

    </div>

  );

}