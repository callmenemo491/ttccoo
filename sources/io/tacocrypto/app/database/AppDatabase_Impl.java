package io.tacocrypto.app.database;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends io.tacocrypto.app.database.AppDatabase {

    /* renamed from: s */
    public static final /* synthetic */ int f14247s = 0;

    /* renamed from: q */
    public volatile p130hd.InterfaceC3028d f14248q;

    /* renamed from: r */
    public volatile p130hd.InterfaceC3026b f14249r;

    /* renamed from: io.tacocrypto.app.database.AppDatabase_Impl$a */
    public class C3200a extends p179k1.C3665w.a {

        /* renamed from: b */
        public final /* synthetic */ io.tacocrypto.app.database.AppDatabase_Impl f14250b;

        public C3200a(io.tacocrypto.app.database.AppDatabase_Impl r1, int r2) {
                r0 = this;
                r0.f14250b = r1
                r0.<init>(r2)
                return
        }

        @Override // p179k1.C3665w.a
        /* renamed from: a */
        public p179k1.C3665w.b mo7719a(p243o1.InterfaceC4871a r21) {
                r20 = this;
                r0 = r21
                java.util.HashMap r1 = new java.util.HashMap
                r2 = 2
                r1.<init>(r2)
                m1.d$a r2 = new m1.d$a
                java.lang.String r4 = "username"
                java.lang.String r5 = "TEXT"
                r6 = 1
                r7 = 1
                r8 = 0
                r9 = 1
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9)
                java.lang.String r3 = "username"
                r1.put(r3, r2)
                m1.d$a r2 = new m1.d$a
                java.lang.String r5 = "type"
                java.lang.String r6 = "TEXT"
                r8 = 0
                r9 = 0
                r10 = 1
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10)
                java.lang.String r3 = "type"
                r1.put(r3, r2)
                java.util.HashSet r2 = new java.util.HashSet
                r3 = 0
                r2.<init>(r3)
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>(r3)
                m1.d r5 = new m1.d
                java.lang.String r6 = "wallets"
                r5.<init>(r6, r1, r2, r4)
                m1.d r1 = p213m1.C4318d.m9647a(r0, r6)
                boolean r2 = r5.equals(r1)
                java.lang.String r4 = "\n Found:\n"
                if (r2 != 0) goto L68
                k1.w$b r0 = new k1.w$b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "wallets(io.tacocrypto.app.database.model.Wallet).\n Expected:\n"
                r2.append(r6)
                r2.append(r5)
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r3, r1)
                return r0
            L68:
                java.util.HashMap r1 = new java.util.HashMap
                r2 = 3
                r1.<init>(r2)
                m1.d$a r2 = new m1.d$a
                r8 = 1
                r12 = 1
                r10 = 0
                r11 = 1
                r9 = 1
                java.lang.String r6 = "id"
                java.lang.String r7 = "INTEGER"
                r5 = r2
                r5.<init>(r6, r7, r8, r9, r10, r11)
                java.lang.String r5 = "id"
                r1.put(r5, r2)
                m1.d$a r2 = new m1.d$a
                r5 = 0
                r6 = 0
                r7 = 1
                r16 = 1
                r17 = 0
                r18 = 0
                r19 = 1
                java.lang.String r14 = "address"
                java.lang.String r15 = "TEXT"
                r13 = r2
                r13.<init>(r14, r15, r16, r17, r18, r19)
                java.lang.String r8 = "address"
                r1.put(r8, r2)
                m1.d$a r2 = new m1.d$a
                java.lang.String r10 = "name"
                java.lang.String r11 = "TEXT"
                r9 = r2
                r13 = r5
                r14 = r6
                r15 = r7
                r9.<init>(r10, r11, r12, r13, r14, r15)
                java.lang.String r5 = "name"
                r1.put(r5, r2)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>(r3)
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>(r3)
                m1.d r6 = new m1.d
                java.lang.String r7 = "contacts"
                r6.<init>(r7, r1, r2, r5)
                m1.d r0 = p213m1.C4318d.m9647a(r0, r7)
                boolean r1 = r6.equals(r0)
                if (r1 != 0) goto Le6
                k1.w$b r1 = new k1.w$b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "contacts(io.tacocrypto.app.database.model.Contact).\n Expected:\n"
                r2.append(r5)
                r2.append(r6)
                r2.append(r4)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r3, r0)
                return r1
            Le6:
                k1.w$b r0 = new k1.w$b
                r1 = 1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    public AppDatabase_Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p179k1.AbstractC3664v
    /* renamed from: c */
    public p179k1.C3662t mo7714c() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 0
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            k1.t r1 = new k1.t
            java.lang.String r3 = "wallets"
            java.lang.String r4 = "contacts"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            r1.<init>(r5, r0, r2, r3)
            return r1
    }

    @Override // p179k1.AbstractC3664v
    /* renamed from: d */
    public p243o1.InterfaceC4873c mo7715d(p179k1.C3655m r5) {
            r4 = this;
            k1.w r0 = new k1.w
            io.tacocrypto.app.database.AppDatabase_Impl$a r1 = new io.tacocrypto.app.database.AppDatabase_Impl$a
            r2 = 1
            r1.<init>(r4, r2)
            java.lang.String r2 = "919611ef948b8ee4a59dd43ad6337e2d"
            java.lang.String r3 = "9ffdebb490f389286d5564778fa8517d"
            r0.<init>(r5, r1, r2, r3)
            android.content.Context r1 = r5.f16147b
            java.lang.String r2 = r5.f16148c
            if (r1 == 0) goto L20
            o1.c$b r5 = r5.f16146a
            p1.c r5 = (p265p1.C5344c) r5
            p1.b r5 = new p1.b
            r3 = 0
            r5.<init>(r1, r2, r0, r3)
            return r5
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must set a non-null context to create the configuration."
            r5.<init>(r0)
            throw r5
    }

    @Override // p179k1.AbstractC3664v
    /* renamed from: e */
    public java.util.List<p196l1.AbstractC4163b> mo7716e(java.util.Map<java.lang.Class<? extends p196l1.InterfaceC4162a>, p196l1.InterfaceC4162a> r1) {
            r0 = this;
            r1 = 0
            l1.b[] r1 = new p196l1.AbstractC4163b[r1]
            java.util.List r1 = java.util.Arrays.asList(r1)
            return r1
    }

    @Override // p179k1.AbstractC3664v
    /* renamed from: f */
    public java.util.Set<java.lang.Class<? extends p196l1.InterfaceC4162a>> mo7717f() {
            r1 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
    }

    @Override // p179k1.AbstractC3664v
    /* renamed from: g */
    public java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> mo7718g() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<hd.d> r1 = p130hd.InterfaceC3028d.class
            java.util.List r2 = java.util.Collections.emptyList()
            r0.put(r1, r2)
            java.lang.Class<hd.b> r1 = p130hd.InterfaceC3026b.class
            java.util.List r2 = java.util.Collections.emptyList()
            r0.put(r1, r2)
            return r0
    }

    @Override // io.tacocrypto.app.database.AppDatabase
    /* renamed from: o */
    public p130hd.InterfaceC3026b mo7712o() {
            r1 = this;
            hd.b r0 = r1.f14249r
            if (r0 == 0) goto L7
            hd.b r0 = r1.f14249r
            return r0
        L7:
            monitor-enter(r1)
            hd.b r0 = r1.f14249r     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            hd.c r0 = new hd.c     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1.f14249r = r0     // Catch: java.lang.Throwable -> L17
        L13:
            hd.b r0 = r1.f14249r     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // io.tacocrypto.app.database.AppDatabase
    /* renamed from: p */
    public p130hd.InterfaceC3028d mo7713p() {
            r1 = this;
            hd.d r0 = r1.f14248q
            if (r0 == 0) goto L7
            hd.d r0 = r1.f14248q
            return r0
        L7:
            monitor-enter(r1)
            hd.d r0 = r1.f14248q     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            hd.e r0 = new hd.e     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1.f14248q = r0     // Catch: java.lang.Throwable -> L17
        L13:
            hd.d r0 = r1.f14248q     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
