package p249o7;

/* renamed from: o7.s3 */
/* loaded from: classes.dex */
public abstract class AbstractC5097s3 extends p249o7.C5136x2 {

    /* renamed from: b */
    public boolean f19989b;

    public AbstractC5097s3(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r1.<init>(r2)
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            int r0 = r2.f5707E
            int r0 = r0 + 1
            r2.f5707E = r0
            return
    }

    /* renamed from: j */
    public final void m11419j() {
            r2 = this;
            boolean r0 = r2.f19989b
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: k */
    public final void m11420k() {
            r2 = this;
            boolean r0 = r2.f19989b
            if (r0 != 0) goto L15
            boolean r0 = r2.mo3130l()
            if (r0 != 0) goto L14
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f5708F
            r0.incrementAndGet()
            r0 = 1
            r2.f19989b = r0
        L14:
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: l */
    public abstract boolean mo3130l();
}
