export default function Sidebar() {
  const menu = [
    "Dashboard",
    "Trust Score",
    "AI Insights",
    "Investment",
    "Roadmap",
    "Settings",
  ];

  return (
    <div
      style={{
        width: "260px",
        background: "#0f172a",
        color: "white",
        padding: "30px",
        minHeight: "100vh",
        borderRight: "1px solid #1e293b",
      }}
    >
      <h1
        style={{
          fontSize: "32px",
          marginBottom: "50px",
          color: "#38bdf8",
        }}
      >
        ArthaSetu AI
      </h1>

      {menu.map((item) => (
        <div
          key={item}
          style={{
            padding: "15px",
            marginBottom: "10px",
            borderRadius: "10px",
            cursor: "pointer",
            transition: "0.3s",
            background: item === "Dashboard" ? "#1e293b" : "transparent",
          }}
        >
          {item}
        </div>
      ))}
    </div>
  );
}