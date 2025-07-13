package p249o7;

/* renamed from: o7.i6 */
/* loaded from: classes.dex */
public abstract class AbstractC5020i6 extends p249o7.C5012h6 {

    /* renamed from: c */
    public boolean f19764c;

    public AbstractC5020i6(p249o7.C5052m6 r2) {
            r1 = this;
            r1.<init>(r2)
            o7.m6 r2 = r1.f19756b
            int r0 = r2.f19876q
            int r0 = r0 + 1
            r2.f19876q = r0
            return
    }

    /* renamed from: j */
    public final void m11247j() {
            r2 = this;
            boolean r0 = r2.f19764c
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: k */
    public final void m11248k() {
            r3 = this;
            boolean r0 = r3.f19764c
            if (r0 != 0) goto L12
            r3.mo11089l()
            o7.m6 r0 = r3.f19756b
            int r1 = r0.f19877r
            r2 = 1
            int r1 = r1 + r2
            r0.f19877r = r1
            r3.f19764c = r2
            return
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: l */
    public abstract boolean mo11089l();
}
