package p414xc;

/* renamed from: xc.o */
/* loaded from: classes.dex */
public class C7040o {
    public static final java.lang.String DEFAULT_EXPIRATION = "1970-01-01T00:00:00.000";
    private int gDelaySec;
    private java.lang.String gExpiration;
    private int gMaxCpuUsageMs;
    private int gMaxNetUsageWords;
    private java.lang.Long gRefBlockNum;
    private java.lang.Long gRefBlockPrefix;

    public C7040o() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "1970-01-01T00:00:00.000"
            r2.gExpiration = r0
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.gRefBlockNum = r0
            r2.gRefBlockPrefix = r0
            r0 = 0
            r2.gMaxNetUsageWords = r0
            r2.gMaxCpuUsageMs = r0
            r2.gDelaySec = r0
            return
    }

    public C7040o(java.lang.String r3, java.lang.Long r4, java.lang.Long r5, int r6, int r7, int r8) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "1970-01-01T00:00:00.000"
            r2.gExpiration = r0
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.gRefBlockNum = r0
            r2.gRefBlockPrefix = r0
            r0 = 0
            r2.gMaxNetUsageWords = r0
            r2.gMaxCpuUsageMs = r0
            r2.gDelaySec = r0
            r2.gExpiration = r3
            r2.gRefBlockNum = r4
            r2.gRefBlockPrefix = r5
            r2.gMaxNetUsageWords = r6
            r2.gMaxCpuUsageMs = r7
            r2.gDelaySec = r8
            return
    }

    public int getDelaySec() {
            r1 = this;
            int r0 = r1.gDelaySec
            return r0
    }

    public java.lang.String getExpiration() {
            r1 = this;
            java.lang.String r0 = r1.gExpiration
            return r0
    }

    public int getMaxCpuUsageMs() {
            r1 = this;
            int r0 = r1.gMaxCpuUsageMs
            return r0
    }

    public int getMaxNetUsageWords() {
            r1 = this;
            int r0 = r1.gMaxNetUsageWords
            return r0
    }

    public java.lang.Long getRefBlockNum() {
            r1 = this;
            java.lang.Long r0 = r1.gRefBlockNum
            return r0
    }

    public java.lang.Long getRefBlockPrefix() {
            r1 = this;
            java.lang.Long r0 = r1.gRefBlockPrefix
            return r0
    }

    public void setDelaySec(int r1) {
            r0 = this;
            r0.gDelaySec = r1
            return
    }

    public void setExpiration(java.lang.String r1) {
            r0 = this;
            r0.gExpiration = r1
            return
    }

    public void setMaxCpuUsageMs(int r1) {
            r0 = this;
            r0.gMaxCpuUsageMs = r1
            return
    }

    public void setMaxNetUsageWords(int r1) {
            r0 = this;
            r0.gMaxNetUsageWords = r1
            return
    }

    public void setRefBlockNum(java.lang.Long r1) {
            r0 = this;
            r0.gRefBlockNum = r1
            return
    }

    public void setRefBlockPrefix(java.lang.Long r1) {
            r0 = this;
            r0.gRefBlockPrefix = r1
            return
    }
}
