package p255od;

/* renamed from: od.d */
/* loaded from: classes.dex */
public final class C5197d {
    private final java.util.List<p255od.C5223q> data;

    @p189kb.InterfaceC4079b("query_time")
    private final long queryTime;
    private final boolean success;

    public C5197d(boolean r2, java.util.List<p255od.C5223q> r3, long r4) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.success = r2
            r1.data = r3
            r1.queryTime = r4
            return
    }

    public final java.util.List<p255od.C5223q> getData() {
            r1 = this;
            java.util.List<od.q> r0 = r1.data
            return r0
    }

    public final long getQueryTime() {
            r2 = this;
            long r0 = r2.queryTime
            return r0
    }

    public final boolean getSuccess() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }
}
