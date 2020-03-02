package edu.university.repository;

import edu.university.entity.Term;

public class TermRepo extends BaseRepoImpl<Term> {

    public TermRepo() {
        super(Term.class);
    }
}
