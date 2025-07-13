package com.google.firebase.crashlytics;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements p432y9.InterfaceC7140g {
    public CrashlyticsRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p432y9.InterfaceC7140g
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r7 = this;
            r0 = 2
            y9.c[] r1 = new p432y9.C7136c[r0]
            java.lang.Class<z9.f> r2 = p452z9.C7264f.class
            y9.c$b r2 = p432y9.C7136c.m14248a(r2)
            java.lang.Class<o9.d> r3 = p251o9.C5180d.class
            y9.k r4 = new y9.k
            r5 = 1
            r6 = 0
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<xa.d> r3 = p412xa.InterfaceC7011d.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<aa.a> r3 = p011aa.InterfaceC0045a.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r6, r0)
            r2.m14251a(r4)
            java.lang.Class<s9.a> r3 = p329s9.InterfaceC5997a.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r6, r0)
            r2.m14251a(r4)
            y9.b r3 = new y9.b
            r3.<init>(r7)
            r2.f27569e = r3
            r2.m14254d(r0)
            y9.c r0 = r2.m14252b()
            r1[r6] = r0
            java.lang.String r0 = "fire-cls"
            java.lang.String r2 = "18.2.3"
            y9.c r0 = p095fb.C2136f.m5695a(r0, r2)
            r1[r5] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            return r0
    }
}
