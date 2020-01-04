package ua.ihorshulha.ht_09.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        TeamPlayer worker = new WorkerTeamPlayerImpl();
        TeamPlayer manager = new ManagerTeamPlayerImpl();
        TeamPlayer cleaner = new CleanerTeamPlayerImpl();

        team.addTeamPlayer(worker);
        team.addTeamPlayer(manager);
        team.addTeamPlayer(cleaner);

        team.doWork();
    }
}
