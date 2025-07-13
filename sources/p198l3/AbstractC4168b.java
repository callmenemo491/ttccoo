package p198l3;

import p198l3.C4172f;

/* renamed from: l3.b */
/* loaded from: classes.dex */
public abstract class AbstractC4168b<T extends p198l3.C4172f> implements p267p3.InterfaceC5350d<T> {

    /* renamed from: a */
    public java.util.List<java.lang.Integer> f17254a;

    /* renamed from: b */
    public java.util.List<java.lang.Integer> f17255b;

    /* renamed from: c */
    public java.lang.String f17256c;

    /* renamed from: d */
    public p181k3.C3685i.a f17257d;

    /* renamed from: e */
    public boolean f17258e;

    /* renamed from: f */
    public transient p215m3.AbstractC4351c f17259f;

    /* renamed from: g */
    public int f17260g;

    /* renamed from: h */
    public float f17261h;

    /* renamed from: i */
    public float f17262i;

    /* renamed from: j */
    public boolean f17263j;

    /* renamed from: k */
    public boolean f17264k;

    /* renamed from: l */
    public p323s3.C5949c f17265l;

    /* renamed from: m */
    public float f17266m;

    /* renamed from: n */
    public boolean f17267n;

    public AbstractC4168b(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f17254a = r0
            r4.f17255b = r0
            java.lang.String r0 = "DataSet"
            r4.f17256c = r0
            k3.i$a r0 = p181k3.C3685i.a.f16312Y
            r4.f17257d = r0
            r0 = 1
            r4.f17258e = r0
            r1 = 3
            r4.f17260g = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.f17261h = r1
            r4.f17262i = r1
            r4.f17263j = r0
            r4.f17264k = r0
            s3.c r1 = new s3.c
            r1.<init>()
            r4.f17265l = r1
            r1 = 1099431936(0x41880000, float:17.0)
            r4.f17266m = r1
            r4.f17267n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f17254a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f17255b = r0
            java.util.List<java.lang.Integer> r0 = r4.f17254a
            r1 = 140(0x8c, float:1.96E-43)
            r2 = 234(0xea, float:3.28E-43)
            r3 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.rgb(r1, r2, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = r4.f17255b
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r4.f17256c = r5
            return
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: C */
    public void mo9226C(p215m3.AbstractC4351c r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.f17259f = r1
            return
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: D */
    public boolean mo9227D() {
            r1 = this;
            boolean r0 = r1.f17263j
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: L */
    public p181k3.C3685i.a mo9228L() {
            r1 = this;
            k3.i$a r0 = r1.f17257d
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: M */
    public float mo9229M() {
            r1 = this;
            float r0 = r1.f17266m
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: N */
    public void mo9230N(boolean r1) {
            r0 = this;
            r0.f17263j = r1
            return
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: O */
    public p215m3.AbstractC4351c mo9231O() {
            r2 = this;
            m3.c r0 = r2.f17259f
            if (r0 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto Lb
            m3.c r0 = p323s3.AbstractC5952f.f22861g
        Lb:
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: Q */
    public p323s3.C5949c mo9232Q() {
            r1 = this;
            s3.c r0 = r1.f17265l
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: R */
    public int mo9233R() {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.f17254a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: T */
    public boolean mo9234T() {
            r1 = this;
            boolean r0 = r1.f17258e
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: W */
    public float mo9235W() {
            r1 = this;
            float r0 = r1.f17262i
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: a */
    public android.graphics.Typeface mo9236a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: b */
    public boolean mo9237b() {
            r1 = this;
            m3.c r0 = r1.f17259f
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: c0 */
    public float mo9238c0() {
            r1 = this;
            float r0 = r1.f17261h
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: d */
    public int mo9239d() {
            r1 = this;
            int r0 = r1.f17260g
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: f0 */
    public int mo9240f0(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.f17254a
            int r1 = r0.size()
            int r3 = r3 % r1
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: i */
    public int mo9241i(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.f17255b
            int r1 = r0.size()
            int r3 = r3 % r1
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            return r3
    }

    @Override // p267p3.InterfaceC5350d
    public boolean isVisible() {
            r1 = this;
            boolean r0 = r1.f17267n
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: l */
    public java.util.List<java.lang.Integer> mo9242l() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.f17254a
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: o */
    public android.graphics.DashPathEffect mo9243o() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: s */
    public boolean mo9244s() {
            r1 = this;
            boolean r0 = r1.f17264k
            return r0
    }

    @Override // p267p3.InterfaceC5350d
    /* renamed from: x */
    public java.lang.String mo9245x() {
            r1 = this;
            java.lang.String r0 = r1.f17256c
            return r0
    }
}
