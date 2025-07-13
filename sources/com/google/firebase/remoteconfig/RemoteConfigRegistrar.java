package com.google.firebase.remoteconfig;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements p432y9.InterfaceC7140g {
    public RemoteConfigRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static /* synthetic */ gb.C2322l m3673a(p432y9.InterfaceC7137d r0) {
            gb.l r0 = lambda$getComponents$0(r0)
            return r0
    }

    private static gb.C2322l lambda$getComponents$0(p432y9.InterfaceC7137d r9) {
            gb.l r6 = new gb.l
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<o9.d> r0 = p251o9.C5180d.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r2 = r0
            o9.d r2 = (p251o9.C5180d) r2
            java.lang.Class<xa.d> r0 = p412xa.InterfaceC7011d.class
            java.lang.Object r0 = r9.mo14246a(r0)
            r3 = r0
            xa.d r3 = (p412xa.InterfaceC7011d) r3
            java.lang.Class<q9.a> r0 = p289q9.C5602a.class
            java.lang.Object r0 = r9.mo14246a(r0)
            q9.a r0 = (p289q9.C5602a) r0
            java.lang.String r4 = "frc"
            monitor-enter(r0)
            java.util.Map<java.lang.String, p9.c> r5 = r0.f21765a     // Catch: java.lang.Throwable -> L50
            boolean r5 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L50
            if (r5 != 0) goto L3c
            java.util.Map<java.lang.String, p9.c> r5 = r0.f21765a     // Catch: java.lang.Throwable -> L50
            p9.c r7 = new p9.c     // Catch: java.lang.Throwable -> L50
            wa.b<s9.a> r8 = r0.f21766b     // Catch: java.lang.Throwable -> L50
            r7.<init>(r8, r4)     // Catch: java.lang.Throwable -> L50
            r5.put(r4, r7)     // Catch: java.lang.Throwable -> L50
        L3c:
            java.util.Map<java.lang.String, p9.c> r5 = r0.f21765a     // Catch: java.lang.Throwable -> L50
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L50
            p9.c r4 = (p273p9.C5378c) r4     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            java.lang.Class<s9.a> r0 = p329s9.InterfaceC5997a.class
            wa.b r5 = r9.mo14255c(r0)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L50:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
    }

    @Override // p432y9.InterfaceC7140g
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r7 = this;
            r0 = 2
            y9.c[] r1 = new p432y9.C7136c[r0]
            java.lang.Class<gb.l> r2 = gb.C2322l.class
            y9.c$b r2 = p432y9.C7136c.m14248a(r2)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            y9.k r4 = new y9.k
            r5 = 1
            r6 = 0
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<o9.d> r3 = p251o9.C5180d.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<xa.d> r3 = p412xa.InterfaceC7011d.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<q9.a> r3 = p289q9.C5602a.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<s9.a> r3 = p329s9.InterfaceC5997a.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r6, r5)
            r2.m14251a(r4)
            gb.m r3 = gb.C2323m.f10562a
            r2.m14253c(r3)
            r2.m14254d(r0)
            y9.c r0 = r2.m14252b()
            r1[r6] = r0
            java.lang.String r0 = "fire-rc"
            java.lang.String r2 = "21.0.1"
            y9.c r0 = p095fb.C2136f.m5695a(r0, r2)
            r1[r5] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            return r0
    }
}
