enum LightTrafficSignal {
    RED ("halt"), GREEN("go"), ORANGE("slower");
    private String move;
    public String getMove() {
        return this.move;
    }
    private LightTrafficSignal (String move) {
        this.move = move;
    }
}

LightTrafficSignal signal = LightTrafficSignal.valueOf("RED");
signal = LightTrafficSignal.valueOf("GREEN");
signal = LightTrafficSignal.valueOf("ORANGE");