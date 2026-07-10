import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { saveFinancialBehaviour } from "../api/financialBehaviourApi";

export default function FinancialBehaviour() {

    const navigate = useNavigate();

    const userId = localStorage.getItem("userId");

    const [form, setForm] = useState({
        rechargeFrequency: "",
        utilityPaymentScore: "",
        ecommerceActivity: "",
        savingsScore: "",
        incomeStability: ""
    });

    const handleChange = (e) => {

        setForm({
            ...form,
            [e.target.name]: Number(e.target.value)
        });

    };

    const handleSubmit = async (e) => {

        e.preventDefault();

        try {

            await saveFinancialBehaviour({

                userId: Number(userId),

                ...form

            });

            navigate("/dashboard");

        } catch (err) {

            console.error(err);

            alert("Unable to save financial behaviour.");

        }

    };

    return (

        <div
            style={{
                width: "500px",
                margin: "40px auto"
            }}
        >

            <h1>Financial Behaviour</h1>

            <form onSubmit={handleSubmit}>

                <input
                    type="number"
                    name="rechargeFrequency"
                    placeholder="Recharge Frequency"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="number"
                    name="utilityPaymentScore"
                    placeholder="Utility Payment Score"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="number"
                    name="ecommerceActivity"
                    placeholder="E-commerce Activity"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="number"
                    name="savingsScore"
                    placeholder="Savings Score"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="number"
                    name="incomeStability"
                    placeholder="Income Stability"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <button type="submit">
                    Continue to Dashboard
                </button>

            </form>

        </div>

    );

}