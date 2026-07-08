export default function AIRecommendationCard({data}){

    if(!data){

        return null;

    }

    return(

        <div
            style={{
                background:"#1f2937",
                borderRadius:"18px",
                padding:"25px",
                color:"white"
            }}
        >

            <h2>AI Recommendations</h2>

            <p>

                <b>Risk Level:</b> {data.riskLevel}

            </p>

            <ul>

                {

                    data.recommendations.map((item,index)=>

                        <li key={index}>{item}</li>

                    )

                }

            </ul>

        </div>

    );

}