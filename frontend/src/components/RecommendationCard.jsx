export default function RecommendationCard({ data }) {

    if (!data) {

        return (

            <div className="rounded-xl bg-gray-800 p-6">

                <h2>Investment Plan</h2>

                <p>No recommendation available.</p>

            </div>

        );

    }

    return (

        <div
            className="rounded-xl bg-gray-800 p-6"
        >

            <h2
                style={{
                    marginBottom: "20px"
                }}
            >
                AI Financial Recommendations
            </h2>

            <h3>

                Risk Level:
                {" "}
                {data.riskLevel}

            </h3>

            <br />

            <ul>

                {

                    data.recommendations.map((item, index) => (

                        <li
                            key={index}
                            style={{
                                marginBottom: "10px"
                            }}
                        >

                            {item}

                        </li>

                    ))

                }

            </ul>

        </div>

    );

}