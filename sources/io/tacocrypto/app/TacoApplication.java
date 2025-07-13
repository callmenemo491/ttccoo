package io.tacocrypto.app;

/* loaded from: classes.dex */
public final class TacoApplication extends android.app.Application {

    /* renamed from: Y */
    public p238nd.C4728b0 f14209Y;

    /* renamed from: Z */
    public p238nd.C4778u f14210Z;

    /* renamed from: a0 */
    public p238nd.C4753j1 f14211a0;

    /* renamed from: b0 */
    public p238nd.C4756k1 f14212b0;

    /* renamed from: c0 */
    public p238nd.C4732c1 f14213c0;

    public TacoApplication() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final io.tacocrypto.app.database.AppDatabase m7706a() {
            r5 = this;
            io.tacocrypto.app.database.AppDatabase r0 = io.tacocrypto.app.database.AppDatabase.f14244n
            java.lang.String r0 = "context"
            p214m2.C4339q.m9706k(r5, r0)
            io.tacocrypto.app.database.AppDatabase r0 = io.tacocrypto.app.database.AppDatabase.f14246p
            if (r0 != 0) goto L30
            io.tacocrypto.app.database.AppDatabase r0 = io.tacocrypto.app.database.AppDatabase.f14244n
            java.lang.Object r0 = io.tacocrypto.app.database.AppDatabase.f14245o
            monitor-enter(r0)
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class<io.tacocrypto.app.database.AppDatabase> r2 = io.tacocrypto.app.database.AppDatabase.class
            java.lang.String r3 = "taco-db-app"
            k1.v$a r4 = new k1.v$a     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r4.f16205f = r1     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            r4.f16206g = r1     // Catch: java.lang.Throwable -> L2d
            k1.v r1 = r4.m8118a()     // Catch: java.lang.Throwable -> L2d
            io.tacocrypto.app.database.AppDatabase r1 = (io.tacocrypto.app.database.AppDatabase) r1     // Catch: java.lang.Throwable -> L2d
            io.tacocrypto.app.database.AppDatabase.f14246p = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            goto L30
        L2d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L30:
            io.tacocrypto.app.database.AppDatabase r0 = io.tacocrypto.app.database.AppDatabase.f14246p
            p214m2.C4339q.m9704i(r0)
            return r0
    }

