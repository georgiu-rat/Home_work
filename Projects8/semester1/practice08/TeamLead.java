package semester1.practice08;

class TeamLead extends Developer {
    private Developer[] teamMembers;
    private int memberCount;
    public TeamLead(String name, double salary, String programmingLanguage, int maxTeamSize) {
        super(name, salary, programmingLanguage);
        this.teamMembers = new Developer[maxTeamSize];
        this.memberCount = 0;
    }
    public boolean addTeamMember(Developer dev) {
        if (memberCount < teamMembers.length && dev != null) {
            teamMembers[memberCount] = dev;
            memberCount++;
            return true;
        }
        return false;
    }
    public double getTotalTeamBudget() {
        double total = getSalary();
        for (int i = 0; i < memberCount; i++) {
            total += teamMembers[i].getSalary();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("керівник{%s, розмір команди=%d/%d, бюджет=%.2f}\nКоманда:\n",
                super.toString(), memberCount, teamMembers.length, getTotalTeamBudget()));
        for (int i = 0; i < memberCount; i++) {
            sb.append("  - ").append(teamMembers[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
