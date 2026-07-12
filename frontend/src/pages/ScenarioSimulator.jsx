import { useState } from "react";
import { simulateScenario } from "../api/scenarioApi";

export default function ScenarioSimulator() {

    const [form, setForm] = useState({
        rechargeFrequency: 80,
        utilityPaymentScore: 90,
        ecommerceActivity: 75,
        savingsScore: 80,
        incomeStability: 85
    });

    const [result, setResult] = useState(null);

    const handleChange = (e) => {

        setForm({
            ...form,
            [e.target.name]: Number(e.target.value)
        });

    };

    const simulate = () => {

        simulateScenario(form)
            .then((res) => {

                setResult(res.data);

            })
            .catch((err) => {

                console.error(err);

            });

    };

    return (

        <div
            style={{
                padding: "40px",
                color: "white",
                background: "#111827",
                minHeight: "100vh"
            }}
        >

            <h1>Scenario Simulator</h1>

            <br />

            <label>Recharge Frequency</label>

            <input
                type="number"
                name="rechargeFrequency"
                value={form.rechargeFrequency}
                onChange={handleChange}
            />

            <br /><br />

            <label>Utility Payment Score</label>

            <input
                type="number"
                name="utilityPaymentScore"
                value={form.utilityPaymentScore}
                onChange={handleChange}
            />

            <br /><br />

            <label>E-commerce Activity</label>

            <input
                type="number"
                name="ecommerceActivity"
                value={form.ecommerceActivity}
                onChange={handleChange}
            />

            <br /><br />

            <label>Savings Score</label>

            <input
                type="number"
                name="savingsScore"
                value={form.savingsScore}
                onChange={handleChange}
            />

            <br /><br />

            <label>Income Stability</label>

            <input
                type="number"
                name="incomeStability"
                value={form.incomeStability}
                onChange={handleChange}
            />

            <br /><br />

            <button
                onClick={simulate}
            >
                Simulate
            </button>

            <br /><br />

            {

                result && (

                    <div
                        style={{
                            background: "#1f2937",
                            padding: "20px",
                            borderRadius: "10px"
                        }}
                    >

                        <h2>

                            Predicted Trust Score:
                            {" "}
                            {result.predictedTrustScore}

                        </h2>

                        <h3>

                            Financial Health:
                            {" "}
                            {result.financialHealth}

                        </h3>

                        <h3>

                            Risk Profile:
                            {" "}
                            {result.investmentRecommendation.riskProfile}

                        </h3>

                        <h3>Recommended Portfolio</h3>

                        <ul>

                            <li>Emergency Fund: {result.investmentRecommendation.emergencyFund}%</li>
                            <li>Index Funds: {result.investmentRecommendation.indexFunds}%</li>
                            <li>Fixed Deposit: {result.investmentRecommendation.fixedDeposit}%</li>
                            <li>Gold ETF: {result.investmentRecommendation.goldETF}%</li>
                            <li>Skill Development: {result.investmentRecommendation.skillDevelopment}%</li>

                        </ul>

                    </div>

                )

            }

        </div>

    );

}