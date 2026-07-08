import { CircularProgressbar, buildStyles } from "react-circular-progressbar";
import "react-circular-progressbar/dist/styles.css";

export default function ScoreCard({ score }) {

  const percentage = score / 10;

  return (
    <div
      style={{
        background: "#1f2937",
        borderRadius: "18px",
        padding: "30px",
        textAlign: "center",
      }}
    >
      <h2
        style={{
          marginBottom: "30px",
          fontSize: "28px",
        }}
      >
        Trust Score
      </h2>

      <div
        style={{
          width: "230px",
          height: "230px",
          margin: "auto",
        }}
      >
        <CircularProgressbar
          value={percentage}
          text={`${score}`}
          styles={buildStyles({
            textColor: "#ffffff",
            pathColor: "#22c55e",
            trailColor: "#374151",
            textSize: "18px",
          })}
        />
      </div>

      <h2
        style={{
          marginTop: "25px",
          color: "#22c55e",
        }}
      >
        GOOD
      </h2>

      <p
        style={{
          color: "#9ca3af",
        }}
      >
        Financial Stability Level
      </p>
    </div>
  );
}