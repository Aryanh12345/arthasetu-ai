export default function GoalTracker() {

  return (

    <div
      style={{
        background:"#1f2937",
        borderRadius:"18px",
        padding:"30px"
      }}
    >

      <h2>Financial Goals</h2>

      <br/>

      <div>

        Emergency Fund

        <progress value="60" max="100" style={{width:"100%"}}/>

      </div>

      <br/>

      <div>

        SIP Goal

        <progress value="40" max="100" style={{width:"100%"}}/>

      </div>

      <br/>

      <div>

        Trust Score Goal

        <progress value="78" max="100" style={{width:"100%"}}/>

      </div>

    </div>

  );

}