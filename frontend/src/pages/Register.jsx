import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { registerUser } from "../api/userApi";

export default function Register() {

    const navigate = useNavigate();

    const [user, setUser] = useState({
        fullName: "",
        age: "",
        occupation: "",
        monthlyIncome: ""
    });

    const handleChange = (e) => {

        setUser({

            ...user,

            [e.target.name]: e.target.value

        });

    };

    const handleSubmit = async (e) => {

        e.preventDefault();

        try {

            const response = await registerUser(user);

            localStorage.setItem(
                "userId",
                response.data.id
            );

            navigate("/financial");

        } catch (error) {

            alert("Registration Failed");

            console.error(error);

        }

    };

    return (

        <div
            style={{
                width: "500px",
                margin: "40px auto"
            }}
        >

            <h1>Register</h1>

            <form onSubmit={handleSubmit}>

                <input
                    type="text"
                    name="fullName"
                    placeholder="Full Name"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="number"
                    name="age"
                    placeholder="Age"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="text"
                    name="occupation"
                    placeholder="Occupation"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <input
                    type="number"
                    name="monthlyIncome"
                    placeholder="Monthly Income"
                    onChange={handleChange}
                    required
                />

                <br /><br />

                <button type="submit">

                    Continue

                </button>

            </form>

        </div>

    );

}