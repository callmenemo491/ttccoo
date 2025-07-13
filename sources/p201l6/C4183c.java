package p201l6;

import p201l6.C4181a.c;

/* renamed from: l6.c */
/* loaded from: classes.dex */
public class C4183c<O extends p201l6.C4181a.c> {

    /* renamed from: a */
    public final android.content.Context f17346a;

    /* renamed from: b */
    public final java.lang.String f17347b;

    /* renamed from: c */
    public final p201l6.C4181a<O> f17348c;

    /* renamed from: d */
    public final O f17349d;

    /* renamed from: e */
    public final p218m6.C4388b<O> f17350e;

    /* renamed from: f */
    public final android.os.Looper f17351f;

    /* renamed from: g */
    public final int f17352g;

    /* renamed from: h */
    public final p218m6.InterfaceC4397j f17353h;

    /* renamed from: i */
    public final com.google.android.gms.common.api.internal.C1082b f17354i;

    /* renamed from: l6.c$a */
    public static class a {

        /* renamed from: c */
        @androidx.annotation.RecentlyNonNull
        public static final p201l6.C4183c.a f17355c = null;

        /* renamed from: a */
        @androidx.annotation.RecentlyNonNull
        public final p218m6.InterfaceC4397j f17356a;

        /* renamed from: b */
        @androidx.annotation.RecentlyNonNull
        public final android.os.Looper f17357b;

        static {
                m6.a r0 = new m6.a
                r0.<init>()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                l6.c$a r2 = new l6.c$a
                r3 = 0
                r2.<init>(r0, r3, r1)
                p201l6.C4183c.a.f17355c = r2
                return
        }

        public a(p218m6.InterfaceC4397j r1, android.accounts.Account r2, android.os.Looper r3) {
                r0 = this;
                r0.<init>()
                r0.f17356a = r1
                r0.f17357b = r3
                return
        }
    }

