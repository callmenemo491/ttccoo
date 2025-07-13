package p179k1;

/* renamed from: k1.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C3648f implements p241o.InterfaceC4866a, p371v5.C6564n.a, p371v5.InterfaceC6558h {

    /* renamed from: Y */
    public final /* synthetic */ int f16135Y;

    /* renamed from: Z */
    public final /* synthetic */ int f16136Z;

    public /* synthetic */ C3648f(int r2, int r3) {
            r1 = this;
            r1.f16135Y = r3
            r0 = 1
            if (r3 == r0) goto L1e
            r0 = 2
            if (r3 == r0) goto L18
            r0 = 3
            if (r3 == r0) goto L12
            r0 = 4
            r1.<init>()
            r1.f16136Z = r2
            return
        L12:
            r1.<init>()
            r1.f16136Z = r2
            return
        L18:
            r1.<init>()
            r1.f16136Z = r2
            return
        L1e:
            r1.<init>()
            r1.f16136Z = r2
            return
    }

    @Override // p371v5.InterfaceC6558h
    /* renamed from: a */
    public void mo2143a(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f16136Z
            j4.h$a r2 = (p162j4.InterfaceC3403h.a) r2
            r2.m7826d(r0)
            return
    }

    @Override // p241o.InterfaceC4866a
    public java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f16136Z
            o1.a r2 = (p243o1.InterfaceC4871a) r2
            r2.mo11016r(r0)
            r2 = 0
            return r2
    }

    @Override // p371v5.C6564n.a
    /* renamed from: b */
    public void mo24b(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f16135Y
            switch(r0) {
                case 1: goto L10;
                case 2: goto L5;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L1a
        L6:
            int r0 = r2.f16136Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            f4.x0$b r1 = com.google.android.exoplayer2.ext.cast.C1045a.f5251z
            r3.mo2914u(r0)
            return
        L10:
            int r0 = r2.f16136Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            int r1 = p088f4.C2057z.f9393H
            r3.mo2914u(r0)
            return
        L1a:
            int r0 = r2.f16136Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            f4.x0$b r1 = com.google.android.exoplayer2.ext.cast.C1045a.f5251z
            r3.mo2887N(r0)
            return
    }
}
