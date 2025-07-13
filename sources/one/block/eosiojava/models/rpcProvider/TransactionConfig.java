package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class TransactionConfig {
    private static final int DEFAULT_BLOCKS_BEHIND = 3;
    private static final int DEFAULT_EXPIRES_SECONDS = 300;
    private static final boolean DEFAULT_USE_LAST_IRREVERSIBLE = true;
    private int blocksBehind;
    private int expiresSeconds;
    private boolean useLastIrreversible;

    public TransactionConfig() {
            r1 = this;
            r1.<init>()
            r0 = 300(0x12c, float:4.2E-43)
            r1.expiresSeconds = r0
            r0 = 3
            r1.blocksBehind = r0
            r0 = 1
            r1.useLastIrreversible = r0
            return
    }

    public int getBlocksBehind() {
            r1 = this;
            int r0 = r1.blocksBehind
            return r0
    }

    public int getExpiresSeconds() {
            r1 = this;
            int r0 = r1.expiresSeconds
            return r0
    }

    public boolean getUseLastIrreversible() {
            r1 = this;
            boolean r0 = r1.useLastIrreversible
            return r0
    }

    public void setBlocksBehind(int r1) {
            r0 = this;
            r0.blocksBehind = r1
            return
    }

    public void setExpiresSeconds(int r1) {
            r0 = this;
            r0.expiresSeconds = r1
            return
    }

    public void setUseLastIrreversible(boolean r1) {
            r0 = this;
            r0.useLastIrreversible = r1
            return
    }
}
