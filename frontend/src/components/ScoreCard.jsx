export default function ScoreCard({score}){

    return(

        <div className="rounded-xl bg-gray-800 p-6">

            <h2>Trust Score</h2>

            <h1 className="text-6xl font-bold">

                {score}

            </h1>

            <p>/1000</p>

        </div>

    );

}