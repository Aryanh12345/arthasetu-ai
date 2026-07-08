import { useEffect, useState } from "react";
import { getTrustScore } from "../api/trustScoreApi";

function Dashboard() {

    const [score, setScore] = useState(null);

    useEffect(() => {

        getTrustScore().then((response) => {

            setScore(response.data);

        });

    }, []);

    return (

        <div>

            <h1>ArthaSetu AI</h1>

            <h2>Trust Score</h2>

            <pre>

                {JSON.stringify(score,null,2)}

            </pre>

        </div>

    );

}

export default Dashboard;