export default function FinancialHealthCard() {

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

      <h3>Savings</h3>

      <progress
        value="82"
        max="100"
        style={{
          width: "100%",
          height: "18px",
        }}
      />

      <br />
      <br />

      <h3>Income Stability</h3>

      <progress
        value="91"
        max="100"
        style={{
          width: "100%",
          height: "18px",
        }}
      />

      <br />
      <br />

      <h3>Utility Payments</h3>

      <progress
        value="88"
        max="100"
        style={{
          width: "100%",
          height: "18px",
        }}
      />

      <br />
      <br />

      <h3>Overall Health</h3>

      <h1
        style={{
          color: "#22c55e",
        }}
      >
        87%
      </h1>

    </div>
  );

}