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

  const data = [

    { month: "Jan", score: 620 },

    { month: "Feb", score: 655 },

    { month: "Mar", score: 690 },

    { month: "Apr", score: 720 },

    { month: "May", score: 760 },

    {
      month: "Current",
      score: dashboard.trustScore
    }

  ];

  return (

    <div
      style={{
        background:"#1f2937",
        padding:"25px",
        borderRadius:"18px"
      }}
    >

      <h2>Trust Score Progress</h2>

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