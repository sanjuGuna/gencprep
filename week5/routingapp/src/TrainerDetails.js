import { useParams, Link } from 'react-router-dom';
import trainermock from './Trainermock';


function TrainerDetails() {
  const { id } = useParams();
  const trainer = trainermock.find(t => t.trainerid === id);

  if (!trainer) {
    return (
      <div className="details-container">
        <h2>Trainer Not Found</h2>
        <p>The trainer you're looking for does not exist.</p>
        <Link to="/trainers">Back to Trainers</Link>
      </div>
    );
  }

  return (
    <div className="details-container">
      <Link to="/trainers" className="back-link">← Back to Trainers</Link>
      <div className="details-card">
        <h2>{trainer.name}</h2>
        <div className="details-info">
          <p><strong>ID:</strong> {trainer.trainerid}</p>
          <p><strong>Phone:</strong> {trainer.phone}</p>
          <div className="skills-section">
            <strong>Skills:</strong>
            <ul>
              {trainer.skills && trainer.skills.length > 0 ? (
                trainer.skills.map((skill, idx) => (
                  <li key={idx}>{skill}</li>
                ))
              ) : (
                <li>No skills listed</li>
              )}
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
}

export default TrainerDetails;
