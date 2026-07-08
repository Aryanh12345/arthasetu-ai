export default function Header() {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-between",
        alignItems: "center",
        marginBottom: "35px",
      }}
    >
      <div>
        <h1
          style={{
            fontSize: "42px",
            margin: 0,
          }}
        >
          Welcome Aryan 👋
        </h1>

        <p
          style={{
            color: "#9ca3af",
            marginTop: "8px",
          }}
        >
          Your AI Financial Intelligence Dashboard
        </p>
      </div>

      <div
        style={{
          background: "#1f2937",
          padding: "15px 25px",
          borderRadius: "12px",
        }}
      >
        🔔 No Alerts
      </div>
    </div>
  );
}