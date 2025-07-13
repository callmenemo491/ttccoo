package com.google.firebase.abt.component;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements p432y9.InterfaceC7140g {
    public AbtRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static /* synthetic */ p289q9.C5602a m3626a(p432y9.InterfaceC7137d r0) {
            q9.a r0 = lambda$getComponents$0(r0)
            return r0
    }

    private static /* synthetic */ p289q9.C5602a lambda$getComponents$0(p432y9.InterfaceC7137d r3) {
            q9.a r0 = new q9.a
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r3.mo14246a(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<s9.a> r2 = p329s9.InterfaceC5997a.class
            wa.b r3 = r3.mo14255c(r2)
            r0.<init>(r1, r3)
            return r0
    }

    @Override // p432y9.InterfaceC7140g
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r6 = this;
            r0 = 2
            y9.c[] r0 = new p432y9.C7136c[r0]
            java.lang.Class<q9.a> r1 = p289q9.C5602a.class
            y9.c$b r1 = p432y9.C7136c.m14248a(r1)
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            y9.k r3 = new y9.k
            r4 = 1
            r5 = 0
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            java.lang.Class<s9.a> r2 = p329s9.InterfaceC5997a.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r5, r4)
            r1.m14251a(r3)
            q9.b r2 = p289q9.C5603b.f21767b
            r1.m14253c(r2)
            y9.c r1 = r1.m14252b()
            r0[r5] = r1
            java.lang.String r1 = "fire-abt"
            java.lang.String r2 = "21.0.0"
            y9.c r1 = p095fb.C2136f.m5695a(r1, r2)
            r0[r4] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
