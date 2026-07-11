import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  Tooltip,
  ResponsiveContainer,
  CartesianGrid
} from "recharts";

export default function TrustScoreTrend({ dashboard }) {

  if (!dashboard) {

    return (

      <div
        style={{
          background:"#1f2937",
          padding:"25px",
          borderRadius:"18px",
          color:"white"
        }}
      >

        Loading...

      </div>

    );

  }

  const data = dashboard.scoreHistory.map((item, index) => ({

    month: `#${index + 1}`,

    score: item.score

  }));

  return (

    <div
      style={{
        background:"#1f2937",
        padding:"25px",
        borderRadius:"18px"
      }}
    >

      <h2>Trust Score History</h2>

      <br/>

      <ResponsiveContainer
        width="100%"
        height={300}
      >

        <LineChart data={data}>

          <CartesianGrid strokeDasharray="3 3"/>

          <XAxis dataKey="month"/>

          <YAxis/>

          <Tooltip/>

          <Line
            type="monotone"
            dataKey="score"
            stroke="#22c55e"
            strokeWidth={4}
          />

        </LineChart>

      </ResponsiveContainer>

    </div>

  );

}