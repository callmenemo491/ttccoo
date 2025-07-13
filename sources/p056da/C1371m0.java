package p056da;

/* renamed from: da.m0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1371m0 implements p327s7.InterfaceC5977a {

    /* renamed from: Y */
    public final /* synthetic */ int f6933Y;

    /* renamed from: Z */
    public final /* synthetic */ p327s7.C5986j f6934Z;

    public /* synthetic */ C1371m0(p327s7.C5986j r1, int r2) {
            r0 = this;
            r0.f6933Y = r2
            r0.<init>()
            r0.f6934Z = r1
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public final java.lang.Object mo816g(p327s7.AbstractC5985i r4) {
            r3 = this;
            int r0 = r3.f6933Y
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L22
        L7:
            s7.j r0 = r3.f6934Z
            boolean r2 = r4.mo12455m()
            if (r2 == 0) goto L17
            java.lang.Object r4 = r4.mo12451i()
            r0.m12459b(r4)
            goto L21
        L17:
            java.lang.Exception r4 = r4.mo12450h()
            java.util.Objects.requireNonNull(r4)
            r0.m12458a(r4)
        L21:
            return r1
        L22:
            s7.j r0 = r3.f6934Z
            boolean r2 = r4.mo12455m()
            if (r2 == 0) goto L32
            java.lang.Object r4 = r4.mo12451i()
            r0.m12459b(r4)
            goto L3c
        L32:
            java.lang.Exception r4 = r4.mo12450h()
            java.util.Objects.requireNonNull(r4)
            r0.m12458a(r4)
        L3c:
            return r1
    }
}
