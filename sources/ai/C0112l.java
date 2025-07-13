package ai;

/* renamed from: ai.l */
/* loaded from: classes.dex */
public final class C0112l {

    /* renamed from: a */
    public static final long f372a = 0;

    /* renamed from: b */
    public static final int f373b = 0;

    /* renamed from: c */
    public static final int f374c = 0;

    /* renamed from: d */
    public static final long f375d = 0;

    /* renamed from: e */
    public static ai.AbstractC0108h f376e;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.resolution.ns"
            r1 = 100000(0x186a0, double:4.94066E-319)
            r3 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            long r0 = p074e9.C1805a.m4538w(r0, r1, r3, r5, r7, r8)
            ai.C0112l.f372a = r0
            java.lang.String r2 = "kotlinx.coroutines.scheduler.blocking.parallelism"
            r3 = 16
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            p074e9.C1805a.m4537v(r2, r3, r4, r5, r6, r7)
            int r0 = p459zh.C7351q.f28110a
            r1 = 2
            if (r0 >= r1) goto L25
            r3 = 2
            goto L26
        L25:
            r3 = r0
        L26:
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            int r1 = p074e9.C1805a.m4537v(r2, r3, r4, r5, r6, r7)
            ai.C0112l.f373b = r1
            int r0 = r0 * 128
            r2 = 2097150(0x1ffffe, float:2.938733E-39)
            int r4 = p209lh.C4304a.m9616j(r0, r1, r2)
            r5 = 0
            r6 = 2097150(0x1ffffe, float:2.938733E-39)
            r7 = 4
            r8 = 0
            java.lang.String r3 = "kotlinx.coroutines.scheduler.max.pool.size"
            int r0 = p074e9.C1805a.m4537v(r3, r4, r5, r6, r7, r8)
            ai.C0112l.f374c = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 60
            r4 = 0
            r6 = 0
            r8 = 12
            r9 = 0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            long r1 = p074e9.C1805a.m4538w(r1, r2, r4, r6, r8, r9)
            long r0 = r0.toNanos(r1)
            ai.C0112l.f375d = r0
            ai.f r0 = ai.C0106f.f367a
            ai.C0112l.f376e = r0
            return
    }
}
