package linux.maze.runner.web.dtos;

public class BaseDto {
    protected Status status;

    public BaseDto() {
        status = new Status();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
