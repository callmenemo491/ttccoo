package p182k4;

/* renamed from: k4.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C3688c implements p371v5.C6564n.b, p371v5.C6564n.a {

    /* renamed from: Y */
    public final /* synthetic */ int f16321Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.exoplayer2.ext.cast.C1045a f16322Z;

    public /* synthetic */ C3688c(com.google.android.exoplayer2.ext.cast.C1045a r2, int r3) {
            r1 = this;
            r1.f16321Y = r3
            r0 = 1
            if (r3 == r0) goto Lc
            r0 = 2
            if (r3 == r0) goto Lc
            r0 = 3
            if (r3 == r0) goto Lc
            r0 = 4
        Lc:
            r1.<init>()
            r1.f16322Z = r2
            return
    }

    @Override // p371v5.C6564n.a
    /* renamed from: b */
    public void mo24b(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f16321Y
            switch(r0) {
                case 1: goto L29;
                case 2: goto L1f;
                case 3: goto L12;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L36
        L6:
            com.google.android.exoplayer2.ext.cast.a r0 = r2.f16322Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            g5.i0 r1 = r0.f5265o
            s5.j r0 = r0.f5266p
            r3.mo2893U(r1, r0)
            return
        L12:
            com.google.android.exoplayer2.ext.cast.a r0 = r2.f16322Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            f4.j0 r0 = r0.mo5237w()
            r1 = 1
            r3.mo2898a0(r0, r1)
            return
        L1f:
            com.google.android.exoplayer2.ext.cast.a r0 = r2.f16322Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            f4.x0$b r0 = r0.f5268r
            r3.mo2891S(r0)
            return
        L29:
            com.google.android.exoplayer2.ext.cast.a r0 = r2.f16322Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            f4.j0 r0 = r0.mo5237w()
            r1 = 3
            r3.mo2898a0(r0, r1)
            return
        L36:
            com.google.android.exoplayer2.ext.cast.a r0 = r2.f16322Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            f4.o1 r0 = r0.f5267q
            r3.mo2892T(r0)
            return
    }

    @Override // p371v5.C6564n.b
    /* renamed from: j */
    public void mo4927j(java.lang.Object r3, p371v5.C6561k r4) {
            r2 = this;
            com.google.android.exoplayer2.ext.cast.a r0 = r2.f16322Z
            f4.x0$c r3 = (p088f4.InterfaceC2054x0.c) r3
            java.util.Objects.requireNonNull(r0)
            f4.x0$d r1 = new f4.x0$d
            r1.<init>(r4)
            r3.mo2890R(r0, r1)
            return
    }
}
