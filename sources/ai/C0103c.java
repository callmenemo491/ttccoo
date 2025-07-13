package ai;

/* renamed from: ai.c */
/* loaded from: classes.dex */
public class C0103c extends p379vh.AbstractC6740t0 {

    /* renamed from: Z */
    public final int f356Z;

    /* renamed from: a0 */
    public final int f357a0;

    /* renamed from: b0 */
    public final long f358b0;

    /* renamed from: c0 */
    public final java.lang.String f359c0;

    /* renamed from: d0 */
    public ai.ExecutorC0101a f360d0;

    public C0103c(int r7, int r8, java.lang.String r9, int r10) {
            r6 = this;
            r9 = r10 & 1
            if (r9 == 0) goto L6
            int r7 = ai.C0112l.f373b
        L6:
            r1 = r7
            r7 = r10 & 2
            if (r7 == 0) goto Ld
            int r8 = ai.C0112l.f374c
        Ld:
            r2 = r8
            r7 = r10 & 4
            if (r7 == 0) goto L15
            java.lang.String r7 = "DefaultDispatcher"
            goto L16
        L15:
            r7 = 0
        L16:
            r5 = r7
            long r3 = ai.C0112l.f375d
            r6.<init>()
            r6.f356Z = r1
            r6.f357a0 = r2
            r6.f358b0 = r3
            r6.f359c0 = r5
            ai.a r7 = new ai.a
            r0 = r7
            r0.<init>(r1, r2, r3, r5)
            r6.f360d0 = r7
            return
    }

    @Override // p379vh.AbstractC6755z
    /* renamed from: x0 */
    public void mo156x0(p101fh.InterfaceC2175g r3, java.lang.Runnable r4) {
            r2 = this;
            ai.a r3 = r2.f360d0     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = ai.ExecutorC0101a.f335f0     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            ai.g r0 = ai.C0107g.f368Y     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r1 = 0
            r3.m145l(r4, r0, r1)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            goto L10
        Lb:
            vh.d0 r3 = p379vh.RunnableC6692d0.f25967e0
            r3.m13649G0(r4)
        L10:
            return
    }
}
