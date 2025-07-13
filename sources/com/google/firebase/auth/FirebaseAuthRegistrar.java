package com.google.firebase.auth;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements p432y9.InterfaceC7140g {
    public FirebaseAuthRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ com.google.firebase.auth.FirebaseAuth lambda$getComponents$0(p432y9.InterfaceC7137d r1) {
            java.lang.Class<o9.d> r0 = p251o9.C5180d.class
            java.lang.Object r1 = r1.mo14246a(r0)
            o9.d r1 = (p251o9.C5180d) r1
            x9.e0 r0 = new x9.e0
            r0.<init>(r1)
            return r0
    }

    @Override // p432y9.InterfaceC7140g
    @androidx.annotation.Keep
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r8 = this;
            r0 = 2
            y9.c[] r1 = new p432y9.C7136c[r0]
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<x9.b> r4 = p411x9.InterfaceC6976b.class
            r5 = 0
            r3[r5] = r4
            java.lang.Class<com.google.firebase.auth.FirebaseAuth> r4 = com.google.firebase.auth.FirebaseAuth.class
            y9.c$b r6 = new y9.c$b
            r7 = 0
            r6.<init>(r4, r3, r7)
            java.lang.Class<o9.d> r3 = p251o9.C5180d.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r2, r5)
            r6.m14251a(r4)
            v9.p0 r3 = p375v9.C6617p0.f25793a
            r6.f27569e = r3
            r6.m14254d(r0)
            y9.c r0 = r6.m14252b()
            r1[r5] = r0
            java.lang.String r0 = "fire-auth"
            java.lang.String r3 = "21.0.1"
            y9.c r0 = p095fb.C2136f.m5695a(r0, r3)
            r1[r2] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            return r0
    }
}