    public C4183c(@androidx.annotation.RecentlyNonNull android.content.Context r6, @androidx.annotation.RecentlyNonNull p201l6.C4181a<O> r7, @androidx.annotation.RecentlyNonNull O r8, @androidx.annotation.RecentlyNonNull p201l6.C4183c.a r9) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "Null context is not permitted."
            com.google.android.gms.common.internal.C1101a.m3104i(r6, r0)
            java.lang.String r0 = "Api must not be null."
            com.google.android.gms.common.internal.C1101a.m3104i(r7, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            com.google.android.gms.common.internal.C1101a.m3104i(r9, r0)
            android.content.Context r0 = r6.getApplicationContext()
            r5.f17346a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 != 0) goto L26
            goto L53
        L26:
            r1 = 30
            if (r0 < r1) goto L36
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            goto La5
        L36:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r1 = r0.length()
            if (r1 != r2) goto L50
            char r1 = r0.charAt(r3)
            r4 = 82
            if (r1 < r4) goto L50
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L55
        L53:
            r2 = 0
            goto La5
        L55:
            java.lang.Boolean r0 = p353u6.C6345h.f24796a
            if (r0 == 0) goto L5a
            goto La1
        L5a:
            java.lang.String r0 = "google"
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.NumberFormatException -> L8c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.NumberFormatException -> L8c
            if (r0 == 0) goto L84
            java.lang.String r0 = android.os.Build.ID     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r1 = "RPP1"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.NumberFormatException -> L8c
            if (r0 != 0) goto L84
            java.lang.String r0 = android.os.Build.ID     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r1 = "RPP2"
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.NumberFormatException -> L8c
            if (r0 != 0) goto L84
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.NumberFormatException -> L8c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L8c
            r1 = 6301457(0x602711, float:8.830222E-39)
            if (r0 < r1) goto L84
            goto L85
        L84:
            r2 = 0
        L85:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L8c
            p353u6.C6345h.f24796a = r0     // Catch: java.lang.NumberFormatException -> L8c
            goto L90
        L8c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            p353u6.C6345h.f24796a = r0
        L90:
            java.lang.Boolean r0 = p353u6.C6345h.f24796a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L9f
            java.lang.String r0 = "PlatformVersion"
            java.lang.String r1 = "Build version must be at least 6301457 to support R in gmscore"
            android.util.Log.w(r0, r1)
        L9f:
            java.lang.Boolean r0 = p353u6.C6345h.f24796a
        La1:
            boolean r2 = r0.booleanValue()
        La5:
            if (r2 == 0) goto Lba
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> Lba
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lba
            goto Lbb
        Lba:
            r6 = 0
        Lbb:
            r5.f17347b = r6
            r5.f17348c = r7
            r5.f17349d = r8
            android.os.Looper r0 = r9.f17357b
            r5.f17351f = r0
            m6.b r0 = new m6.b
            r0.<init>(r7, r8, r6)
            r5.f17350e = r0
            m6.n r6 = new m6.n
            android.content.Context r6 = r5.f17346a
            com.google.android.gms.common.api.internal.b r6 = com.google.android.gms.common.api.internal.C1082b.m3054a(r6)
            r5.f17354i = r6
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f5568f0
            int r7 = r7.getAndIncrement()
            r5.f17352g = r7
            m6.j r7 = r9.f17356a
            r5.f17353h = r7
            android.os.Handler r6 = r6.f5573k0
            r7 = 7
            android.os.Message r7 = r6.obtainMessage(r7, r5)
            r6.sendMessage(r7)
            return
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public p248o6.C4902d.a m9325a() {
            r4 = this;
            o6.d$a r0 = new o6.d$a
            r0.<init>()
            O extends l6.a$c r1 = r4.f17349d
            boolean r2 = r1 instanceof p201l6.C4181a.c.b
            r3 = 0
            if (r2 == 0) goto L24
            l6.a$c$b r1 = (p201l6.C4181a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.m9313b()
            if (r1 == 0) goto L24
            java.lang.String r2 = r1.f5340b0
            if (r2 != 0) goto L19
            goto L30
        L19:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r1 = r1.f5340b0
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            r3 = r2
            goto L30
        L24:
            O extends l6.a$c r1 = r4.f17349d
            boolean r2 = r1 instanceof p201l6.C4181a.c.a
            if (r2 == 0) goto L30
            l6.a$c$a r1 = (p201l6.C4181a.c.a) r1
            android.accounts.Account r3 = r1.m9312a()
        L30:
            r0.f19466a = r3
            O extends l6.a$c r1 = r4.f17349d
            boolean r2 = r1 instanceof p201l6.C4181a.c.b
            if (r2 == 0) goto L45
            l6.a$c$b r1 = (p201l6.C4181a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.m9313b()
            if (r1 == 0) goto L45
            java.util.Set r1 = r1.m2926X()
            goto L49
        L45:
            java.util.Set r1 = java.util.Collections.emptySet()
        L49:
            s.c<com.google.android.gms.common.api.Scope> r2 = r0.f19467b
            if (r2 != 0) goto L55
            s.c r2 = new s.c
            r3 = 0
            r2.<init>(r3)
            r0.f19467b = r2
        L55:
            s.c<com.google.android.gms.common.api.Scope> r2 = r0.f19467b
            r2.addAll(r1)
            android.content.Context r1 = r4.f17346a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.f19469d = r1
            android.content.Context r1 = r4.f17346a
            java.lang.String r1 = r1.getPackageName()
            r0.f19468c = r1
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: b */
    public <TResult, A> p327s7.AbstractC5985i<TResult> m9326b(@androidx.annotation.RecentlyNonNull p218m6.AbstractC4398k<A, TResult> r2) {
            r1 = this;
            r0 = 0
            s7.i r2 = r1.m9328d(r0, r2)
            return r2
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: c */
    public <TResult, A> p327s7.AbstractC5985i<TResult> m9327c(@androidx.annotation.RecentlyNonNull p218m6.AbstractC4398k<A, TResult> r2) {
            r1 = this;
            r0 = 1
            s7.i r2 = r1.m9328d(r0, r2)
            return r2
    }

    /* renamed from: d */
    public final <TResult, A> p327s7.AbstractC5985i<TResult> m9328d(int r5, p218m6.AbstractC4398k<A, TResult> r6) {
            r4 = this;
            s7.j r0 = new s7.j
            r0.<init>()
            com.google.android.gms.common.api.internal.b r1 = r4.f17354i
            m6.j r2 = r4.f17353h
            java.util.Objects.requireNonNull(r1)
            int r3 = r6.f17960c
            r1.m3056b(r0, r3, r4)
            com.google.android.gms.common.api.internal.t r3 = new com.google.android.gms.common.api.internal.t
            r3.<init>(r5, r6, r0, r2)
            android.os.Handler r5 = r1.f5573k0
            r6 = 4
            m6.p r2 = new m6.p
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f5569g0
            int r1 = r1.get()
            r2.<init>(r3, r1, r4)
            android.os.Message r6 = r5.obtainMessage(r6, r2)
            r5.sendMessage(r6)
            s7.q<TResult> r5 = r0.f23075a
            return r5
    }
}
