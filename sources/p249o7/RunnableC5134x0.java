package p249o7;

/* renamed from: o7.x0 */
/* loaded from: classes.dex */
public final class RunnableC5134x0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ int f20159Y;

    /* renamed from: Z */
    public final /* synthetic */ long f20160Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f20161a0;

    public RunnableC5134x0(p249o7.C5051m5 r2, long r3) {
            r1 = this;
            r0 = 1
            r1.f20159Y = r0
            r1.f20161a0 = r2
            r1.f20160Z = r3
            r1.<init>()
            return
    }

    public RunnableC5134x0(p249o7.C5143y1 r2, long r3) {
            r1 = this;
            r0 = 0
            r1.f20159Y = r0
            r1.f20161a0 = r2
            r1.f20160Z = r3
            r1.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f20159Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            java.lang.Object r0 = r3.f20161a0
            o7.y1 r0 = (p249o7.C5143y1) r0
            long r1 = r3.f20160Z
            r0.m11452o(r1)
            return
        L10:
            java.lang.Object r0 = r3.f20161a0
            o7.m5 r0 = (p249o7.C5051m5) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.y1 r0 = r0.m3169n()
            long r1 = r3.f20160Z
            r0.m11449l(r1)
            java.lang.Object r0 = r3.f20161a0
            o7.m5 r0 = (p249o7.C5051m5) r0
            r1 = 0
            r0.f19848e = r1
            return
    }
}
