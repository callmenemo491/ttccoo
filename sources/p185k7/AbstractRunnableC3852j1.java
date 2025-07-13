package p185k7;

/* renamed from: k7.j1 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC3852j1 implements java.lang.Runnable {

    /* renamed from: Y */
    public final long f16698Y;

    /* renamed from: Z */
    public final long f16699Z;

    /* renamed from: a0 */
    public final boolean f16700a0;

    /* renamed from: b0 */
    public final /* synthetic */ p185k7.C3918o1 f16701b0;

    public AbstractRunnableC3852j1(p185k7.C3918o1 r3, boolean r4) {
            r2 = this;
            r2.f16701b0 = r3
            r2.<init>()
            java.util.Objects.requireNonNull(r3)
            long r0 = java.lang.System.currentTimeMillis()
            r2.f16698Y = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.f16699Z = r0
            r2.f16700a0 = r4
            return
    }

    /* renamed from: a */
    public abstract void mo8181a();

    /* renamed from: b */
    public void mo8182b() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            k7.o1 r0 = r4.f16701b0
            boolean r0 = r0.f16795e
            if (r0 == 0) goto La
            r4.mo8182b()
            return
        La:
            r4.mo8181a()     // Catch: java.lang.Exception -> Le
            return
        Le:
            r0 = move-exception
            k7.o1 r1 = r4.f16701b0
            r2 = 0
            boolean r3 = r4.f16700a0
            r1.m8851a(r0, r2, r3)
            r4.mo8182b()
            return
    }
}
