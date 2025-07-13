package com.google.firebase.installations;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements p432y9.InterfaceC7140g {
    public FirebaseInstallationsRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static /* synthetic */ p412xa.InterfaceC7011d m3649a(p432y9.InterfaceC7137d r0) {
            xa.d r0 = lambda$getComponents$0(r0)
            return r0
    }

    private static /* synthetic */ p412xa.InterfaceC7011d lambda$getComponents$0(p432y9.InterfaceC7137d r4) {
            xa.c r0 = new xa.c
            java.lang.Class<o9.d> r1 = p251o9.C5180d.class
            java.lang.Object r1 = r4.mo14246a(r1)
            o9.d r1 = (p251o9.C5180d) r1
            java.lang.Class<fb.g> r2 = p095fb.InterfaceC2137g.class
            wa.b r2 = r4.mo14255c(r2)
            java.lang.Class<ua.d> r3 = ua.InterfaceC6369d.class
            wa.b r4 = r4.mo14255c(r3)
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // p432y9.InterfaceC7140g
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r6 = this;
            r0 = 2
            y9.c[] r0 = new p432y9.C7136c[r0]
            java.lang.Class<xa.d> r1 = p412xa.InterfaceC7011d.class
            y9.c$b r1 = p432y9.C7136c.m14248a(r1)
            java.lang.Class<o9.d> r2 = p251o9.C5180d.class
            y9.k r3 = new y9.k
            r4 = 1
            r5 = 0
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            java.lang.Class<ua.d> r2 = ua.InterfaceC6369d.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r4)
            r1.m14251a(r3)
            java.lang.Class<fb.g> r2 = p095fb.InterfaceC2137g.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r4)
            r1.m14251a(r3)
            q9.b r2 = p289q9.C5603b.f21768c
            r1.m14253c(r2)
            y9.c r1 = r1.m14252b()
            r0[r5] = r1
            java.lang.String r1 = "fire-installations"
            java.lang.String r2 = "17.0.0"
            y9.c r1 = p095fb.C2136f.m5695a(r1, r2)
            r0[r4] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
