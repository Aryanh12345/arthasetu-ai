import { BrowserRouter, Routes, Route } from "react-router-dom";

import Register from "./pages/Register";
import FinancialBehaviour from "./pages/FinancialBehaviour";
import Dashboard from "./pages/Dashboard";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Register />} />
        <Route path="/financial" element={<FinancialBehaviour />} />
        <Route path="/dashboard" element={<Dashboard />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;