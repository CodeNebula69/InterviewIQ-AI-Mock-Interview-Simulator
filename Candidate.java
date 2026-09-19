public class Candidate {

    private String name;
    private String branch;
    private String skill;

    public Candidate(String name, String branch, String skill) {
        this.name = name;
        this.branch = branch;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getSkill() {
        return skill;
    }

    public void displayDetails() {
        System.out.println("\n===== Candidate Details =====");
        System.out.println("Name   : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("Skill  : " + skill);
    }
}
