package androidx.fragment.app;

/* renamed from: androidx.fragment.app.y0 */
/* loaded from: classes.dex */
public class C0418y0 implements androidx.savedstate.InterfaceC0622c, androidx.lifecycle.InterfaceC0469t0 {

    /* renamed from: Y */
    public final androidx.lifecycle.C0467s0 f2421Y;

    /* renamed from: Z */
    public androidx.lifecycle.C0472w f2422Z;

    /* renamed from: a0 */
    public androidx.savedstate.C0621b f2423a0;

    public C0418y0(androidx.fragment.app.ComponentCallbacksC0395n r1, androidx.lifecycle.C0467s0 r2) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f2422Z = r1
            r0.f2423a0 = r1
            r0.f2421Y = r2
            return
    }

    /* renamed from: a */
    public void m1400a(androidx.lifecycle.AbstractC0458o.b r3) {
            r2 = this;
            androidx.lifecycle.w r0 = r2.f2422Z
            java.lang.String r1 = "handleLifecycleEvent"
            r0.m1461d(r1)
            androidx.lifecycle.o$c r3 = r3.m1457e()
            r0.m1463g(r3)
            return
    }

    @Override // androidx.lifecycle.InterfaceC0471v
    /* renamed from: b */
    public androidx.lifecycle.AbstractC0458o mo428b() {
            r1 = this;
            r1.m1401c()
            androidx.lifecycle.w r0 = r1.f2422Z
            return r0
    }

    /* renamed from: c */
    public void m1401c() {
            r1 = this;
            androidx.lifecycle.w r0 = r1.f2422Z
            if (r0 != 0) goto L12
            androidx.lifecycle.w r0 = new androidx.lifecycle.w
            r0.<init>(r1)
            r1.f2422Z = r0
            androidx.savedstate.b r0 = new androidx.savedstate.b
            r0.<init>(r1)
            r1.f2423a0 = r0
        L12:
            return
    }

    @Override // androidx.savedstate.InterfaceC0622c
    /* renamed from: f */
    public androidx.savedstate.C0620a mo430f() {
            r1 = this;
            r1.m1401c()
            androidx.savedstate.b r0 = r1.f2423a0
            androidx.savedstate.a r0 = r0.f3684b
            return r0
    }

    @Override // androidx.lifecycle.InterfaceC0469t0
    /* renamed from: o */
    public androidx.lifecycle.C0467s0 mo432o() {
            r1 = this;
            r1.m1401c()
            androidx.lifecycle.s0 r0 = r1.f2421Y
            return r0
    }
}
