package edu.university.repository;

import edu.university.entity.Score;

public class ScoreRepo extends BaseRepoImpl<Score> {
    public ScoreRepo() {
        super(Score.class);
    }
}
