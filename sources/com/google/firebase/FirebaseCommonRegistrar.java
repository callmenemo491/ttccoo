package com.google.firebase;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements p432y9.InterfaceC7140g {
    public FirebaseCommonRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static java.lang.String m3625a(java.lang.String r2) {
            r0 = 32
            r1 = 95
            java.lang.String r2 = r2.replace(r0, r1)
            r0 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    @Override // p432y9.InterfaceC7140g
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<fb.g> r1 = p095fb.InterfaceC2137g.class
            y9.c$b r1 = p432y9.C7136c.m14248a(r1)
            java.lang.Class<fb.d> r2 = p095fb.AbstractC2134d.class
            y9.k r3 = new y9.k
            r4 = 2
            r5 = 0
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            q9.b r2 = p289q9.C5603b.f21769d
            r1.m14253c(r2)
            y9.c r1 = r1.m14252b()
            r0.add(r1)
            int r1 = ua.C6367b.f24835b
            java.lang.Class<ua.d> r1 = ua.InterfaceC6369d.class
            y9.c$b r1 = p432y9.C7136c.m14248a(r1)
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            y9.k r3 = new y9.k
            r6 = 1
            r3.<init>(r2, r6, r5)
            r1.m14251a(r3)
            java.lang.Class<ua.c> r2 = ua.InterfaceC6368c.class
            y9.k r3 = new y9.k
            r3.<init>(r2, r4, r5)
            r1.m14251a(r3)
            oa.a r2 = p252oa.C5186a.f20332c
            r1.m14253c(r2)
            y9.c r1 = r1.m14252b()
            r0.add(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "fire-android"
            y9.c r1 = p095fb.C2136f.m5695a(r2, r1)
            r0.add(r1)
            java.lang.String r1 = "fire-core"
            java.lang.String r2 = "20.0.0"
            y9.c r1 = p095fb.C2136f.m5695a(r1, r2)
            r0.add(r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r1 = m3625a(r1)
            java.lang.String r2 = "device-name"
            y9.c r1 = p095fb.C2136f.m5695a(r2, r1)
            r0.add(r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r1 = m3625a(r1)
            java.lang.String r2 = "device-model"
            y9.c r1 = p095fb.C2136f.m5695a(r2, r1)
            r0.add(r1)
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r1 = m3625a(r1)
            java.lang.String r2 = "device-brand"
            y9.c r1 = p095fb.C2136f.m5695a(r2, r1)
            r0.add(r1)
            k1.c r1 = p179k1.C3644c.f16095q0
            java.lang.String r2 = "android-target-sdk"
            y9.c r1 = p095fb.C2136f.m5696b(r2, r1)
            r0.add(r1)
            k1.b r1 = p179k1.C3642b.f16067p0
            java.lang.String r2 = "android-min-sdk"
            y9.c r1 = p095fb.C2136f.m5696b(r2, r1)
            r0.add(r1)
            androidx.room.a r1 = androidx.room.C0618a.f3665o0
            java.lang.String r2 = "android-platform"
            y9.c r1 = p095fb.C2136f.m5696b(r2, r1)
            r0.add(r1)
            k1.d r1 = p179k1.C3646d.f16126o0
            java.lang.String r2 = "android-installer"
            y9.c r1 = p095fb.C2136f.m5696b(r2, r1)
            r0.add(r1)
            ch.c r1 = ch.C0976c.f5045c0     // Catch: java.lang.NoClassDefFoundError -> Lc6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NoClassDefFoundError -> Lc6
            goto Lc7
        Lc6:
            r1 = 0
        Lc7:
            if (r1 == 0) goto Ld2
            java.lang.String r2 = "kotlin"
            y9.c r1 = p095fb.C2136f.m5695a(r2, r1)
            r0.add(r1)
        Ld2:
            return r0
    }
}