    /* renamed from: b */
    public final p238nd.C4778u m7707b() {
            r1 = this;
            nd.u r0 = r1.f14210Z
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "dateManager"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: c */
    public final p238nd.C4728b0 m7708c() {
            r1 = this;
            nd.b0 r0 = r1.f14209Y
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: d */
    public final p238nd.C4732c1 m7709d() {
            r1 = this;
            nd.c1 r0 = r1.f14213c0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "nftPlayerToolManager"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: e */
    public final p238nd.C4753j1 m7710e() {
            r1 = this;
            nd.j1 r0 = r1.f14211a0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "preferenceStorage"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    /* renamed from: f */
    public final p238nd.C4756k1 m7711f() {
            r1 = this;
            nd.k1 r0 = r1.f14212b0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "secretToolManager"
            p214m2.C4339q.m9713w(r0)
            r0 = 0
            throw r0
    }

    @Override // android.app.Application
    public void onCreate() {
            r15 = this;
            java.lang.Class<nd.c> r0 = p238nd.C4730c.class
            super.onCreate()
            nd.u r1 = new nd.u
            r1.<init>(r15)
            r15.f14210Z = r1
            nd.j1 r1 = new nd.j1
            r1.<init>()
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r15, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r15.getPackageName()
            r2.append(r3)
            java.lang.String r3 = "_preferences"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            android.content.SharedPreferences r2 = r15.getSharedPreferences(r2, r3)
            java.lang.String r4 = "toolsHidden"
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L45
            android.content.SharedPreferences$Editor r4 = r2.edit()
            java.lang.String r5 = "toolsHidden"
            android.content.SharedPreferences$Editor r4 = r4.remove(r5)
            r4.apply()
        L45:
            java.lang.String r6 = "taco_data"
            r15.getApplicationContext()
            java.lang.String r4 = "_androidx_security_master_key_"
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            r11 = 1
            r12 = 0
            if (r5 < r7) goto L15a
            r5 = 256(0x100, float:3.59E-43)
            java.lang.String r7 = "NoPadding"
            java.lang.String r8 = "GCM"
            r9 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r10 = new android.security.keystore.KeyGenParameterSpec$Builder
            r10.<init>(r4, r9)
            java.lang.String[] r4 = new java.lang.String[]{r8}
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r10.setBlockModes(r4)
            java.lang.String[] r10 = new java.lang.String[]{r7}
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r4.setEncryptionPaddings(r10)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = r4.setKeySize(r5)
            android.security.keystore.KeyGenParameterSpec r4 = r4.build()
            java.lang.String r10 = "KeyGenParameterSpec was null after build() check"
            java.util.Objects.requireNonNull(r4, r10)
            int r10 = p228n1.C4670c.f18610a
            int r10 = r4.getKeySize()
            if (r10 != r5) goto L13e
            java.lang.String[] r5 = r4.getBlockModes()
            java.lang.String[] r8 = new java.lang.String[]{r8}
            boolean r5 = java.util.Arrays.equals(r5, r8)
            if (r5 == 0) goto L123
            int r5 = r4.getPurposes()
            if (r5 != r9) goto L10c
            java.lang.String[] r5 = r4.getEncryptionPaddings()
            java.lang.String[] r7 = new java.lang.String[]{r7}
            boolean r5 = java.util.Arrays.equals(r5, r7)
            if (r5 == 0) goto Lf1
            boolean r5 = r4.isUserAuthenticationRequired()
            if (r5 == 0) goto Lbc
            int r5 = r4.getUserAuthenticationValidityDurationSeconds()
            if (r5 < r11) goto Lb4
            goto Lbc
        Lb4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"
            r0.<init>(r1)
            throw r0
        Lbc:
            java.lang.String r5 = r4.getKeystoreAlias()
            java.lang.String r7 = "AndroidKeyStore"
            java.security.KeyStore r8 = java.security.KeyStore.getInstance(r7)
            r8.load(r12)
            boolean r5 = r8.containsAlias(r5)
            if (r5 != 0) goto Le7
            java.lang.String r5 = "AES"
            javax.crypto.KeyGenerator r5 = javax.crypto.KeyGenerator.getInstance(r5, r7)     // Catch: java.security.ProviderException -> Ldc
            r5.init(r4)     // Catch: java.security.ProviderException -> Ldc
            r5.generateKey()     // Catch: java.security.ProviderException -> Ldc
            goto Le7
        Ldc:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        Le7:
            java.lang.String r5 = r4.getKeystoreAlias()
            n1.b r7 = new n1.b
            r7.<init>(r5, r4)
            goto L15f
        Lf1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid padding mode, want NoPadding got "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String[] r2 = r4.getEncryptionPaddings()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L10c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r4.getPurposes()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L123:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid block mode, want GCM got "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String[] r2 = r4.getBlockModes()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L13e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid key size, want 256 bits got "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r4.getKeySize()
            r1.append(r2)
            java.lang.String r2 = " bits"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15a:
            n1.b r7 = new n1.b
            r7.<init>(r4, r12)
        L15f:
            n1.a$b r4 = p228n1.SharedPreferencesC4668a.b.f18603Z
            n1.a$c r5 = p228n1.SharedPreferencesC4668a.c.f18606Z
            java.lang.String r7 = r7.f18609a
            int r8 = p126h9.C2992b.f12081a
            h9.a r8 = new h9.a
            r8.<init>()
            p093f9.C2100r.m5552f(r8, r11)
            h9.c r8 = new h9.c
            r8.<init>()
            p093f9.C2100r.m5553g(r8)
            p112g9.C2299a.m6064a()
            android.content.Context r8 = r15.getApplicationContext()
            i9.a$b r9 = new i9.a$b
            r9.<init>()
            f9.f r4 = r4.f18605Y
            r9.f12510e = r4
            java.lang.String r4 = "__androidx_security_crypto_encrypted_prefs_key_keyset__"
            r9.m7576d(r8, r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "android-keystore://"
            r4.append(r10)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r10 = "android-keystore://"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L431
            r9.f12508c = r4
            i9.a r4 = r9.m7573a()
            monitor-enter(r4)
            f9.i r9 = r4.f12505b     // Catch: java.lang.Throwable -> L42e
            f9.h r9 = r9.m5530b()     // Catch: java.lang.Throwable -> L42e
            monitor-exit(r4)
            i9.a$b r4 = new i9.a$b
            r4.<init>()
            f9.f r5 = r5.f18608Y
            r4.f12510e = r5
            java.lang.String r5 = "__androidx_security_crypto_encrypted_prefs_value_keyset__"
            r4.m7576d(r8, r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "android-keystore://"
            r5.append(r10)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "android-keystore://"
            boolean r10 = r5.startsWith(r10)
            if (r10 == 0) goto L426
            r4.f12508c = r5
            i9.a r4 = r4.m7573a()
            monitor-enter(r4)
            f9.i r5 = r4.f12505b     // Catch: java.lang.Throwable -> L423
            f9.h r5 = r5.m5530b()     // Catch: java.lang.Throwable -> L423
            monitor-exit(r4)
            java.lang.Class<f9.c> r4 = p093f9.InterfaceC2085c.class
            java.lang.Object r4 = r9.m5526b(r4)
            r10 = r4
            f9.c r10 = (p093f9.InterfaceC2085c) r10
            java.lang.Class<f9.a> r4 = p093f9.InterfaceC2083a.class
            java.lang.Object r4 = r5.m5526b(r4)
            r9 = r4
            f9.a r9 = (p093f9.InterfaceC2083a) r9
            n1.a r4 = new n1.a
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r6, r3)
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r5 = "old"
            p214m2.C4339q.m9706k(r2, r5)
            java.lang.String r5 = "new"
            p214m2.C4339q.m9706k(r4, r5)
            java.util.Map r5 = r2.getAll()
            java.lang.String r6 = "old.all"
            p214m2.C4339q.m9705j(r5, r6)
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r11
            if (r5 == 0) goto L304
            java.lang.String r5 = "<this>"
            p214m2.C4339q.m9706k(r2, r5)
            java.lang.String r6 = "dest"
            p214m2.C4339q.m9706k(r4, r6)
            java.util.Map r6 = r2.getAll()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L234:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L304
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.getValue()
            java.lang.String r9 = "key"
            p214m2.C4339q.m9705j(r8, r9)
            p214m2.C4339q.m9706k(r4, r5)
            p214m2.C4339q.m9706k(r8, r9)
            if (r7 != 0) goto L259
            r9 = 1
            goto L25b
        L259:
            boolean r9 = r7 instanceof java.lang.String
        L25b:
            java.lang.String r10 = "editor"
            if (r9 == 0) goto L270
            android.content.SharedPreferences$Editor r9 = r4.edit()
            p214m2.C4339q.m9705j(r9, r10)
            java.lang.String r7 = (java.lang.String) r7
            r10 = r9
            n1.a$a r10 = (p228n1.SharedPreferencesC4668a.a) r10
            r10.putString(r8, r7)
            goto L2fd
        L270:
            boolean r9 = r7 instanceof java.lang.Integer
            if (r9 == 0) goto L289
            android.content.SharedPreferences$Editor r9 = r4.edit()
            p214m2.C4339q.m9705j(r9, r10)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r10 = r9
            n1.a$a r10 = (p228n1.SharedPreferencesC4668a.a) r10
            r10.putInt(r8, r7)
            goto L2fd
        L289:
            boolean r9 = r7 instanceof java.lang.Boolean
            if (r9 == 0) goto L2a1
            android.content.SharedPreferences$Editor r9 = r4.edit()
            p214m2.C4339q.m9705j(r9, r10)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r10 = r9
            n1.a$a r10 = (p228n1.SharedPreferencesC4668a.a) r10
            r10.putBoolean(r8, r7)
            goto L2fd
        L2a1:
            boolean r9 = r7 instanceof java.lang.Float
            if (r9 == 0) goto L2b9
            android.content.SharedPreferences$Editor r9 = r4.edit()
            p214m2.C4339q.m9705j(r9, r10)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            r10 = r9
            n1.a$a r10 = (p228n1.SharedPreferencesC4668a.a) r10
            r10.putFloat(r8, r7)
            goto L2fd
        L2b9:
            boolean r9 = r7 instanceof java.lang.Long
            if (r9 == 0) goto L2d1
            android.content.SharedPreferences$Editor r9 = r4.edit()
            p214m2.C4339q.m9705j(r9, r10)
            java.lang.Number r7 = (java.lang.Number) r7
            long r13 = r7.longValue()
            r7 = r9
            n1.a$a r7 = (p228n1.SharedPreferencesC4668a.a) r7
            r7.putLong(r8, r13)
            goto L2fd
        L2d1:
            boolean r9 = r7 instanceof java.util.Set
            if (r9 == 0) goto L234
            android.content.SharedPreferences$Editor r9 = r4.edit()
            p214m2.C4339q.m9705j(r9, r10)
            if (r7 == 0) goto L2e1
            java.util.Set r7 = (java.util.Set) r7     // Catch: java.lang.Throwable -> L2e9
            goto L2ee
        L2e1:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2e9
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L2e9
            throw r7     // Catch: java.lang.Throwable -> L2e9
        L2e9:
            r7 = move-exception
            java.lang.Object r7 = p074e9.C1805a.m4520e(r7)
        L2ee:
            dh.m r10 = p062dh.C1477m.f7239Y
            boolean r13 = r7 instanceof ch.C0979f.a
            if (r13 == 0) goto L2f5
            r7 = r10
        L2f5:
            java.util.Set r7 = (java.util.Set) r7
            r10 = r9
            n1.a$a r10 = (p228n1.SharedPreferencesC4668a.a) r10
            r10.putStringSet(r8, r7)
        L2fd:
            n1.a$a r9 = (p228n1.SharedPreferencesC4668a.a) r9
            r9.apply()
            goto L234
        L304:
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.clear()
            r2.apply()
            r1.f19056a = r4
            r15.f14211a0 = r1
            nd.j1 r1 = r15.m7710e()
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r15, r2)
            java.lang.String r2 = "preferenceStorage"
            p214m2.C4339q.m9706k(r1, r2)
            nd.v0 r2 = p238nd.C4781v0.f19121e
            if (r2 != 0) goto L341
            java.lang.Class<nd.v0> r2 = p238nd.C4781v0.class
            monitor-enter(r2)
            nd.v0 r4 = p238nd.C4781v0.f19121e     // Catch: java.lang.Throwable -> L33e
            if (r4 != 0) goto L33c
            nd.v0 r4 = new nd.v0     // Catch: java.lang.Throwable -> L33e
            android.content.Context r5 = r15.getApplicationContext()     // Catch: java.lang.Throwable -> L33e
            java.lang.String r6 = "context.applicationContext"
            p214m2.C4339q.m9705j(r5, r6)     // Catch: java.lang.Throwable -> L33e
            r4.<init>(r5, r1, r12)     // Catch: java.lang.Throwable -> L33e
            p238nd.C4781v0.f19121e = r4     // Catch: java.lang.Throwable -> L33e
        L33c:
            monitor-exit(r2)
            goto L341
        L33e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L341:
            nd.b0$a r1 = p238nd.C4728b0.f18900D
            nd.u r6 = r15.m7707b()
            io.tacocrypto.app.database.AppDatabase r7 = r15.m7706a()
            monitor-enter(r1)
            java.lang.String r2 = "dateManager"
            p214m2.C4339q.m9706k(r6, r2)     // Catch: java.lang.Throwable -> L420
            java.lang.String r2 = "appDatabase"
            p214m2.C4339q.m9706k(r7, r2)     // Catch: java.lang.Throwable -> L420
            nd.b0 r2 = p238nd.C4728b0.f18901E     // Catch: java.lang.Throwable -> L420
            if (r2 != 0) goto L369
            nd.b0 r2 = new nd.b0     // Catch: java.lang.Throwable -> L420
            vg.s r8 = new vg.s     // Catch: java.lang.Throwable -> L420
            r8.<init>(r3, r11)     // Catch: java.lang.Throwable -> L420
            r9 = 0
            r4 = r2
            r5 = r15
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L420
            p238nd.C4728b0.f18901E = r2     // Catch: java.lang.Throwable -> L420
        L369:
            monitor-exit(r1)
            nd.b0 r1 = r1.m10809a()
            r15.f14209Y = r1
            java.lang.String r1 = "context"
            p214m2.C4339q.m9706k(r15, r1)
            nd.c r1 = p238nd.C4730c.f18962j
            if (r1 != 0) goto L393
            monitor-enter(r0)
            nd.c r1 = p238nd.C4730c.f18962j     // Catch: java.lang.Throwable -> L390
            if (r1 != 0) goto L38e
            nd.c r1 = new nd.c     // Catch: java.lang.Throwable -> L390
            android.content.Context r2 = r15.getApplicationContext()     // Catch: java.lang.Throwable -> L390
            java.lang.String r3 = "context.applicationContext"
            p214m2.C4339q.m9705j(r2, r3)     // Catch: java.lang.Throwable -> L390
            r1.<init>(r2, r12)     // Catch: java.lang.Throwable -> L390
            p238nd.C4730c.f18962j = r1     // Catch: java.lang.Throwable -> L390
        L38e:
            monitor-exit(r0)
            goto L393
        L390:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L393:
            nd.c r1 = p238nd.C4730c.f18962j
            p214m2.C4339q.m9704i(r1)
            nd.j1 r1 = r15.m7710e()
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r15, r2)
            java.lang.String r2 = "preferenceStorage"
            p214m2.C4339q.m9706k(r1, r2)
            nd.k1 r2 = p238nd.C4756k1.f19057g
            if (r2 != 0) goto L3bb
            monitor-enter(r0)
            nd.k1 r2 = p238nd.C4756k1.f19057g     // Catch: java.lang.Throwable -> L3b8
            if (r2 != 0) goto L3b6
            nd.k1 r2 = new nd.k1     // Catch: java.lang.Throwable -> L3b8
            r2.<init>(r15, r1, r12)     // Catch: java.lang.Throwable -> L3b8
            p238nd.C4756k1.f19057g = r2     // Catch: java.lang.Throwable -> L3b8
        L3b6:
            monitor-exit(r0)
            goto L3bb
        L3b8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L3bb:
            nd.k1 r1 = p238nd.C4756k1.f19057g
            p214m2.C4339q.m9704i(r1)
            r15.f14212b0 = r1
            io.tacocrypto.app.database.AppDatabase r1 = r15.m7706a()
            java.lang.String r2 = "context"
            p214m2.C4339q.m9706k(r15, r2)
            java.lang.String r2 = "appDatabase"
            p214m2.C4339q.m9706k(r1, r2)
            nd.c1 r2 = p238nd.C4732c1.f18978d
            if (r2 != 0) goto L3e5
            monitor-enter(r0)
            nd.c1 r2 = p238nd.C4732c1.f18978d     // Catch: java.lang.Throwable -> L3e2
            if (r2 != 0) goto L3e0
            nd.c1 r2 = new nd.c1     // Catch: java.lang.Throwable -> L3e2
            r2.<init>(r15, r1, r12)     // Catch: java.lang.Throwable -> L3e2
            p238nd.C4732c1.f18978d = r2     // Catch: java.lang.Throwable -> L3e2
        L3e0:
            monitor-exit(r0)
            goto L3e5
        L3e2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L3e5:
            nd.c1 r0 = p238nd.C4732c1.f18978d
            p214m2.C4339q.m9704i(r0)
            r15.f14213c0 = r0
            nd.j1 r0 = r15.m7710e()
            java.lang.String r1 = "context"
            p214m2.C4339q.m9706k(r15, r1)
            java.lang.String r1 = "preferenceStorage"
            p214m2.C4339q.m9706k(r0, r1)
            nd.q r1 = p238nd.C4770q.f19093a
            if (r1 != 0) goto L41a
            java.lang.Class<nd.q> r1 = p238nd.C4770q.class
            monitor-enter(r1)
            nd.q r2 = p238nd.C4770q.f19093a     // Catch: java.lang.Throwable -> L417
            if (r2 != 0) goto L415
            nd.q r2 = new nd.q     // Catch: java.lang.Throwable -> L417
            android.content.Context r3 = r15.getApplicationContext()     // Catch: java.lang.Throwable -> L417
            java.lang.String r4 = "context.applicationContext"
            p214m2.C4339q.m9705j(r3, r4)     // Catch: java.lang.Throwable -> L417
            r2.<init>(r3, r0, r12)     // Catch: java.lang.Throwable -> L417
            p238nd.C4770q.f19093a = r2     // Catch: java.lang.Throwable -> L417
        L415:
            monitor-exit(r1)
            goto L41a
        L417:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L41a:
            nd.q r0 = p238nd.C4770q.f19093a
            p214m2.C4339q.m9704i(r0)
            return
        L420:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L423:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L426:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "key URI must start with android-keystore://"
            r0.<init>(r1)
            throw r0
        L42e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L431:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "key URI must start with android-keystore://"
            r0.<init>(r1)
            throw r0
    }
}
