package p249o7;

/* renamed from: o7.m4 */
/* loaded from: classes.dex */
public abstract class AbstractC5050m4 extends com.google.android.gms.measurement.internal.C1114e {

    /* renamed from: b */
    public boolean f19845b;

    public AbstractC5050m4(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            com.google.android.gms.measurement.internal.d r2 = r1.f5736a
            int r0 = r2.f5707E
            int r0 = r0 + 1
            r2.f5707E = r0
            return
    }

    /* renamed from: j */
    public void mo3146j() {
            r0 = this;
            return
    }

    /* renamed from: k */
    public abstract boolean mo3138k();

    /* renamed from: l */
    public final void m11315l() {
            r2 = this;
            boolean r0 = r2.m11318o()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: m */
    public final void m11316m() {
            r2 = this;
            boolean r0 = r2.f19845b
            if (r0 != 0) goto L15
            boolean r0 = r2.mo3138k()
            if (r0 != 0) goto L14
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f5708F
            r0.incrementAndGet()
            r0 = 1
            r2.f19845b = r0
        L14:
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: n */
    public final void m11317n() {
            r2 = this;
            boolean r0 = r2.f19845b
            if (r0 != 0) goto L12
            r2.mo3146j()
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f5708F
            r0.incrementAndGet()
            r0 = 1
            r2.f19845b = r0
            return
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: o */
    public final boolean m11318o() {
            r1 = this;
            boolean r0 = r1.f19845b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
