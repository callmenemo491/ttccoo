package p088f4;

/* renamed from: f4.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C2047u implements p010a9.InterfaceC0044l {

    /* renamed from: Y */
    public final /* synthetic */ int f9343Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f9344Z;

    public /* synthetic */ C2047u(p088f4.C1994b0 r2) {
            r1 = this;
            r0 = 1
            r1.f9343Y = r0
            r1.<init>()
            r1.f9344Z = r2
            return
    }

    public /* synthetic */ C2047u(p088f4.InterfaceC2043s.b r2) {
            r1 = this;
            r0 = 0
            r1.f9343Y = r0
            r1.<init>()
            r1.f9344Z = r2
            return
    }

    @Override // p010a9.InterfaceC0044l
    public final java.lang.Object get() {
            r2 = this;
            int r0 = r2.f9343Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L15
        L6:
            java.lang.Object r0 = r2.f9344Z
            f4.s$b r0 = (p088f4.InterfaceC2043s.b) r0
            g4.p r1 = new g4.p
            v5.c r0 = r0.f9320b
            java.util.Objects.requireNonNull(r0)
            r1.<init>(r0)
            return r1
        L15:
            java.lang.Object r0 = r2.f9344Z
            f4.b0 r0 = (p088f4.C1994b0) r0
            boolean r0 = r0.f8830x0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
