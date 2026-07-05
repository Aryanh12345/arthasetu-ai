import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";
import Dashboard from "./pages/Dashboard";
import RiskAssessment from "./pages/RiskAssessment";
import Simulator from "./pages/Simulator";
import Roadmap from "./pages/Roadmap";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/dashboard" element={<Dashboard />} />
                <Route path="/risk" element={<RiskAssessment />} />
                <Route path="/simulator" element={<Simulator />} />
                <Route path="/roadmap" element={<Roadmap />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;