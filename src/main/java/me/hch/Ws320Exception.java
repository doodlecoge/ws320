package me.hch;

/**
 * Created by huaiwang on 14-4-3.
 */
public class Ws320Exception extends RuntimeException {
    public Ws320Exception() {
        super();
    }

    public Ws320Exception(String message) {
        super(message);
    }

    public Ws320Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Ws320Exception(Throwable cause) {
        super(cause);
    }
}
