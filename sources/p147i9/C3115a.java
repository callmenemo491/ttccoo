package p147i9;

/* renamed from: i9.a */
/* loaded from: classes.dex */
public final class C3115a {

    /* renamed from: c */
    public static final /* synthetic */ int f12503c = 0;

    /* renamed from: a */
    public final p093f9.InterfaceC2083a f12504a;

    /* renamed from: b */
    public p093f9.C2091i f12505b;

    /* renamed from: i9.a$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: i9.a$b */
    public static final class b {

        /* renamed from: a */
        public androidx.appcompat.widget.C0311x f12506a;

        /* renamed from: b */
        public p093f9.InterfaceC2092j f12507b;

        /* renamed from: c */
        public java.lang.String f12508c;

        /* renamed from: d */
        public p093f9.InterfaceC2083a f12509d;

        /* renamed from: e */
        public p093f9.C2088f f12510e;

        /* renamed from: f */
        public p093f9.C2091i f12511f;

        public b() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f12506a = r0
                r1.f12507b = r0
                r1.f12508c = r0
                r1.f12509d = r0
                r1.f12510e = r0
                return
        }

        /* renamed from: a */
        public synchronized p147i9.C3115a m7573a() {
                r2 = this;
                monitor-enter(r2)
                java.lang.String r0 = r2.f12508c     // Catch: java.lang.Throwable -> L19
                if (r0 == 0) goto Lb
                f9.a r0 = r2.m7575c()     // Catch: java.lang.Throwable -> L19
                r2.f12509d = r0     // Catch: java.lang.Throwable -> L19
            Lb:
                f9.i r0 = r2.m7574b()     // Catch: java.lang.Throwable -> L19
                r2.f12511f = r0     // Catch: java.lang.Throwable -> L19
                i9.a r0 = new i9.a     // Catch: java.lang.Throwable -> L19
                r1 = 0
                r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L19
                monitor-exit(r2)
                return r0
            L19:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        /* renamed from: b */
        public final p093f9.C2091i m7574b() {
                r7 = this;
                f9.a r0 = r7.f12509d     // Catch: java.io.FileNotFoundException -> L32
                if (r0 == 0) goto L1b
                androidx.appcompat.widget.x r1 = r7.f12506a     // Catch: java.security.GeneralSecurityException -> Lf p221m9.C4434a0 -> L11 java.io.FileNotFoundException -> L32
                f9.h r0 = p093f9.C2090h.m5525c(r1, r0)     // Catch: java.security.GeneralSecurityException -> Lf p221m9.C4434a0 -> L11 java.io.FileNotFoundException -> L32
                f9.i r0 = p093f9.C2091i.m5528f(r0)     // Catch: java.security.GeneralSecurityException -> Lf p221m9.C4434a0 -> L11 java.io.FileNotFoundException -> L32
                goto L31
            Lf:
                r0 = move-exception
                goto L12
            L11:
                r0 = move-exception
            L12:
                int r1 = p147i9.C3115a.f12503c     // Catch: java.io.FileNotFoundException -> L32
                java.lang.String r1 = "a"
                java.lang.String r2 = "cannot decrypt keyset: "
                android.util.Log.w(r1, r2, r0)     // Catch: java.io.FileNotFoundException -> L32
            L1b:
                androidx.appcompat.widget.x r0 = r7.f12506a     // Catch: java.io.FileNotFoundException -> L32
                byte[] r0 = r0.m824o()     // Catch: java.io.FileNotFoundException -> L32
                m9.p r1 = p221m9.C4478p.m10222a()     // Catch: java.io.FileNotFoundException -> L32
                l9.a0 r0 = p204l9.C4198a0.m9342E(r0, r1)     // Catch: java.io.FileNotFoundException -> L32
                f9.h r0 = p093f9.C2090h.m5524a(r0)     // Catch: java.io.FileNotFoundException -> L32
                f9.i r0 = p093f9.C2091i.m5528f(r0)     // Catch: java.io.FileNotFoundException -> L32
            L31:
                return r0
            L32:
                r0 = move-exception
                int r1 = p147i9.C3115a.f12503c
                java.lang.String r1 = "a"
                java.lang.String r2 = "keyset not found, will generate a new one"
                android.util.Log.w(r1, r2, r0)
                f9.f r0 = r7.f12510e
                if (r0 == 0) goto L180
                f9.i r0 = new f9.i
                l9.a0$b r1 = p204l9.C4198a0.m9341D()
                r0.<init>(r1)
                f9.f r1 = r7.f12510e
                monitor-enter(r0)
                l9.y r1 = r1.f9506a     // Catch: java.lang.Throwable -> L17d
                r2 = 0
                r0.m5529a(r1, r2)     // Catch: java.lang.Throwable -> L17d
                monitor-exit(r0)
                f9.h r1 = r0.m5530b()
                l9.a0 r1 = r1.f9512a
                l9.b0 r1 = p093f9.C2101s.m5554a(r1)
                l9.b0$c r1 = r1.m9369z(r2)
                int r1 = r1.m9376B()
                monitor-enter(r0)
                r3 = 0
            L67:
                l9.a0$b r4 = r0.f9513a     // Catch: java.lang.Throwable -> L17a
                MessageType extends m9.x<MessageType, BuilderType> r4 = r4.f18293Z     // Catch: java.lang.Throwable -> L17a
                l9.a0 r4 = (p204l9.C4198a0) r4     // Catch: java.lang.Throwable -> L17a
                int r4 = r4.m9346A()     // Catch: java.lang.Throwable -> L17a
                if (r3 >= r4) goto L163
                l9.a0$b r4 = r0.f9513a     // Catch: java.lang.Throwable -> L17a
                MessageType extends m9.x<MessageType, BuilderType> r4 = r4.f18293Z     // Catch: java.lang.Throwable -> L17a
                l9.a0 r4 = (p204l9.C4198a0) r4     // Catch: java.lang.Throwable -> L17a
                l9.a0$c r4 = r4.m9349z(r3)     // Catch: java.lang.Throwable -> L17a
                int r5 = r4.m9357C()     // Catch: java.lang.Throwable -> L17a
                if (r5 != r1) goto L15f
                l9.x r3 = r4.m9359E()     // Catch: java.lang.Throwable -> L17a
                l9.x r4 = p204l9.EnumC4230x.f17386a0     // Catch: java.lang.Throwable -> L17a
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L17a
                if (r3 == 0) goto L148
                l9.a0$b r3 = r0.f9513a     // Catch: java.lang.Throwable -> L17a
                r3.m10377o()     // Catch: java.lang.Throwable -> L17a
                MessageType extends m9.x<MessageType, BuilderType> r3 = r3.f18293Z     // Catch: java.lang.Throwable -> L17a
                l9.a0 r3 = (p204l9.C4198a0) r3     // Catch: java.lang.Throwable -> L17a
                p204l9.C4198a0.m9344x(r3, r1)     // Catch: java.lang.Throwable -> L17a
                monitor-exit(r0)
                f9.a r1 = r7.f12509d
                if (r1 == 0) goto L11f
                f9.h r1 = r0.m5530b()
                f9.j r3 = r7.f12507b
                f9.a r4 = r7.f12509d
                l9.a0 r1 = r1.f9512a
                byte[] r5 = r1.mo9889e()
                byte[] r6 = new byte[r2]
                byte[] r5 = r4.mo5506a(r5, r6)
                byte[] r2 = new byte[r2]     // Catch: p221m9.C4434a0 -> L117
                byte[] r2 = r4.mo5507b(r5, r2)     // Catch: p221m9.C4434a0 -> L117
                m9.p r4 = p221m9.C4478p.m10222a()     // Catch: p221m9.C4434a0 -> L117
                l9.a0 r2 = p204l9.C4198a0.m9342E(r2, r4)     // Catch: p221m9.C4434a0 -> L117
                boolean r2 = r2.equals(r1)     // Catch: p221m9.C4434a0 -> L117
                if (r2 == 0) goto L10f
                l9.r$b r2 = p204l9.C4224r.m9495A()
                m9.h r4 = p221m9.AbstractC4454h.m10053h(r5)
                r2.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r5 = r2.f18293Z
                l9.r r5 = (p204l9.C4224r) r5
                p204l9.C4224r.m9498x(r5, r4)
                l9.b0 r1 = p093f9.C2101s.m5554a(r1)
                r2.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r4 = r2.f18293Z
                l9.r r4 = (p204l9.C4224r) r4
                p204l9.C4224r.m9499y(r4, r1)
                m9.x r1 = r2.m10375k()
                l9.r r1 = (p204l9.C4224r) r1
                i9.d r3 = (p147i9.C3118d) r3
                android.content.SharedPreferences$Editor r2 = r3.f12515a
                java.lang.String r3 = r3.f12516b
                byte[] r1 = r1.mo9889e()
                java.lang.String r1 = p074e9.C1805a.m4524i(r1)
                android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
                boolean r1 = r1.commit()
                if (r1 == 0) goto L107
                goto L13f
            L107:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Failed to write to SharedPreferences"
                r0.<init>(r1)
                throw r0
            L10f:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: p221m9.C4434a0 -> L117
                java.lang.String r1 = "cannot encrypt keyset"
                r0.<init>(r1)     // Catch: p221m9.C4434a0 -> L117
                throw r0     // Catch: p221m9.C4434a0 -> L117
            L117:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "invalid keyset, corrupted key material"
                r0.<init>(r1)
                throw r0
            L11f:
                f9.h r1 = r0.m5530b()
                f9.j r2 = r7.f12507b
                l9.a0 r1 = r1.f9512a
                i9.d r2 = (p147i9.C3118d) r2
                android.content.SharedPreferences$Editor r3 = r2.f12515a
                java.lang.String r2 = r2.f12516b
                byte[] r1 = r1.mo9889e()
                java.lang.String r1 = p074e9.C1805a.m4524i(r1)
                android.content.SharedPreferences$Editor r1 = r3.putString(r2, r1)
                boolean r1 = r1.commit()
                if (r1 == 0) goto L140
            L13f:
                return r0
            L140:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Failed to write to SharedPreferences"
                r0.<init>(r1)
                throw r0
            L148:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L17a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17a
                r3.<init>()     // Catch: java.lang.Throwable -> L17a
                java.lang.String r4 = "cannot set key as primary because it's not enabled: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L17a
                r3.append(r1)     // Catch: java.lang.Throwable -> L17a
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L17a
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L17a
                throw r2     // Catch: java.lang.Throwable -> L17a
            L15f:
                int r3 = r3 + 1
                goto L67
            L163:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L17a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17a
                r3.<init>()     // Catch: java.lang.Throwable -> L17a
                java.lang.String r4 = "key not found: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L17a
                r3.append(r1)     // Catch: java.lang.Throwable -> L17a
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L17a
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L17a
                throw r2     // Catch: java.lang.Throwable -> L17a
            L17a:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L17d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L180:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "cannot read or generate keyset"
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: c */
        public final p093f9.InterfaceC2083a m7575c() {
                r10 = this;
                java.lang.String r0 = "a"
                int r1 = p147i9.C3115a.f12503c
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 0
                r3 = 1
                r4 = 23
                if (r1 < r4) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                r4 = 0
                if (r1 != 0) goto L18
                java.lang.String r1 = "Android Keystore requires at least Android M"
                android.util.Log.w(r0, r1)
                return r4
            L18:
                i9.c$a r1 = new i9.c$a
                r1.<init>()
                java.security.KeyStore r1 = r1.f12514a
                java.lang.String r5 = r10.f12508c
                java.lang.String r6 = "android-keystore://"
                java.lang.String r5 = p236n9.C4717r.m10775b(r6, r5)
                boolean r5 = r1.containsAlias(r5)
                java.lang.String r7 = "cannot use Android Keystore, it'll be disabled"
                if (r5 != 0) goto L3c
                java.lang.String r8 = r10.f12508c     // Catch: java.security.GeneralSecurityException -> L35
                p147i9.C3117c.m7577c(r8)     // Catch: java.security.GeneralSecurityException -> L35
                goto L3c
            L35:
                r1 = move-exception
                int r2 = p147i9.C3115a.f12503c
                android.util.Log.w(r0, r7, r1)
                return r4
            L3c:
                java.lang.String r8 = r10.f12508c     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                i9.b r9 = new i9.b     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                java.lang.String r6 = p236n9.C4717r.m10775b(r6, r8)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                r9.<init>(r6, r1)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                r1 = 10
                byte[] r1 = p236n9.C4716q.m10773a(r1)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                byte[] r6 = new byte[r2]     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                byte[] r8 = r9.mo5506a(r1, r6)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                byte[] r6 = r9.mo5507b(r8, r6)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                boolean r1 = java.util.Arrays.equals(r1, r6)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                if (r1 == 0) goto L5e
                return r9
            L5e:
                java.security.KeyStoreException r1 = new java.security.KeyStoreException     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                java.lang.String r6 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"
                r1.<init>(r6)     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
                throw r1     // Catch: java.security.ProviderException -> L66 java.security.GeneralSecurityException -> L68
            L66:
                r1 = move-exception
                goto L69
            L68:
                r1 = move-exception
            L69:
                if (r5 != 0) goto L71
                int r2 = p147i9.C3115a.f12503c
                android.util.Log.w(r0, r7, r1)
                return r4
            L71:
                java.security.KeyStoreException r0 = new java.security.KeyStoreException
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = r10.f12508c
                r3[r2] = r4
                java.lang.String r2 = "the master key %s exists but is unusable"
                java.lang.String r2 = java.lang.String.format(r2, r3)
                r0.<init>(r2, r1)
                throw r0
        }

        /* renamed from: d */
        public p147i9.C3115a.b m7576d(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                if (r2 == 0) goto L11
                androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
                r0.<init>(r2, r3, r4)
                r1.f12506a = r0
                i9.d r0 = new i9.d
                r0.<init>(r2, r3, r4)
                r1.f12507b = r0
                return r1
            L11:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "need an Android context"
                r2.<init>(r3)
                throw r2
        }
    }

    public C3115a(p147i9.C3115a.b r1, p147i9.C3115a.a r2) {
            r0 = this;
            r0.<init>()
            f9.a r2 = r1.f12509d
            r0.f12504a = r2
            f9.i r1 = r1.f12511f
            r0.f12505b = r1
            return
    }
}
