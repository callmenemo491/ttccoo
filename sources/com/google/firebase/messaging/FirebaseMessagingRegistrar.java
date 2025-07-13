package com.google.firebase.messaging;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements p432y9.InterfaceC7140g {
    public FirebaseMessagingRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: lambda$getComponents$0$FirebaseMessagingRegistrar */
    public static final /* synthetic */ com.google.firebase.messaging.FirebaseMessaging m3665xc94cb159(p432y9.InterfaceC7137d r9) {
            com.google.firebase.messaging.FirebaseMessaging r8 = new com.google.firebase.messaging.FirebaseMessaging
            java.lang.Class<o9.d> r0 = p251o9.C5180d.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r1 = r0
            o9.d r1 = (p251o9.C5180d) r1
            java.lang.Class<va.a> r0 = va.InterfaceC6629a.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r2 = r0
            va.a r2 = (va.InterfaceC6629a) r2
            java.lang.Class<fb.g> r0 = p095fb.InterfaceC2137g.class
            wa.b r3 = r9.mo14255c(r0)
            java.lang.Class<ua.d> r0 = ua.InterfaceC6369d.class
            wa.b r4 = r9.mo14255c(r0)
            java.lang.Class<xa.d> r0 = p412xa.InterfaceC7011d.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r5 = r0
            xa.d r5 = (p412xa.InterfaceC7011d) r5
            java.lang.Class<t3.g> r0 = p335t3.InterfaceC6154g.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r6 = r0
            t3.g r6 = (p335t3.InterfaceC6154g) r6
            java.lang.Class<ta.d> r0 = p342ta.InterfaceC6206d.class
            java.lang.Object r9 = r9.mo14246a(r0)
            r7 = r9
            ta.d r7 = (p342ta.InterfaceC6206d) r7
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Override // p432y9.InterfaceC7140g
    @androidx.annotation.Keep
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r6 = this;
            r0 = 2
            y9.c[] r0 = new p432y9.C7136c[r0]
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r1 = com.google.firebase.messaging.FirebaseMessaging.class
            y9.c$b r1 = p432y9.C7136c.m14248a(r1)
            java.lang.Class<o9.d> r2 = p251o9.C5180d.class
            y9.k r3 = new y9.k
            r4 = 1
            r5 = 0
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            java.lang.Class<va.a> r2 = va.InterfaceC6629a.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r5)
            r1.m14251a(r3)
            java.lang.Class<fb.g> r2 = p095fb.InterfaceC2137g.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r4)
            r1.m14251a(r3)
            java.lang.Class<ua.d> r2 = ua.InterfaceC6369d.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r4)
            r1.m14251a(r3)
            java.lang.Class<t3.g> r2 = p335t3.InterfaceC6154g.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r5)
            r1.m14251a(r3)
            java.lang.Class<xa.d> r2 = p412xa.InterfaceC7011d.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            java.lang.Class<ta.d> r2 = p342ta.InterfaceC6206d.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            y9.f r2 = p057db.C1415p.f7083a
            r1.f27569e = r2
            r1.m14254d(r4)
            y9.c r1 = r1.m14252b()
            r0[r5] = r1
            java.lang.String r1 = "fire-fcm"
            java.lang.String r2 = "22.0.0"
            y9.c r1 = p095fb.C2136f.m5695a(r1, r2)
            r0[r4] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
