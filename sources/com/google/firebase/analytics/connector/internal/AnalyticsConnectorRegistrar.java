package com.google.firebase.analytics.connector.internal;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements p432y9.InterfaceC7140g {
    public AnalyticsConnectorRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    public static p329s9.InterfaceC5997a lambda$getComponents$0(p432y9.InterfaceC7137d r7) {
            java.lang.Class<o9.d> r0 = p251o9.C5180d.class
            java.lang.Object r0 = r7.mo14246a(r0)
            o9.d r0 = (p251o9.C5180d) r0
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = r7.mo14246a(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<ta.d> r2 = p342ta.InterfaceC6206d.class
            java.lang.Object r7 = r7.mo14246a(r2)
            ta.d r7 = (p342ta.InterfaceC6206d) r7
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r7, r2)
            android.content.Context r2 = r1.getApplicationContext()
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            s9.a r2 = p329s9.C5998b.f23130c
            if (r2 != 0) goto L6c
            java.lang.Class<s9.b> r2 = p329s9.C5998b.class
            monitor-enter(r2)
            s9.a r3 = p329s9.C5998b.f23130c     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L67
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L69
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L69
            boolean r4 = r0.m11501i()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L59
            java.lang.Class<o9.a> r4 = p251o9.C5177a.class
            s9.d r5 = p329s9.ExecutorC6000d.f23134Y     // Catch: java.lang.Throwable -> L69
            s9.c r6 = p329s9.C5999c.f23133a     // Catch: java.lang.Throwable -> L69
            r7.mo12809b(r4, r5, r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = "dataCollectionDefaultEnabled"
            boolean r0 = r0.m11500h()     // Catch: java.lang.Throwable -> L69
            r3.putBoolean(r7, r0)     // Catch: java.lang.Throwable -> L69
        L59:
            s9.b r7 = new s9.b     // Catch: java.lang.Throwable -> L69
            r0 = 0
            k7.o1 r0 = p185k7.C3918o1.m8850c(r1, r0, r0, r0, r3)     // Catch: java.lang.Throwable -> L69
            n7.a r0 = r0.f16792b     // Catch: java.lang.Throwable -> L69
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L69
            p329s9.C5998b.f23130c = r7     // Catch: java.lang.Throwable -> L69
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L6c
        L69:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r7
        L6c:
            s9.a r7 = p329s9.C5998b.f23130c
            return r7
    }

    @Override // p432y9.InterfaceC7140g
    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"MissingPermission"})
    public java.util.List<p432y9.C7136c<?>> getComponents() {
            r7 = this;
            r0 = 2
            y9.c[] r1 = new p432y9.C7136c[r0]
            java.lang.Class<s9.a> r2 = p329s9.InterfaceC5997a.class
            y9.c$b r2 = p432y9.C7136c.m14248a(r2)
            java.lang.Class<o9.d> r3 = p251o9.C5180d.class
            y9.k r4 = new y9.k
            r5 = 1
            r6 = 0
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            java.lang.Class<ta.d> r3 = p342ta.InterfaceC6206d.class
            y9.k r4 = new y9.k
            r4.<init>(r3, r5, r6)
            r2.m14251a(r4)
            t9.a r3 = p341t9.C6197a.f24144a
            r2.m14253c(r3)
            r2.m14254d(r0)
            y9.c r0 = r2.m14252b()
            r1[r6] = r0
            java.lang.String r0 = "fire-analytics"
            java.lang.String r2 = "19.0.2"
            y9.c r0 = p095fb.C2136f.m5695a(r0, r2)
            r1[r5] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            return r0
    }
}
