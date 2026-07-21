import { Link } from 'react-router-dom';
import trainermock from './Trainermock';

function TrainerList(){
    return(
        <>
            <ul>
            {trainermock.map((trainer)=>(
                <li key={trainer.trainerid}>
                <Link to={`/trainers/${trainer.trainerid}`}>{trainer.name}</Link>
                </li>
            ))}
            </ul>
        </>
    )
}
export default TrainerList;