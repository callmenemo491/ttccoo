package p251o9;

/* renamed from: o9.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C5179c implements p392wa.InterfaceC6823b {

    /* renamed from: a */
    public final /* synthetic */ int f20306a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f20307b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f20308c;

    public /* synthetic */ C5179c(p251o9.C5180d r2, android.content.Context r3) {
            r1 = this;
            r0 = 0
            r1.f20306a = r0
            r1.<init>()
            r1.f20307b = r2
            r1.f20308c = r3
            return
    }

    public /* synthetic */ C5179c(p432y9.C7142i r2, p432y9.C7136c r3) {
            r1 = this;
            r0 = 1
            r1.f20306a = r0
            r1.<init>()
            r1.f20307b = r2
            r1.f20308c = r3
            return
    }

    @Override // p392wa.InterfaceC6823b
    public final java.lang.Object get() {
            r5 = this;
            int r0 = r5.f20306a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L22
        L6:
            java.lang.Object r0 = r5.f20307b
            o9.d r0 = (p251o9.C5180d) r0
            java.lang.Object r1 = r5.f20308c
            android.content.Context r1 = (android.content.Context) r1
            bb.a r2 = new bb.a
            java.lang.String r3 = r0.m11498e()
            y9.i r0 = r0.f20315d
            java.lang.Class<ta.c> r4 = p342ta.InterfaceC6205c.class
            java.lang.Object r0 = r0.mo14246a(r4)
            ta.c r0 = (p342ta.InterfaceC6205c) r0
            r2.<init>(r1, r3, r0)
            return r2
        L22:
            java.lang.Object r0 = r5.f20307b
            y9.i r0 = (p432y9.C7142i) r0
            java.lang.Object r1 = r5.f20308c
            y9.c r1 = (p432y9.C7136c) r1
            int r2 = p432y9.C7142i.f27576g
            java.util.Objects.requireNonNull(r0)
            y9.f<T> r2 = r1.f27563e
            y9.s r3 = new y9.s
            r3.<init>(r1, r0)
            java.lang.Object r0 = r2.mo3940a(r3)
            return r0
    }
}
