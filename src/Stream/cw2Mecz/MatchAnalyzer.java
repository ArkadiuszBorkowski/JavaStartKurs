package Stream.cw2Mecz;

class MatchResult {
    private String host;
    private String guest;
    private int hostGoals;
    private int guestGoals;

    public MatchResult(String host, String guest, int hostGoals, int guestGoals) {
        this.host = host;
        this.guest = guest;
        this.hostGoals = hostGoals;
        this.guestGoals = guestGoals;
    }

    int getGoalDifference() {
        return hostGoals - guestGoals;
    }

    boolean containsTeam(String team) {
        return host.equals(team) || guest.equals(team);
    }

    String[] getTeamNames() {
        return new String[] {host, guest};
    }

    int getGoalsSum() {
        return hostGoals + guestGoals;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public int getHostGoals() {
        return hostGoals;
    }

    public void setHostGoals(int hostGoals) {
        this.hostGoals = hostGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(int guestGoals) {
        this.guestGoals = guestGoals;
    }

    @Override
    public String toString() {
        return host + " - " + guest + "(" + hostGoals + ":" + guestGoals + ")";
    }
}